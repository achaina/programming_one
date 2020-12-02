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

        // returning the array is not really necessary because the reference was passed
        // and manipulated
        // usually if the given array should not be touched and only a copy of the
        // existing array is made to work on it and return it
        var newCharArray = HideInfo.doExercise("Ich bin ein Test String o ä ü ö".toCharArray());
        CharArrayOps.consoleOutCharArray(newCharArray);
    }
}
