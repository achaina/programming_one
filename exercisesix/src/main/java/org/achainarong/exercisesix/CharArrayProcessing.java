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

        // copy the array
        for (int j = 0; j < workingCharArrayMinLength; j++) {
            charArrayToWorkWith[j] = bufferCharArray[j];
        }

        return charArrayToWorkWith;
    }

    public void deleteCharXFromArray() throws IOException {
        var charArrayToWorkWith = readInputAndReturnCharArray();
        System.out.println("Geben Sie das Zeichen an welche gelöscht werden soll!");

        char charToDelete = (char) System.in.read();

        int newArrayLength = 0;
        for (int i = 0; i < charArrayToWorkWith.length; i++) {
            if (charArrayToWorkWith[i] != charToDelete) {
                newArrayLength++;
            }
        }

        var newCharArray = new char[newArrayLength];

        int charArrayCurrentIndex = 0;

        for (int i = 0; i < charArrayToWorkWith.length; i++) {
            if (charArrayToWorkWith[i] != charToDelete) {
                newCharArray[charArrayCurrentIndex] = charArrayToWorkWith[i];
                charArrayCurrentIndex++;
            }
        }

        System.out.println(newCharArray);
    }

    public void deleteCharAtX() throws IOException {
        var charArrayToWorkWith = readInputAndReturnCharArray();
        System.out.println("Geben Sie die Stelle (z.B 3) an, an der ein Character gelöscht werden soll");

        char numberChar = (char) System.in.read();

        int newCharArrayLenght;
        int deleteCharAt = 0;

        if (numberChar >= '1' && numberChar <= '9') {
            deleteCharAt = (numberChar - '1');

            if (deleteCharAt > charArrayToWorkWith.length) {
                throw new IllegalArgumentException("The provided number was higher than the existing string");
            }

            newCharArrayLenght = charArrayToWorkWith.length - 1;
        } else {
            throw new IllegalArgumentException("Only number from 1 to 9 are allowed!");
        }

        char[] newCharray = new char[newCharArrayLenght];

        int currentCharIndex = 0;

        for (int i = 0; i < charArrayToWorkWith.length; i++) {
            if (i == deleteCharAt) {
                continue; // do nothing because we "delete" the char
            }

            newCharray[currentCharIndex] = charArrayToWorkWith[i];
            currentCharIndex++;
        }

        System.out.println(newCharray);

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
