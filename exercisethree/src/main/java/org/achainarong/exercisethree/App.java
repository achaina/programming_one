package org.achainarong.exercisethree;

import java.io.IOException;

import org.achainarong.exercisethree.exercises.*;

public class App {
    public static void main(String[] args) throws IOException {

        // Aufgabe 3a
        System.out.println(System.lineSeparator());
        BoolOperatorExercise.AnalyseMeMethod();

        System.out.println(System.lineSeparator());
        BoolOperatorExercise.OrOperator();

        System.out.println(System.lineSeparator());
        BoolOperatorExercise.XorOperator();

        System.out.println(System.lineSeparator());
        BoolOperatorExercise.BitwiseOrOperatorTable();

        System.out.println(System.lineSeparator());
        BoolOperatorExercise.BitwiseAndOperatorTable();

        System.out.println(System.lineSeparator());
        BoolOperatorExercise.BitwiseOrOperatorNumbers();

        System.out.println(System.lineSeparator());
        BoolOperatorExercise.BitwiseAndOperatorNumbers();

        // Aufgabe 3b

        // BoolOperatorExercise.ReadBoolOperator();

        // try {

        // int result = EBNF.AnalyzeFormAndReturnCalculation();
        // System.out.println(result);
        // } catch (IllegalArgumentException e) {
        // System.err.println(e.getMessage());
        // }
    }

}