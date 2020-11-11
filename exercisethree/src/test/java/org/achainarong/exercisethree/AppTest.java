package org.achainarong.exercisethree;

import static org.junit.Assert.assertTrue;
import static org.junit.Assume.assumeTrue;

import org.achainarong.exercisethree.exercises.EBNF;
import org.junit.Test;
import org.junit.experimental.theories.DataPoint;
import org.junit.experimental.theories.DataPoints;
import org.junit.experimental.theories.Theories;
import org.junit.experimental.theories.Theory;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Theories.class)
public class AppTest {

    @DataPoints
    public static String[] expressions() {
        return new String[] { "-(1+4)", "(1+4)" };
    }

    // int arrays seems not to work
    @DataPoints
    public static int[] expectedResults() {
        return new int[] { -5, 5 };
    }

    @Theory
    public void ExpressionShouldReturnCalculatedResult(String expression, int expectedResult) {
        int result = EBNF.AnalyzeFormAndReturnCalculation(expression);
        assumeTrue(expectedResult == result);
    }
}
