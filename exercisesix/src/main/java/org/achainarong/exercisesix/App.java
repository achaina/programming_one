package org.achainarong.exercisesix;

import java.io.IOException;

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
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        var charArray = "Ich bin ein String der in ein CharArray umgewandelt werden".toCharArray();

        charArray = HideInfo.ExchangeEWithIAndAWithU(charArray);
        charArray = HideInfo.exchangeOWithI(charArray);
        charArray = HideInfo.putCharInBetween(charArray);
        charArray = HideInfo.putSecretCharInBetween(charArray);
        charArray = HideInfo.deleteAllVocals(charArray);
        System.out.println(charArray);
    }
}
