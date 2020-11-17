package org.achainarong.exercisefour.filter;

import java.awt.image.*;
import org.achainarong.exercisefour.helper.*;

public class AlphaFilter extends RGBImageFilter {

    public int filterRGB(int x, int y, int pixel) {
        RGBColor rgb = new RGBColor();
        rgb.getRGBFromPixel(pixel);

        int alpha = 0x00000099;

        // first byte is the the alpha which changes the transparency of the pixel
        int filteredPixel = ColorConverter.rgbPixelToInt(rgb.getRed(), rgb.getGreen(), rgb.getBlue(), alpha);

        return filteredPixel;
    }
}