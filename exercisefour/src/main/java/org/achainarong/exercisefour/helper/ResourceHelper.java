package org.achainarong.exercisefour.helper;

import java.awt.*;

public class ResourceHelper {
    public static Image GetImageFromResourceFolderByName(String imageName) {
        String imagePath = "./target/classes/org/achainarong/exercisefour/resources/" + imageName;

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        return toolkit.getImage(imagePath);
    }
}
