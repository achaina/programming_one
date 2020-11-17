package org.achainarong.exercisefour.filter;

import java.awt.image.*;

public class GreenFilter extends RGBImageFilter {

    public int filterRGB(int x, int y, int pixel) {
        int filteredPixel = (pixel & 0xffff00ff);

        return filteredPixel;
    }
}