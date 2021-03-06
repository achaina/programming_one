package org.achainarong.exercisefour.filter;

import java.awt.image.*;
import org.achainarong.exercisefour.helper.*;

public class InvertFilter extends RGBImageFilter {

    public int filterRGB(int x, int y, int pixel) {
        RGBColor rgb = new RGBColor();
        rgb.getRGBFromPixel(pixel);

        // (~pixel | (0xff << 24));
        // the tilde is inverting the bits in the colors
        int filteredPixel = ColorConverter.rgbPixelToInt(~rgb.getRed(), ~rgb.getGreen(), ~rgb.getBlue());

        return filteredPixel;
    }
}