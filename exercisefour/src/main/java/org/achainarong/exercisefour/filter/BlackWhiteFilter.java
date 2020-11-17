package org.achainarong.exercisefour.filter;

import java.awt.image.*;

import org.achainarong.exercisefour.helper.RGBColor;

public class BlackWhiteFilter extends RGBImageFilter {

    public int filterRGB(int x, int y, int pixel) {
        RGBColor rgb = new RGBColor();
        rgb.getRGBFromPixel(pixel);
        int avarage = (rgb.getBlue() + rgb.getGreen() + rgb.getRed()) / 3;

        int filteredPixel = 0xFF000000;

        if (avarage > 128) {
            filteredPixel = 0xFFFFFFFF;
        }

        return filteredPixel;
    }
}