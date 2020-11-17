package org.achainarong.exercisefour.filter;

import java.awt.image.*;

public class TestFilter extends RGBImageFilter {

    public int filterRGB(int x, int y, int pixel) {
        int filteredPixel;

        // enjoy working on pixels here
        // extract one color part as an example
        filteredPixel = (pixel & 0xffff0000);

        return filteredPixel;
    }

    // public BufferedImage ConvertToMonochrome(BufferedImage bufferedImage) {

    // byte[] pixelArray = ((DataBufferByte)
    // bufferedImage.getRaster().getDataBuffer()).getData();

    // // int rgb = image.getRGB(positionX, positionY);
    // int red = (rgb >> 16) & 0xFF;
    // int green = (rgb >> 8) & 0xFF;
    // int blue = (rgb & 0xFF);
    // int grey = (red + green + blue) / 3;
    // }

}