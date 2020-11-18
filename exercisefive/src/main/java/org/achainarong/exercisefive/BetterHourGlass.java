package org.achainarong.exercisefive;

public class BetterHourGlass {
    public static void print() {
        printBiggerToSmaller();
        printSmallerToBigger();
    }

    public static void printBiggerToSmaller() {

        char fillChar = '+';
        char identChar = '\s';

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

    public static void printSmallerToBigger() {

        char fillChar = '+';
        char identChar = '\s';

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

    public static void printAll(int triangleHeight, int horizontalRepeats) {

        char fillChar = '+';
        char identChar = '\s';

        for (int r = 0; r < horizontalRepeats; r++) {

            int indentWidth = 0;
            boolean passedMiddle = true;
            int newTriangleHeight = triangleHeight * 2 - 1;
            int triangleBaseLength = newTriangleHeight;
            int fillWidth = triangleBaseLength;

            for (int i = 0; i < newTriangleHeight; i++) {

                printIdentCharForLoop(identChar, indentWidth);

                printfillChar(fillChar, fillWidth);

                printIdentCharForLoop(identChar, indentWidth);

                System.out.println();
                if (passedMiddle) {
                    indentWidth++;
                    fillWidth -= 2;
                }

                if (indentWidth == newTriangleHeight / 2 + 1) {
                    indentWidth--;
                    fillWidth += 2;
                    passedMiddle = false;
                }

                if (passedMiddle == false) {
                    indentWidth--;
                    fillWidth += 2;
                }

            }
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