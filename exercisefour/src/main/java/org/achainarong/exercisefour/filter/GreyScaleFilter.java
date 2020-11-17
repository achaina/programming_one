package org.achainarong.exercisefour.filter;

import java.awt.image.*;

import org.achainarong.exercisefour.helper.*;

public class GreyScaleFilter extends RGBImageFilter {

    public int filterRGB(int x, int y, int pixel) {
        RGB rgb = new RGB();
        rgb.getRGBFromPixel(pixel);

        // usual greyscale
        // int greyScale = (int) (0.3 * r + 0.59 * g + 0.11 * b);

        // msdn greyscale
        int msdnGreyScale = (int) (rgb.getRed() * 0.3 + rgb.getGreen() * 0.59 + rgb.getBlue() * 0.11);

        int filteredPixel = ColorConverter.RGBPixelToInt(msdnGreyScale, msdnGreyScale, msdnGreyScale);

        return filteredPixel;
    }
}