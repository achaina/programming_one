package org.achainarong.exercisefour.filter;

import java.awt.image.*;
import org.achainarong.exercisefour.helper.*;

public class PartFilter extends RGBImageFilter {

    public int filterRGB(int x, int y, int pixel) {
        RGBColor rgb = new RGBColor();
        rgb.getRGBFromPixel(pixel);
        // declaring the pixel here so i don't need an else
        int filteredPixel = 0xFFFFFFFF;

        if (x < 100 && y < 100) {

            filteredPixel = ColorConverter.rgbPixelToInt(rgb.getRed(), rgb.getGreen(), rgb.getBlue());
        }

        return filteredPixel;
    }
}