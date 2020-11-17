package org.achainarong.exercisefour.filter;

import java.awt.image.*;

import org.achainarong.exercisefour.helper.*;

public class GreyScaleFilter extends RGBImageFilter {

    public int filterRGB(int x, int y, int pixel) {
        RGBColor rgb = new RGBColor();
        rgb.getRGBFromPixel(pixel);

        // msdn greyscale
        int msdnGreyScale = (int) (rgb.getRed() * 0.3 + rgb.getGreen() * 0.59 + rgb.getBlue() * 0.11);

        int filteredPixel = ColorConverter.rgbPixelToInt(msdnGreyScale, msdnGreyScale, msdnGreyScale);

        return filteredPixel;
    }
}