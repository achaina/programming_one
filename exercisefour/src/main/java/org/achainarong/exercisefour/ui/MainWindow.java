// package org.achainarong.exercisefour.ui;

// import org.achainarong.exercisefour.helper.*;
// import java.awt.*;
// import java.awt.image.*;
// import java.io.File;
// import java.nio.file.Path;
// import java.nio.file.Paths;
// import java.awt.event.ActionEvent;
// import java.awt.event.ActionListener;
// import javax.swing.*;
// import javax.swing.border.LineBorder;

// public class MainWindow extends JFrame implements ActionListener {

// private JButton browseButton;
// private JButton saveButton;
// private Panel buttonPanel;

// private JFileChooser fileChooser;

// // initiliazing the main window
// public MainWindow() {
// super("Images and pixelwise filtering");

// this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// this.setBackground(Color.RED);

// var content = this.getContentPane();

// fileChooser = new JFileChooser();

// browseButton = new JButton("browse");
// browseButton.addActionListener(this);

// saveButton = new JButton("save");
// saveButton.addActionListener(this);

// this.styleButton(browseButton);
// this.styleButton(saveButton);

// saveButton.addActionListener(this);

// var imagePanel = new Panel();
// imagePanel.setLayout(new GridLayout(0, 2));
// imagePanel.add(new JLabel("yolo"));

// content.add(imagePanel);

// buttonPanel = new Panel();
// buttonPanel.setLayout(new GridLayout(0, 2));

// // Panel allImagesPanel = new Panel();
// // allImagesPanel.setLayout(new GridLayout(0, 3));
// // allImagesPanel.add(new ImagePanel("lol"));

// buttonPanel.add(browseButton, 1, 0);
// buttonPanel.add(saveButton, 1, 1);

// content.add(buttonPanel);

// // this.setBounds(50, 50, 1000, 500);
// this.setSize(500, 600);
// this.setVisible(true);

// }

// private void styleButton(JButton button) {
// button.setBorder(BorderFactory.createEtchedBorder(0));
// button.setPreferredSize(new Dimension(20, 20));
// }

// @Override
// public void actionPerformed(ActionEvent e) {
// switch (e.getActionCommand()) {
// case "save" -> saveConvertedPicture();
// case "browse" -> showFileChooserDialog();
// }
// }

// private void showFileChooserDialog() {
// int result = fileChooser.showSaveDialog(null);

// if (result == JFileChooser.APPROVE_OPTION) {
// System.out.println(fileChooser.getSelectedFile().getName());
// }
// }

// private void saveConvertedPicture() {

// }

// }
