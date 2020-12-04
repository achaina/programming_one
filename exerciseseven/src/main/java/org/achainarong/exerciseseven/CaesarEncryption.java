package org.achainarong.exerciseseven;

public class CaesarEncryption {
    public static char[] shiftCharArrayByPosition(char[] charArray, int pos) {

        if (pos < 1) {
            throw new IllegalArgumentException("can only shift by 1 or more");
        }

        for (int i = 0; i < charArray.length; i++) {

            char currentChar = charArray[i];

            char endChar = 'z';

            char startChar = 'a';

            if (currentChar + pos > endChar) {

                char shiftlength = (char) (endChar - startChar + 1);
                char newChar = (char) ((currentChar + pos) - shiftlength);
                charArray[i] = newChar;
            } else {
                charArray[i] = charArray[i] += pos;
            }
        }

        return charArray;
    }

    private static char getShiftedCharWhenPassingEndChar(char character, char shiftingChar) {
        char startChar = 'a';
        char endChar = 'z';

        char shiftlength = (char) (endChar - startChar + 1);
        char newChar = (char) ((character + shiftingChar - startChar) - shiftlength);

        return newChar;
    }

    public static char[] vigenereEncryption(char[] charArray, char[] shiftArray) {
        int runs = shiftArray.length;

        for (int i = 0; i < charArray.length; i += runs) {
            for (int j = 0; j < runs && j + i < charArray.length; j++) {

                char shiftChar = shiftArray[j];
                char currentChar = charArray[i + j];
                char charToBe = (char) (shiftChar - 'a' + currentChar);
                if (charToBe > 'z') {
                    charArray[j + i] = getShiftedCharWhenPassingEndChar(currentChar, shiftChar);
                } else {
                    charArray[j + i] = (char) (currentChar + (shiftChar - 'a'));
                }
            }
        }

        return charArray;
    }
}
