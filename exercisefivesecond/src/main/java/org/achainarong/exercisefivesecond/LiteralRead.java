package org.achainarong.exercisefivesecond;

public class LiteralRead {
    public static void readLiteral(String[] args) throws Exception {

        // enum zum prüfen des States
        final int STATE_INITIAL = 0;
        final int STATE_SIGN = 1;
        final int STATE_DEC = 2;
        final int STATE_WRONG = 3;
        final int STATE_COMPL = 4;
        final int STATE_CLEAR = 5;

        int currentState = STATE_INITIAL;
        int column = 0;
        int sign = 1;
        int value = 0;

        System.out.println("enter decimal literal");
        while (true) {
            char c = (char) System.in.read();
            column++;

            switch (currentState) {
                // runs only in the first run
                case (STATE_INITIAL):
                    // reset values
                    value = 0;
                    sign = 1;
                    column = 1;

                    // exits the program
                    if ((c == 'q') || (c == 'Q')) {
                        System.out.println("bye");
                        return;
                    }

                    // sets stat to declaration when char c is char value is {1; ...; 9 }
                    else if ('1' <= c && c <= '9')
                        currentState = STATE_DEC;
                    else if (c == '0') {
                        // For now simply allow cipher 0 at every position of a decimal literal,
                        // which is strictly speaking not right for column 1.
                        // But this is the right hook for
                        // your extension concerning hex and oct literals, both starting with 0
                        currentState = STATE_DEC;
                    } else if ((c == '+') || (c == '-'))
                        currentState = STATE_SIGN;
                    else if ((c == '\r') || (c == '\n'))
                        ; // still no real input, nothing to do

                    // if something unexpected happens state is changed to wrong
                    else
                        currentState = STATE_WRONG;
                    break;

                // if the first char in given parameter is a plus or minus and the second on is
                // not a valid number, the state changed to wrong
                case (STATE_SIGN):
                    if ('0' <= c && c <= '9')
                        currentState = STATE_DEC;
                    else
                        currentState = STATE_WRONG;
                    break;

                // when new line is detected the reading of the value finishes and the state
                // changes to complete
                case (STATE_DEC):
                    if ('0' <= c && c <= '9') { // nothing to do
                    } else if ((c == '\r') || (c == '\n'))
                        currentState = STATE_COMPL;
                    else
                        currentState = STATE_WRONG;
                    break;

                // sets the inital state again
                case (STATE_CLEAR):
                    if ((c == '\r') || (c == '\n'))
                        currentState = STATE_INITIAL;
                    break;

                default:
                    System.out.println("Unknown State: " + currentState);
            }

            // when newline is detected the state is reset to initial else it gonne be in
            // state clear and gets reset to initial when a newline is detected
            if (currentState == STATE_WRONG) {
                System.out.println("Fehlerhafte Eingabe an Position : " + column);
                if ((c == '\r') || (c == '\n'))
                    currentState = STATE_INITIAL;
                else
                    currentState = STATE_CLEAR;
                continue;
            }

            if (currentState == STATE_COMPL) {
                System.out.println("ermittelter int-Wert: " + value);
                currentState = STATE_INITIAL;
                continue;
            }

            // now interpret unicode character
            int cipherValue = 0;
            if ('0' <= c && c <= '9')

                // hack to get the int value from the character
                cipherValue = c - '0';
            else if (c == '-')
                // default value of sign is 1
                sign = -1;

            // apply Horner
            switch (currentState) {
                case (STATE_DEC):
                    // Kontrollfrage: Warum die Fallunterscheidung fuer neg. bzw. pos. Vorzeichen
                    // und nicht einfach zum Schluss sign * errechneter Betrag ?
                    if (sign > 0)
                        if ((Integer.MAX_VALUE - cipherValue) / 10 >= value)
                            value = value * 10 + cipherValue;
                        else {
                            System.out.println("Zahl zu gross");
                            currentState = STATE_CLEAR;
                        }

                    if (sign < 0)
                        if ((Integer.MIN_VALUE + cipherValue) / 10 <= value)
                            value = value * 10 - cipherValue;
                        else {
                            System.out.println("Zahl zu klein");
                            currentState = STATE_CLEAR;
                        }

                    break;
            }
        }
    }
}