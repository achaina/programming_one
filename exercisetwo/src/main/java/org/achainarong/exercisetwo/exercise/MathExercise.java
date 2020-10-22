package org.achainarong.exercisetwo.exercise;

public class MathExercise {

    // Could be more generic and less verbose when using reflection, but for this
    // exercise this should be enough
    public void RunEverything() {
        // 1.
        try {
            int result = this.DivideOddIntNumberBy2();
            System.out.println("DivideOddNumberBy2: " + result);
        } catch (Exception e) {
            System.err.println("DivideOddNumberBy2: " + e);
        }

        try {
            float result = this.DivideOddFloatNumberBy2();
            System.out.println("DivideOddFloatNumberBy2: " + result);
        } catch (Exception e) {
            System.err.println("DivideOddFloatNumberBy2: " + e);
        }

        // 3.
        try {
            double result = this.MultiplicateBigDoubleNumbers();
            System.out.println("MultiplicateBigDoubleNumbers: " + result);
        } catch (Exception e) {
            System.err.println("MultiplicateBigDoubleNumbers: " + e);
        }

        try {
            long result = this.MultiplicateBigLongNumber();
            System.out.println("MultiplicateBigLongNumber: " + result);
        } catch (Exception e) {
            System.err.println("MultiplicateBigLongNumber: " + e);
        }

        // 4.
        try {
            int result = this.DividePositiveIntNumberWithZero();
            System.out.println("DividePositiveIntNumberWithZero: " + result);
        } catch (Exception e) {
            System.err.println("DividePositiveIntNumberWithZero: " + e);
        }

        try {
            float result = this.DividePositiveFloatNumberWithZero();
            System.out.println("DividePositiveFloatNumberWithZero: " + result);
        } catch (Exception e) {
            System.err.println("DividePositiveFloatNumberWithZero: " + e);
        }

        try {
            int result = this.DivideNegativeIntNumberWithZero();
            System.out.println("DivideNegativeIntNumberWithZero: " + result);
        } catch (Exception e) {
            System.err.println("DivideNegativeIntNumberWithZero: " + e);
        }

        try {
            float result = this.DivideNegativeFloatNumberWithZero();
            System.out.println("DivideNegativeFloatNumberWithZero: " + result);
        } catch (Exception e) {
            System.err.println("DivideNegativeFloatNumberWithZero: " + e);
        }

        // 5.
        try {
            int result = this.DivideZeroByItself();
            System.out.println("DivideZeroByItself: " + result);
        } catch (Exception e) {
            System.err.println("DivideZeroByItself: " + e);
        }

    }

    // 1. Exercise
    public int DivideOddIntNumberBy2() {
        return 9 / 2;
    }

    // 1. Exercise
    public float DivideOddFloatNumberBy2() {
        return 9.234F / 2;
    }

    // 2. Exercise
    // public static void BigNumberForDatatypeX() {
    // int i = 1273129837128903712893712389712;
    // long l = 1273129837128903712893712389712;
    // double d =
    // 12321.129378129378912321083712890312892314327848236782364783264382764237864278462387462394628942343290438249823048239048320948239084239048239047239804723894328946237842387037219;
    // double d2 = 12390812309123 ^
    // 1234728642385418932167812964237419864327419426412389712387192;
    // }

    // 3. Exercise
    public double MultiplicateBigDoubleNumbers() {
        return Double.MAX_VALUE * Double.MAX_VALUE;
    }

    // 3. Exercise
    public long MultiplicateBigLongNumber() {
        return Long.MAX_VALUE * Long.MAX_VALUE;
    }

    // 4. Exercise
    public int DividePositiveIntNumberWithZero() {
        return 5 / 0;
    }

    public float DividePositiveFloatNumberWithZero() {
        return 5.5F / 0;
    }

    // 4. Exercise
    public int DivideNegativeIntNumberWithZero() {
        return -5 / 0;
    }

    public float DivideNegativeFloatNumberWithZero() {
        return -5.5F / 0;
    }

    // 5. Exercise
    public int DivideZeroByItself() {
        return 0 / 0;
    }
}
