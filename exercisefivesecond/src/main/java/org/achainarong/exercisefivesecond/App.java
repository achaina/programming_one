package org.achainarong.exercisefivesecond;

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
    public static void main(String[] args) throws Exception {
        // System.out.println(Integer.toHexString(Integer.MIN_VALUE));
        HexaLiteraldReader.readHexadecimalString(args);
    }
}
