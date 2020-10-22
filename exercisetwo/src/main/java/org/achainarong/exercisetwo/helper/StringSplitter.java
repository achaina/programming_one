package org.achainarong.exercisetwo.helper;

public class StringSplitter {
    public static int[] SplitAtWhitespaceAndReturnAsInteger(String value) {

        // regex to split string at whitespace so all whitespaces are removed and only
        // the necessary strings are saved in the string array
        String[] stringArray = value.trim().split(" ");

        // we create the array with the length of the old array
        int maxArrayLength = stringArray.length * 5;

        int[] intArray = new int[maxArrayLength];

        // index for the array which we are returning
        int currentArrayPostion = 0;

        for (int i = 0; i < maxArrayLength; i++) {
            // we set this summand because we want to have the number smaller and bigger
            // then the real number by -2 and 2
            int summand = -2;

            // We cast the string to an int and save it in our int array
            for (; currentArrayPostion < maxArrayLength;) {
                intArray[currentArrayPostion] = Integer.parseInt(stringArray[i]) + summand;

                currentArrayPostion++;

                if (summand == 2) {
                    break;
                }

                summand++;
            }
        }

        return intArray;
    }
}