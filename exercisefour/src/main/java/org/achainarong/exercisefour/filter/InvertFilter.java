package org.achainarong.exercisefour.filter;

import java.awt.image.*;
import org.achainarong.exercisefour.helper.*;

public class InvertFilter extends RGBImageFilter {

    public int filterRGB(int x, int y, int pixel) {
        RGB rgb = new RGB();
        rgb.getRGBFromPixel(pixel);
        // the tilde is inverting the bits in the colors
        int filteredPixel = ColorConverter.RGBPixelToInt(~rgb.getRed(), ~rgb.getGreen(), ~rgb.getBlue());

        return filteredPixel;
    }
}