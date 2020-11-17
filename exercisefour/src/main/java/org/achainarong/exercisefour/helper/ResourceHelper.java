package org.achainarong.exercisefour.helper;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.awt.image.*;

import javax.imageio.ImageIO;

public class ResourceHelper {
    public static Image GetImageFromResourceFolderByName(String imageName) {
        String imagePath = "./target/classes/org/achainarong/exercisefour/resources/" + imageName;

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        return toolkit.getImage(imagePath);
    }

    public static BufferedImage GetFileFromResourceFolderByName(String imageName) throws IOException {
        String imagePath = "./target/classes/org/achainarong/exercisefour/resources/" + imageName;

        return ImageIO.read(new File(imagePath));
    }
}
