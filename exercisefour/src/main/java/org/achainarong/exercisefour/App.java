package org.achainarong.exercisefour;

import org.achainarong.exercisefour.helper.*;
import org.achainarong.exercisefour.ui.*;

import java.awt.*;
import java.awt.image.*;
import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.*;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    public static void main(String[] args) {
        // TO DO check how to copy files to the right output directory
        try {
            // var mainWindows = new MainWindow();
            var exampleWindow = new ExampleWindow();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
}
