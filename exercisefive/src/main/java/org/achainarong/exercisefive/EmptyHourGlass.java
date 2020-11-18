package org.achainarong.exercisefive;

public class EmptyHourGlass {
    public static void print() {
        printBiggerToSmaller();
        printSmallerToBigger();
    }

    private static void printBiggerToSmaller() {

        char fillChar = '\s';
        char identChar = '+';

        int indentWidth = 0;
        int triangleBaseLength = 11;
        int fillWidth = triangleBaseLength;
        int triangleHeight = 6;

        for (int i = 0; i < triangleHeight; i++) {

            printIdentCharForLoop(identChar, indentWidth);

            printfillChar(fillChar, fillWidth);

            printIdentCharForLoop(identChar, indentWidth);

            System.out.println();
            indentWidth++;
            fillWidth -= 2;
        }
    }

    private static void printSmallerToBigger() {

        char fillChar = '\s';
        char identChar = '+';

        int indentWidth = 4;
        int fillWidth = 3;
        int triangleHeight = 5;

        for (int i = 0; i < triangleHeight; i++) {

            printIdentCharForLoop(identChar, indentWidth);

            printfillChar(fillChar, fillWidth);

            printIdentCharForLoop(identChar, indentWidth);

            System.out.println();
            indentWidth--;
            fillWidth += 2;
        }
    }

    private static void printfillChar(char fillChar, int fillWidth) {
        for (int j = 0; j < fillWidth; j++) {
            System.out.print(fillChar);
        }
    }

    private static void printIdentCharForLoop(char identChar, int indentWidth) {
        for (int i = 0; i < indentWidth; i++) {
            System.out.print(identChar);
        }
    }

}