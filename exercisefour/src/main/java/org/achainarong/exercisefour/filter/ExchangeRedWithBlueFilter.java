package org.achainarong.exercisefour.filter;

import java.awt.image.*;

import org.achainarong.exercisefour.helper.ColorConverter;
import org.achainarong.exercisefour.helper.RGB;

public class ExchangeRedWithBlueFilter extends RGBImageFilter {

    public int filterRGB(int x, int y, int pixel) {
        RGB rgb = new RGB();
        rgb.getRGBFromPixel(pixel);

        int filteredPixel = ColorConverter.RGBPixelToInt(rgb.getBlue(), rgb.getGreen(), rgb.getRed());

        return filteredPixel;
    }
}