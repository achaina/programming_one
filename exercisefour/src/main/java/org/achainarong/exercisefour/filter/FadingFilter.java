package org.achainarong.exercisefour.filter;

import java.awt.image.*;
import org.achainarong.exercisefour.helper.*;

public class FadingFilter extends RGBImageFilter {

    private int imageHalfWidth;
    private int imageHalfHeight;

    public int filterRGB(int x, int y, int pixel) {
        RGBColor rgb = new RGBColor();
        rgb.getRGBFromPixel(pixel);

        // distance from center
        double dist = Math.sqrt(Math.pow(x - imageHalfWidth, 2) + Math.pow(y - imageHalfHeight, 2));
        double scale = 1.5;

        // calculate fading of the pixel depending of distance from the center and
        // scaling factor
        int fadedRed = (int) Math.min(255, rgb.getRed() + dist * scale);
        int fadedGreen = (int) Math.min(255, rgb.getGreen() + dist * scale);
        int fadedBlue = (int) Math.min(255, rgb.getBlue() + dist * scale);

        int filteredPixel = ColorConverter.rgbPixelToInt(fadedRed, fadedGreen, fadedBlue);

        return filteredPixel;
    }

    public FadingFilter(BufferedImage image) {
        this.imageHalfWidth = image.getWidth() / 2;
        this.imageHalfHeight = image.getHeight() / 2;
    }
}