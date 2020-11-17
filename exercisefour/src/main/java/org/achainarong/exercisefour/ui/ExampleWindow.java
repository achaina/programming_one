package org.achainarong.exercisefour.ui;

import org.achainarong.exercisefour.enums.FilterType;
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

        ImageFilter colorfilter = getimageFilterByFilterType(FilterType.ImageNoise);
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

    private ImageFilter getimageFilterByFilterType(FilterType filterType) {
        return switch (filterType) {
            case Alpha -> new AlphaFilter();
            case Blue -> new BlueFilter();
            case DarkLight -> new DarkLightFilter();
            case ExchangeRedWithBlue -> new ExchangeRedWithBlueFilter();
            case Green -> new GreenFilter();
            case GreyScale -> new GreyScaleFilter();
            case LighterBlue -> new LighterBlueFilter();
            case Monochrome -> new MonochromeFilter();
            case Red -> new RedFilter();
            case Invert -> new InvertFilter();
            case Part -> new PartFilter();
            case ImageNoise -> new ImageNoiseFilter();
            default -> throw new IllegalArgumentException(
                    "No Filter With this type: " + filterType.toString() + " found!");
        };
    }
}
