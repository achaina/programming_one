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

                char shiftlength = (char) (endChar - startChar);
                char newChar = (char) ((currentChar + pos) - shiftlength);
                charArray[i] = newChar;
            } else {
                charArray[i] = charArray[i] += pos;
            }
        }

        return charArray;
    }
}
