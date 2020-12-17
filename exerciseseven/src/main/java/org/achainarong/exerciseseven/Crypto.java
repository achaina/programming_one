package org.achainarong.exerciseseven;

public class Crypto {

    public static char[] encrypt(char[] charArrayToEncrypt, char[] key) {
        return shiftCharArrayByKey(charArrayToEncrypt, key);
    }

    public static char[] decrypt(char[] charArrayToEncrypt, char[] key) {
        return shiftCharArrayByKey(charArrayToEncrypt, key);
    }

    private static char[] shiftCharArrayByKey(char[] charArrayToEncrypt, char[] key)
    [
        for (int i = 0; i < charArrayToEncrypt.length; i++) {
            var encryptedKey = key[charArrayToEncrypt[i] - 'a'];
            charArrayToEncrypt[i] = encryptedKey;
        }

        return charArrayToEncrypt;
    ]

    public static char[] genereatePairForKey(char[] key) {

        var newKeyCharArray = new char[26];

        for (int i = 0; i < key.length; i++) {
            var currentChar = key[i];
            int newIndex = currentChar - 'a';

            newKeyCharArray[newIndex] = (char) ('a' + i);
        }

        return newKeyCharArray;
    }
}