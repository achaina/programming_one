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
        int position = 2;
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

    public static char[] doExercise(char[] charArray) throws IOException {
        // var charArray = "Ich bin ein String der in ein CharArray umgewandelt
        // werden".toCharArray();

        // passing a char should be call by reference
        // it is not actually needed to return the chararray because it was allready
        // manipulated with in th method

        charArray = HideInfo.ExchangeEWithIAndAWithU(charArray);
        charArray = HideInfo.exchangeOWithI(charArray);
        charArray = HideInfo.putCharInBetween(charArray);
        charArray = HideInfo.putSecretCharInBetween(charArray);
        charArray = HideInfo.deleteAllVocals(charArray);
        return charArray;
    }
}
