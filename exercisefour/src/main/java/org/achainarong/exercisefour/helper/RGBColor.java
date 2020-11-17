package org.achainarong.exercisefour.helper;

public class RGBColor {
    private int red;
    private int green;
    private int blue;

    public int getRed() {
        return red;
    }

    public int getBlue() {
        return blue;
    }

    public int getGreen() {
        return green;
    }

    public void getRGBFromPixel(int pixel) {
        red = (pixel & 0xFF0000) >> 16;
        green = (pixel & 0xFF00) >> 8;
        blue = (pixel & 0xFF);
    }
}
