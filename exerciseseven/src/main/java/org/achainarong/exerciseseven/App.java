package org.achainarong.exerciseseven;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    /**
     * Says hello to the world.
     * 
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        // var newCharArray =
        // CaesarEncryption.shiftCharArrayByPosition("abcdefyz".toCharArray(), 2);

        // var newCharArray = CaesarEncryption.vigenereEncryption("zzz".toCharArray(),
        // "abc".toCharArray());
        // System.out.println(newCharArray);

        char[] key = "jklmnbvcxzpoiuytrewqasdfgh".toCharArray();
        char[] randomCharArray = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] decryptionKey = Crypto.genereatePairForKey(key);
        System.out.println(Crypto.encrypt(randomCharArray, key));
        System.out.println(Crypto.decrypt(randomCharArray, decryptionKey));

    }
}


