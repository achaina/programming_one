package org.achainarong.exercisefour.filter;

import java.awt.image.*;

public class MonochromeFilter extends RGBImageFilter {

    public int filterRGB(int x, int y, int pixel) {
        int filteredPixel;

        // enjoy working on pixels here
        // extract one color part as an example
        // filteredPixel = pixel / 3;
        int r = (pixel & 0xFF0000) >> 16;
        int g = (pixel & 0xFF00) >> 8;
        int b = (pixel & 0xFF);

        // usual greyscale
        // int greyScale = (int) (0.3 * r + 0.59 * g + 0.11 * b);

        // msdn greyscale
        int msdnGreyScale = (int) (r * 0.3 + g * 0.59 + b * 0.11);

        // put the pixels in place
        filteredPixel = (0x000000FF << 24) | (msdnGreyScale << 16) | (msdnGreyScale << 8) | msdnGreyScale;

        return filteredPixel;
    }
}