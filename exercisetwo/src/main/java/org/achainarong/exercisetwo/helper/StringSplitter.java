package org.achainarong.exercisetwo.helper;

public class StringSplitter {
    public static int[] SplitAtWhitespaceAndReturnAsInteger(String value){

        // regex to split string at whitespace so all whitespaces are removed and only the necessary strings are saved in the string array
        String[] stringArray = value.trim().split(" ");


        // we create the array with the length of the old array
        int[] intArray = new int[stringArray.length];

        for(int i = 0; i < stringArray.length; i++)
        {
            try {
                // We cast the string to an int and save it in our int array
                intArray[i] = Integer.parseInt(stringArray[i]);
            } catch (NumberFormatException e) {
                System.out.println("The string " + stringArray[i] + " could not be casted to an int! The programm is still continuing." );
            }
        }

        return intArray;
    }
}