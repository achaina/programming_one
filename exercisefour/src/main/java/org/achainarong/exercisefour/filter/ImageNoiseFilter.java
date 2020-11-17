package org.achainarong.exercisefour.filter;

import java.awt.image.*;
import org.achainarong.exercisefour.helper.*;

public class ImageNoiseFilter extends RGBImageFilter {

    public int filterRGB(int x, int y, int pixel) {
        RGB rgb = new RGB();
        rgb.getRGBFromPixel(pixel);
        int filteredPixel;

        if (x % 2 == 0 && (y % 2 == 0 || y == 0)) {
            filteredPixel = 0xFF000000;
        } else if (x % 2 == 1 && y % 2 == 1) {
            filteredPixel = 0xFF000000;
        } else {
            filteredPixel = ColorConverter.RGBPixelToInt(rgb.getRed(), rgb.getGreen(), rgb.getBlue());
        }

        return filteredPixel;
    }
}