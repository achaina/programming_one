package org.achainarong.exercisetwo.helper ;

public class  HexcodeConverter{

	public static String ConvertStringToHex(String stringToConvert) {
        int[] splittedIntArray = StringSplitter.SplitAtWhitespaceAndReturnAsInteger(stringToConvert);

        // Strings are immutable and are generated every time we would use the "+" operator which impacts the memory usage.
        // StringBuilder is an mutable sequence of characters. It is used because we are iterating over an array an appending an n amount of strings. 
        StringBuilder strBuilder = new StringBuilder();

        for (int splittedInt : splittedIntArray) {
            
            String unicodeStringBuilder = UnicodeConverter.ConvertIntToUnicodeStringValue(splittedInt);

            strBuilder.append(splittedInt + " " + HexcodeConverter.FromInt(splittedInt) + " " +  unicodeStringBuilder + " ");
        }

        return strBuilder.toString().trim();
    }

	private static String FromInt(int number) {
		return Integer.toHexString(number);
	}
}