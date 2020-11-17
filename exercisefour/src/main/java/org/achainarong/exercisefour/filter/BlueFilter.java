package org.achainarong.exercisefour.filter;

import java.awt.image.*;

public class BlueFilter extends RGBImageFilter {

    public int filterRGB(int x, int y, int pixel) {
        int filteredPixel = (pixel & 0xffffff00);

        return filteredPixel;
    }
}