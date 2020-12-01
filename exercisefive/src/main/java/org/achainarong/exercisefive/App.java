package org.achainarong.exercisefive;

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
        BetterHourGlass.printAllHorizontal(5, 3, 3);

        // UnicodeCharacterReader.getCharacterFromUnicodeString();
    }
}
