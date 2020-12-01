package org.achainarong.exercisesix;

import java.io.IOException;

public class CharArrayOps {

    public static char[] readInputAndReturnCharArray(String entryMessage) throws IOException {
        int bufferArrayLength = 4000;
        int workingCharArrayMinLength = 0;

        var bufferCharArray = new char[bufferArrayLength];

        System.out.println(entryMessage);

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

    public static char[] deleteCharXFromArray(char[] charArrayToWorkWith, char charToDelete) throws IOException {
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

        return newCharArray;
    }

    public static int CheckIfCharrayContainsSubArray(char[] mainCharArray, char[] subCharArray) throws IOException {
        if (mainCharArray.length < subCharArray.length) {
            return -1;
        }

        for (int j = 0; j < mainCharArray.length; j++) {
            if (j + subCharArray.length > mainCharArray.length) {
                return -1;
            }

            int currentIndex = j;

            for (int i = 0; i < subCharArray.length; i++) {
                if (mainCharArray[currentIndex] == subCharArray[i]) {
                    if ((subCharArray.length - 1) == i) {

                        return i; // returns the first position of the found substring
                    }
                    currentIndex++;
                }
            }
        }
        return -1;
    }

    public static char[] setCharAtX(char[] charArrayToWorkWith, char numberChar) throws IOException {

        int changeCharAt = 0;

        if (numberChar >= '1' && numberChar <= '9') {
            changeCharAt = (numberChar - '1');

            if (changeCharAt > charArrayToWorkWith.length) {
                throw new IllegalArgumentException("The provided number was higher than the existing string");
            }
        } else {
            throw new IllegalArgumentException("Only number from 1 to 9 are allowed!");
        }

        for (int i = 0; i < charArrayToWorkWith.length; i++) {
            if (i == changeCharAt) {
                charArrayToWorkWith[i] = '-'; // do nothing because we "delete" the char
            }
        }
        return charArrayToWorkWith;
    }

    public static char[] deleteCharAtX(char[] charArrayToWorkWith, char numberChar) throws IOException {
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

        char[] newCharArray = new char[newCharArrayLenght];

        int currentCharIndex = 0;

        for (int i = 0; i < charArrayToWorkWith.length; i++) {
            if (i == deleteCharAt) {
                continue; // do nothing because we "delete" the char
            }

            newCharArray[currentCharIndex] = charArrayToWorkWith[i];
            currentCharIndex++;
        }

        return newCharArray;

    }

    public static char[] exchangeCharactersByParameterInput(char[] charArrayToWorkWith, char charToReplace,
            char replacingChar) throws IOException {

        for (int j = 0; j < charArrayToWorkWith.length; j++) {
            if (charArrayToWorkWith[j] == charToReplace) {
                charArrayToWorkWith[j] = replacingChar; // exchangign the characters
            }
        }

        return charArrayToWorkWith;
    }
}
