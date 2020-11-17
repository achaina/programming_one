package org.achainarong.exercisefour.filter;

import java.awt.image.*;

import org.achainarong.exercisefour.helper.ColorConverter;

public class MonochromeFilter extends RGBImageFilter {

    public int filterRGB(int x, int y, int pixel) {

        // 11111111_10000000_01111110_00000011 is the color given by the exercise
        int r = 0b10000000;
        int g = 0b01111110;
        int b = 0b00000011;

        // put the pixels in place
        var filteredPixel = ColorConverter.RGBPixelToInt(r, g, b);

        return filteredPixel;
    }
}