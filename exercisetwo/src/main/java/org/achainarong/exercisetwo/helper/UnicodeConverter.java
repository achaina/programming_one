package org.achainarong.exercisetwo.helper;

import java.nio.charset.*;

public class UnicodeConverter {
    public static String ConvertStringToUnicode(String str){
        // converting the string into a bytearray so a new string with the right encoding can be initiliated
        // Depending on the JVM which decides the default encoding of strings this conversion could lead to problems
        // macOS should have UTF-8 as default encoding so it should be fine and this conversion should not actually be needed
        byte[] byteArray = str.getBytes();

        return new String(byteArray, StandardCharsets.UTF_8);
    }
}
