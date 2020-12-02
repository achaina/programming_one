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
        System.out.println(HideInfo.doExercise("Ich bin ein Test String o ä ü ö".toCharArray()));
    }
}
