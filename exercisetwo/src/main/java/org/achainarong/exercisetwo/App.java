package org.achainarong.exercisetwo;

import org.achainarong.exercisetwo.helper.*;

public class App 
{
    public static void main( String[] args )
    {
        
        String stringToConvertToHex = "48 65 122";
        int[] splittedIntArray = StringSplitter.SplitAtWhitespaceAndReturnAsInteger(stringToConvertToHex);

        // Strings are immutable and are generated every time we would use the "+" operator which impacts the memory usage.
        // StringBuilder is an mutable sequence of characters. It is used because we are iterating over an array an appending an n amount of strings. 
        StringBuilder strBuilder = new StringBuilder();

        for (int splittedInt : splittedIntArray) {
            String unicodeString = HexcodeConverter.FromInt(splittedInt);
            strBuilder.append(unicodeString + " ");
        }

        // printing out the hex values
        System.out.println("Hexstring: " + strBuilder.toString().toUpperCase().trim());
    }
}
