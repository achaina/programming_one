package org.achainarong.exercisefour.filter;

import java.awt.image.*;

public class RedFilter extends RGBImageFilter {

    public int filterRGB(int x, int y, int pixel) {
        int filteredPixel = (pixel & 0xff00ffff);

        return filteredPixel;
    }
}