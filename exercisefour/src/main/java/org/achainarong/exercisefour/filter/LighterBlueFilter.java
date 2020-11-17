package org.achainarong.exercisefour.filter;

import java.awt.image.*;

import org.achainarong.exercisefour.helper.ColorConverter;
import org.achainarong.exercisefour.helper.RGB;

public class LighterBlueFilter extends RGBImageFilter {

    public int filterRGB(int x, int y, int pixel) {
        RGB rgb = new RGB();
        rgb.getRGBFromPixel(pixel);
        int lighterBlue = rgb.getBlue();
        lighterBlue += 30;
        if (lighterBlue > 255) {
            lighterBlue = 255;
        }

        // first byte is the the alpha which changes the transparency of the pixel
        int filteredPixel = ColorConverter.RGBPixelToInt(rgb.getRed(), rgb.getGreen(), lighterBlue);

        return filteredPixel;
    }
}