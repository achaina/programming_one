package org.achainarong.exercisetwo.helper;

public class UnicodeConverter {
    public static String ConvertIntToUnicodeStringValue(int number) {

        // macOS default encoding is UTF-8 so it should be fine
        // if the default encoding is something else there could be a conversion into a
        // wrong value
        char[] charArray = Integer.toString(number).toCharArray();

        StringBuilder unicodeStringBuilder = new StringBuilder();

        for (char ch : charArray) {
            int unicodeInt = (int) ch;

            // https://docs.oracle.com/javase/7/docs/api/java/util/Formatter.html
            // this is the pattern the string formatter uses
            // %[argument_index$][flags][width][.precision]conversion 
            // %x04x stands for a 4 digit hexadecimal number with trailing zeroes
            unicodeStringBuilder.append(String.format("\\u%04x", unicodeInt));
        }

        return unicodeStringBuilder.toString();
    }

    public static String ConvertStringToUnicodeStringValue(String stringToConvert) {
        char[] charArray = stringToConvert.toCharArray();

        StringBuilder unicodeStringBuilder = new StringBuilder();

        for (char ch : charArray) {
            int unicodeInt = (int) ch;
            unicodeStringBuilder.append(String.format("\\u%04x", unicodeInt));
        }

        return unicodeStringBuilder.toString();
    }
}
