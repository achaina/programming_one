package org.achainarong.exercisetwo.helper;

public class UnicodeConverter {
    public static String ConvertIntToUnicodeStringValue(int number){
        
        // macOS default encoding is UTF-8 so it should be fine
        // if the default encoding is something else there could be a conversion into a wrong value
        char[] charArray = Integer.toString(number).toCharArray();

            StringBuilder unicodeStringBuilder = new StringBuilder();

            for (char ch : charArray) {
                int unicodeInt = (int) ch;
                unicodeStringBuilder.append(String.format("\\u%x", unicodeInt));
            }

            return unicodeStringBuilder.toString();
    }
}
