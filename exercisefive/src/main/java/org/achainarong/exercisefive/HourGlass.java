package org.achainarong.exercisefive;

public class HourGlass {
    public static void printBiggerToSmaller() {

        char fillChar = '+';
        char identChar = '\s';

        int indentWidth = 0;
        int triangleBaseLength = 11;
        int fillWidth = triangleBaseLength;
        int triangleHeight = 6;

        for (int i = 0; i < triangleHeight; i++) {

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

    public static void printSmallerToBigger() {

        char fillChar = '+';
        char identChar = '\s';

        int indentWidth = 5;
        int triangleBaseLength = 11;
        int fillWidth = 1;
        int triangleHeight = 6;

        for (int i = 0; i < triangleHeight; i++) {

            printIdentCharForLoop(identChar, indentWidth);

            for (int j = 0; j < fillWidth; j++) {
                System.out.print(fillChar);
            }

            printIdentCharForLoop(identChar, indentWidth);

            System.out.println();
            indentWidth--;
            fillWidth += 2;
        }
    }

    private static void printIdentCharForLoop(char identChar, int indentWidth) {
        for (int i = 0; i < indentWidth; i++) {
            System.out.print(identChar);
        }
    }

}