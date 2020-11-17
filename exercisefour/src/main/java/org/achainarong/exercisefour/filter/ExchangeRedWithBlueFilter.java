package org.achainarong.exercisefour.filter;

import java.awt.image.*;

import org.achainarong.exercisefour.helper.ColorConverter;
import org.achainarong.exercisefour.helper.RGBColor;

public class ExchangeRedWithBlueFilter extends RGBImageFilter {

    public int filterRGB(int x, int y, int pixel) {
        RGBColor rgb = new RGBColor();
        rgb.getRGBFromPixel(pixel);

        int filteredPixel = ColorConverter.rgbPixelToInt(rgb.getBlue(), rgb.getGreen(), rgb.getRed());

        return filteredPixel;
    }
}