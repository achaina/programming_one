package org.achainarong.exercisefive;

public class Rhombus {
    public static void printTriangleForLoop() {

        char fillChar = '+';
        char identChar = '\s';

        int indentWidth = 0;
        int triangleBaseLength = 11;
        int fillWidth = triangleBaseLength;

        for (int i = 0; i < triangleBaseLength; i++) {

            printIdentCharForLoop(identChar, indentWidth);

            for (int j = 0; j < fillWidth; j++) {
                System.out.print(fillChar);
            }

            printIdentCharForLoop(identChar, indentWidth);

            System.out.println();
            indentWidth++;
            fillWidth -= 2;
        }
    }

    public static void printTriangleWhileLoop() {

        char fillChar = '+';
        char identChar = '\s';

        int indentWidth = 0;
        int triangleBaseLength = 11;
        int fillWidth = triangleBaseLength;
        int i = 0;

        while (i < triangleBaseLength) {

            printIdentCharWhileLoop(identChar, indentWidth);

            int j = 0;

            while (j < fillWidth) {
                System.out.print(fillChar);
                j++;
            }
            printIdentCharWhileLoop(identChar, indentWidth);

            System.out.println();
            indentWidth++;
            fillWidth -= 2;
            i++;
        }
    }

    private static void printIdentCharForLoop(char identChar, int indentWidth) {
        for (int i = 0; i < indentWidth; i++) {
            System.out.print(identChar);
        }
    }

    private static void printIdentCharWhileLoop(char identChar, int indentWidth) {
        int i = 0;
        while (i < indentWidth) {
            System.out.print(identChar);
            i++;
        }
    }
}