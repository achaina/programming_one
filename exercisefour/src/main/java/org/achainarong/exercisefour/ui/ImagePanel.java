package org.achainarong.exercisefour.ui;

import java.awt.*;
import java.io.Serializable;

import javax.swing.*;

public class ImagePanel extends JPanel implements Serializable {
    private Image image;

    public ImagePanel(Image image) {
        this.image = image;
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(image, 10, 10, image.getWidth(this), image.getHeight(this), this);
    }
}