package org.achainarong.exercisefour.ui;

import org.achainarong.exercisefour.filter.*;
import org.achainarong.exercisefour.helper.*;
import java.awt.*;
import java.awt.image.*;
import javax.swing.*;

public class ExampleWindow {
    public ExampleWindow() {

        Image srcImage1 = ResourceHelper.GetImageFromResourceFolderByName("river.gif");
        Image srcImage2 = ResourceHelper.GetImageFromResourceFolderByName("fki_start.jpg");
        Image srcImage3 = ResourceHelper.GetImageFromResourceFolderByName("farbenkreis_b.gif");

        ImageFilter colorfilter = new MonochromeFilter();

        var toolkit = Toolkit.getDefaultToolkit();

        Image filteredImage1 = toolkit.createImage(new FilteredImageSource(srcImage1.getSource(), colorfilter));
        Image filteredImage2 = toolkit.createImage(new FilteredImageSource(srcImage2.getSource(), colorfilter));
        Image filteredImage3 = toolkit.createImage(new FilteredImageSource(srcImage3.getSource(), colorfilter));

        JFrame frame = new JFrame("Images and pixelwise filtering");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setBackground(Color.RED);
        Panel allImagesPanel = new Panel();
        allImagesPanel.setLayout(new GridLayout(0, 3));
        allImagesPanel.add(new ImagePanel(srcImage1));
        allImagesPanel.add(new ImagePanel(srcImage2));
        allImagesPanel.add(new ImagePanel(srcImage3));
        allImagesPanel.add(new ImagePanel(filteredImage1));
        allImagesPanel.add(new ImagePanel(filteredImage2));
        allImagesPanel.add(new ImagePanel(filteredImage3));
        frame.getContentPane().add(allImagesPanel);
        frame.setBounds(50, 50, 1000, 500);
        frame.setVisible(true);
    }
}
