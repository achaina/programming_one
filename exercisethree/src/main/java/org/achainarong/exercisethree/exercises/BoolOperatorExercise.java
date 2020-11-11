package org.achainarong.exercisethree.exercises;

import java.io.IOException;

// Konjunktion = &&
// Disjunktion = ||
// Negattion = !
// Xor (Exclusive OR) = ^ 
public class BoolOperatorExercise {
    public static void AnalyseMeMethod() {
        // initialisierung von zwei variablen des Typs boolean mit Wert "false"
        boolean op1 = false;
        boolean op2 = false;

        // Augabe des Wertes der Variable op2 sowohl dem zugewiesenen als auch dem
        // negierten in einer Zeile damit dies in der Konsole als Tabelle dargestellt
        // wird
        System.out.println(" &&   | " + op2 + " | " + !op2);
        System.out.println("------|-------|------");

        // Der Wert von op1 wird ausgegeben
        // Vergleichen von ob op1 und op2 beide True sind (Konjunktion)
        // Vergleich ob op1 und der negierte Wert von op2 True sind (Konjunktion)
        System.out.println(op1 + " | " + (op1 && op2) + " | " + (op1 && !op2));

        // Der Variable op1 wird nun sein eigener negierter Wert zugewiesen, was
        // bedeutet das op1 nun True ist
        op1 = !op1;

        // Der Wert von op1 wird ausgegeben
        // Vergleichen von ob op1 und op2 beide True sind (Konjunktion)
        // Vergleich ob op1 und der negierte Wert von op2 True sind (Konjunktion)
        // Da op1 nun True ist und der negierte Wert von op2 auch True ist bedeutet es
        // Konjunktion True ist
        System.out.println(op1 + "  | " + (op1 && op2) + " | " + (op1 && !op2));

    }

    // Copy paste von der Methode AnalyseMe bloß das anstatt der "und" Operator der
    // "oder Operator verwendet wird
    public static void OrOperator() {
        boolean op1 = false;
        boolean op2 = false;

        System.out.println(" ||   | " + op2 + " | " + !op2);
        System.out.println("------|-------|------");

        System.out.println(op1 + " | " + (op1 || op2) + " | " + (op1 || !op2));

        op1 = !op1;

        System.out.println(op1 + "  | " + (op1 || op2) + " | " + (op1 || !op2));
    }

    public static void XorOperator() {
        boolean op1 = false;
        boolean op2 = false;

        System.out.println(" ^   | " + op2 + " | " + !op2);
        System.out.println("------|-------|------");

        System.out.println(op1 + " | " + (op1 ^ op2) + " | " + (op1 ^ !op2));

        op1 = !op1;

        System.out.println(op1 + "  | " + (op1 ^ op2) + " | " + (op1 ^ !op2));
    }

    public static void BitwiseOrOperatorTable() {

        boolean op1 = false;
        boolean op2 = false;

        System.out.println(" |   | " + op2 + " | " + !op2);
        System.out.println("------|-------|------");

        System.out.println(op1 + " | " + (op1 | op2) + " | " + (op1 | !op2));

        op1 = !op1;

        System.out.println(op1 + "  | " + (op1 | op2) + " | " + (op1 | !op2));
    }

    public static void BitwiseOrOperatorNumbers() {

        // 0110
        int a = 6;

        // 0100
        int b = 4;

        // hier werden die Bits der jeweiligen Integerwerten Verglichen (Disjunktion)

        // 0110
        // +0100
        // ------
        // 0110
        int result = a | b;

        System.out.println("Bitwise or operator 6 + 4 = " + result);
    }

    public static void BitwiseAndOperatorTable() {

        boolean op1 = false;
        boolean op2 = false;

        System.out.println(" &   | " + op2 + " | " + !op2);
        System.out.println("------|-------|------");

        System.out.println(op1 + " | " + (op1 & op2) + " | " + (op1 & !op2));

        op1 = !op1;

        System.out.println(op1 + "  | " + (op1 & op2) + " | " + (op1 & !op2));
    }

    public static void BitwiseAndOperatorNumbers() {

        // 0110
        int a = 6;

        // 0100
        int b = 4;

        // hier werden die Bits der jeweiligen Integerwerten Verglichen (Konjunktion)

        // 0110
        // +0100
        // ------
        // 0100
        int result = a & b;

        System.out.println("Bitwise and operator 6 + 4 = " + result);
    }

    public static void ReadBoolOperator() {
        try {
            // reading the input as int and casting as a char

            String scannedLine = System.console().readLine("Enter your bool operands and operators: ");

            char[] scannedCharArray = scannedLine.toCharArray();

            // example with System.in.read()
            // char[] scannedCharArray = SystemInReadExample();

            // just initializing this variable for verbose purpose
            char operator = scannedCharArray[1];

            // parsing and intilizing the bool values for the operation
            boolean boolValueOfFirstOperand = ConvertBooleanCharToDatatypeBoolean(scannedCharArray[0]);
            boolean boolValueOfSecondOperand = ConvertBooleanCharToDatatypeBoolean(scannedCharArray[2]);

            boolean result = switch (operator) {
                case '^' -> boolValueOfFirstOperand ^ boolValueOfSecondOperand;
                case '|' -> boolValueOfFirstOperand | boolValueOfSecondOperand;
                case '&' -> boolValueOfFirstOperand & boolValueOfSecondOperand;
                default -> throw new IllegalArgumentException(
                        "Operator " + operator + " is not permitted as an Argument!");
            };

            System.out.println("The result is: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static char[] SystemInReadExample() throws IOException {
        char[] scannedCharacters = new char[3];

        for (int i = 0; i < 3; i++) {
            scannedCharacters[i] = (char) System.in.read();
        }

        return scannedCharacters;
    }

    private static boolean ConvertBooleanCharToDatatypeBoolean(char boolChar) {

        // the return of the boolean value will break the method and the exception
        // should not be thrown
        switch (boolChar) {
            case 'f':
            case 'F':
                return false;
            case 't':
            case 'T':
                return true;
        }

        // this is only thrown when no value could be determined
        throw new IllegalArgumentException("The operand " + boolChar + " is not permitted as an Argument!");
    }
}
