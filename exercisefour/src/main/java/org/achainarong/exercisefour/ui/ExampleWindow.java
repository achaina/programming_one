package org.achainarong.exercisefour.ui;

import org.achainarong.exercisefour.enums.FilterType;
import org.achainarong.exercisefour.filter.*;
import org.achainarong.exercisefour.helper.*;
import java.awt.*;
import java.awt.image.*;
import java.io.IOException;

import javax.swing.*;

public class ExampleWindow {
    public ExampleWindow() throws IOException {

        Image srcImage1 = ResourceHelper.GetImageFromResourceFolderByName("river.gif");
        Image srcImage2 = ResourceHelper.GetImageFromResourceFolderByName("fki_start.jpg");
        Image srcImage3 = ResourceHelper.GetImageFromResourceFolderByName("farbenkreis_b.gif");

        var filterType = FilterType.Invert;
        ImageFilter colorfilter;

        Image filteredImage1;
        Image filteredImage2;
        Image filteredImage3;

        if (filterType != FilterType.Fading) {
            colorfilter = FilterHelper.getimageFilterByFilterType(filterType);
            var toolkit = Toolkit.getDefaultToolkit();

            filteredImage1 = toolkit.createImage(new FilteredImageSource(srcImage1.getSource(), colorfilter));
            filteredImage2 = toolkit.createImage(new FilteredImageSource(srcImage2.getSource(), colorfilter));
            filteredImage3 = toolkit.createImage(new FilteredImageSource(srcImage3.getSource(), colorfilter));
        } else {
            filteredImage1 = getFadingFilterImageWithImageSizeByName(srcImage1, "river.gif");
            filteredImage2 = getFadingFilterImageWithImageSizeByName(srcImage2, "fki_start.jpg");
            filteredImage3 = getFadingFilterImageWithImageSizeByName(srcImage3, "farbenkreis_b.gif");
        }

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

    private Image getFadingFilterImageWithImageSizeByName(Image sourceImage, String imageName) throws IOException {
        BufferedImage bufferedImage = ResourceHelper.GetFileFromResourceFolderByName(imageName);
        var toolkit = Toolkit.getDefaultToolkit();
        return toolkit.createImage(new FilteredImageSource(sourceImage.getSource(), new FadingFilter(bufferedImage)));
    }
}
