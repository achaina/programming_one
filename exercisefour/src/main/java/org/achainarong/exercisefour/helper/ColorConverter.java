package org.achainarong.exercisefour.helper;

public class ColorConverter {

    // put the pixels in the right place
    public static int RGBPixelToInt(int red, int green, int blue) {
        return (0x000000FF << 24) | (red << 16) | (green << 8) | blue;
    }

    public static int RGBPixelToInt(int red, int green, int blue, int alpha) {
        return (alpha << 24) | (red << 16) | (green << 8) | blue;
    }
}
