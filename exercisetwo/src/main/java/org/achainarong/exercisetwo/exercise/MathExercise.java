package org.achainarong.exercisetwo.exercise;

import java.lang.*;

public class MathExercise {

    // Could be more generic and less verbose when using reflection, but for this
    // exercise this should be enough
    public void RunEverything() {

        System.out.println("square: " + Math.sqrt(-1));

        // 1.
        try {
            int result = this.DivideOddIntNumberBy2();
            System.out.println("DivideOddNumberBy2: \t\t\t" + result);
        } catch (Exception e) {
            System.err.println("DivideOddNumberBy2: \t\t\t" + e);
        }

        try {
            float result = this.DivideOddFloatNumberBy2();
            System.out.println("DivideOddFloatNumberBy2: \t\t" + result);
        } catch (Exception e) {
            System.err.println("DivideOddFloatNumberBy2: \t\t" + e);
        }

        // 3.
        try {
            double result = this.MultiplicateBigDoubleNumbers();
            System.out.println("MultiplicateBigDoubleNumbers: \t\t" + result);
        } catch (Exception e) {
            System.err.println("MultiplicateBigDoubleNumbers: \t\t" + e);
        }

        try {
            long result = this.MultiplicateBigLongNumber();
            System.out.println("MultiplicateBigLongNumber: \t\t" + result);
        } catch (Exception e) {
            System.err.println("MultiplicateBigLongNumber: \t\t" + e);
        }

        // 4.
        try {
            int result = this.DividePositiveIntNumberWithZero();
            System.out.println("DividePositiveIntNumberWithZero: \t" + result);
        } catch (Exception e) {
            System.err.println("DividePositiveIntNumberWithZero: \t" + e);
        }

        try {
            float result = this.DividePositiveFloatNumberWithZero();
            System.out.println("DividePositiveFloatNumberWithZero: \t" + result);
        } catch (Exception e) {
            System.err.println("DividePositiveFloatNumberWithZero: \t" + e);
        }

        try {
            int result = this.DivideNegativeIntNumberWithZero();
            System.out.println("DivideNegativeIntNumberWithZero: \t" + result);
        } catch (Exception e) {
            System.err.println("DivideNegativeIntNumberWithZero: \t" + e);
        }

        try {
            float result = this.DivideNegativeFloatNumberWithZero();
            System.out.println("DivideNegativeFloatNumberWithZero: \t" + result);
        } catch (Exception e) {
            System.err.println("DivideNegativeFloatNumberWithZero: \t" + e);
        }

        // 5.
        try {
            double result = this.DivideZeroByItself();
            System.out.println("DivideZeroByItself: \t\t\t" + result);
        } catch (Exception e) {
            System.err.println("DivideZeroByItself: \t\t\t" + e);
        }

        System.out.println();
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
    public double DivideZeroByItself() {
        return 0.0 / 0.0;
    }
}

// Datentyptabelle
// boolean 8 bit true/false
// byte 8 bit -2^7 bis 2^7-1
// short 16 bit -2^15 bis 2^15-1
// char 16 bit 0 bis 65535
// int 32 bit -231 bis 231-1
// float 32 bit +/-1,4E-45 bis +/-3,4E+38
// long 64 bit -2^63 bis 2^63-1
// double 64 bit +/-4,9E-324 bis +/-1,7E+308