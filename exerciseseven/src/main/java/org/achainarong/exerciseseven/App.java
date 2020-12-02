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
        var newCharArray = CaesarEncryption.shiftCharArrayByPosition("abcdefyz".toCharArray(), 2);
        System.out.println(newCharArray);
    }
}
