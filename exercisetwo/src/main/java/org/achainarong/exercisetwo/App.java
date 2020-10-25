package org.achainarong.exercisetwo;

import org.achainarong.exercisetwo.exercise.MathExercise;
import org.achainarong.exercisetwo.helper.*;

public class App {
    public static void main(String[] args) {
        // converting numbers to hex and their unicode representation
        String stringToConvertToHex = "48 65 122";
        String unicodeString = HexcodeConverter.ConvertStringToHex(stringToConvertToHex);

        // We are using the System.lineSeparator because windows and unix systems have
        // different seperators and this allows the JVM to use the right one
        System.out.println(System.lineSeparator() + "Converting numbers into their hexcode and unicode counterparts:"
                + System.lineSeparator());
        System.out.println(unicodeString);

        // converting string to unicode representation
        String hello = "hello";
        String unicodeHello = UnicodeConverter.ConvertStringToUnicodeStringValue(hello);

        System.out.println(System.lineSeparator() + "Converting string \"Hello\" to unicode:" + System.lineSeparator());
        System.out.println(unicodeHello + System.lineSeparator());

        // Mathexercise
        MathExercise mathExercise = new MathExercise();
        mathExercise.RunEverything();
    }

}
