package org.achainarong.exercisesix;

import java.io.IOException;

public class CharArrayProcessing {

    private char[] readInputAndReturnCharArray() throws IOException {
        int bufferArrayLength = 4000;
        int workingCharArrayMinLength = 0;

        var bufferCharArray = new char[bufferArrayLength];

        System.out.println("Geben Sie ihre Zeichen ein!");

        for (int i = 0; i < bufferArrayLength; i++) {
            char currentChar = (char) System.in.read();

            if (currentChar == '\r' || currentChar == '\n') {
                break;
            } else if (currentChar == '\s') {
                continue; // do nothingc
            }

            bufferCharArray[i] = currentChar;
            workingCharArrayMinLength++;
        }

        var charArrayToWorkWith = new char[workingCharArrayMinLength];

        for (int j = 0; j < workingCharArrayMinLength; j++) {
            charArrayToWorkWith[j] = bufferCharArray[j];
        }

        return charArrayToWorkWith;
    }

    public void exchangeCharactersByParameterInput() throws IOException {

        var charArrayToWorkWith = readInputAndReturnCharArray();

        System.out.println(" Geben Sie nun die Buchstaben an die vertauscht werden sollen in dieser Form a->b!");

        char charToReplace = ' ';
        char replacingChar = ' ';

        for (int k = 0; k < 4; k++) {
            char paramChar = (char) System.in.read();

            if (k == 0) {
                if (paramChar >= 'a' && paramChar <= 'z') {
                    charToReplace = paramChar;
                } else {
                    throw new IllegalArgumentException("Nur a-z sind als Eingabe auf der ersten Zeile erlaubt!");
                }
            } else if (k == 1) {
                if (paramChar != '-') {
                    throw new IllegalArgumentException("Nur - ist als Eingabe auf der zweiten Zeile erlaubt!");
                }
            } else if (k == 2) {
                if (paramChar != '>') {

                    throw new IllegalArgumentException("Nur > ist als Eingabe auf der dritten ten Zeile erlaubt!");
                }
            } else if (k == 3) {
                if (paramChar >= 'a' && paramChar <= 'z') {
                    replacingChar = paramChar;
                } else {
                    throw new IllegalArgumentException("Nur a-z sind als Eingabe auf der letzten Zeile erlaubt!");
                }
            }
        }

        for (int j = 0; j < charArrayToWorkWith.length; j++) {
            if (charArrayToWorkWith[j] == charToReplace) {
                charArrayToWorkWith[j] = replacingChar; // exchangign the characters
            }
        }

        System.out.println("Die Charaktere wurden ersetzt");
        System.out.println(charArrayToWorkWith);
    }
}
