package org.achainarong.exercisefour.filter;

import java.awt.image.*;

import org.achainarong.exercisefour.helper.RGB;

public class DarkLightFilter extends RGBImageFilter {

    public int filterRGB(int x, int y, int pixel) {
        RGB rgb = new RGB();
        rgb.getRGBFromPixel(pixel);

        int avarageColorValue = (rgb.getRed() + rgb.getGreen() + rgb.getBlue()) / 3;

        int maxDarkColorValue = (int) (255 * 0.3);
        int minLightColorValue = (int) (255 * 0.7);

        int filteredPixel;

        if (avarageColorValue <= maxDarkColorValue || avarageColorValue >= minLightColorValue) {
            filteredPixel = pixel;
        } else {
            filteredPixel = 0xFFFFFFFF;
        }

        return filteredPixel;
    }
}