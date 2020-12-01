package org.achainarong.exercisefive;

import java.io.IOException;

public class UnicodeCharacterReader {
    public static void getCharacterFromUnicodeString() throws IOException {

        int hexValue = 0;

        for (int i = 6; i > 0; i--) {
            char tempChar = (char) System.in.read();

            if (i == 6) {
                if (tempChar != '\\') {
                    throw new IllegalArgumentException("First character has to be \\");
                }
            } else if (i == 5) {
                if (!(tempChar == 'u' || tempChar == 'U')) {
                    throw new IllegalArgumentException("Second character has to be u!");
                }
            } else if (i < 5) {
                int hexIntValue = convertCharsToHexSystemValue(tempChar);
                int bitsToShift = 4 * (i - 1);
                hexValue = hexValue | (hexIntValue << bitsToShift);
            } else {
                throw new IllegalArgumentException();
            }
        }

        System.out.println((char) hexValue);
        System.out.println("intvalue: " + hexValue);
    }

    private static int convertCharsToHexSystemValue(char c) {
        return switch (c) {
            case '0' -> 0;
            case '1' -> 1;
            case '2' -> 2;
            case '3' -> 3;
            case '4' -> 4;
            case '5' -> 5;
            case '6' -> 6;
            case '7' -> 7;
            case '8' -> 8;
            case '9' -> 9;
            case 'A' -> 10;
            case 'a' -> 10;
            case 'B' -> 11;
            case 'b' -> 11;
            case 'C' -> 12;
            case 'c' -> 12;
            case 'D' -> 13;
            case 'd' -> 13;
            case 'E' -> 14;
            case 'e' -> 14;
            case 'F' -> 15;
            case 'f' -> 15;
            default -> throw new IllegalArgumentException("Hexadecimal character was expected " + c);
        };
    }
}
