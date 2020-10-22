package org.achainarong.exercisetwo;

import org.achainarong.exercisetwo.helper.*;

public class App 
{
    public static void main( String[] args )
    {
        String stringToConvertToHex = "48 65 122";
        String unicodeString = HexcodeConverter.ConvertStringToHex(stringToConvertToHex);
    
        System.out.println("Hexstring: " + unicodeString);
    }
}
