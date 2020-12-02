package org.achainarong.exercisesix;

import java.io.IOException;
import java.util.Random;

public class HideInfo {
    public static char[] ExchangeEWithIAndAWithU(char[] charArray) throws IOException {
        var exchangedCharArray = CharArrayOps.exchangeCharactersByParameterInput(charArray, 'e', 'i');
        exchangedCharArray = CharArrayOps.exchangeCharactersByParameterInput(exchangedCharArray, 'e', 'i');

        return exchangedCharArray;
    }

    // test
    public static char[] putCharInBetween(char[] charArray) throws IOException {

        char placeholderChar = 'e';
        int position = 2;
        return CharArrayOps.setCharAtEveryPositionX(charArray, position, placeholderChar);

    }

    public static char[] putSecretCharInBetween(char[] charArray) throws IOException {
        int position = 3;
        return CharArrayOps.setCharAtEveryPositionXWithSecret(charArray, position);
    }

    public static char[] deleteAllVocals(char[] charArray) throws IOException {
        char[] charToAdd = new char[] { 'a', 'e', 'i', 'o', 'u', 'ö', 'ä', 'ü' };
        for (char c : charToAdd) {
            charArray = CharArrayOps.deleteCharXFromArray(charArray, c);
        }

        return charArray;
    }

    public static char[] exchangeOWithI(char[] charArray) throws IOException {
        return CharArrayOps.exchangeCharactersByParameterInput(charArray, 'o', 'i');
    }
}
