package org.example;

import org.example.service.SerielizerHelper;
import org.example.service.WriterService;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow {
    private JPanel panel1;
    private JTextPane textPane1;
    private JButton writeToFileButton;
    private JButton serializeButton;
    private JButton clearButton;

    public MainWindow() {

        serializeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                SerielizerHelper serielizerHelper = new SerielizerHelper();
                textPane1.setText(serielizerHelper.serializeMethod());
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                textPane1.setText("");
            }
        });
        writeToFileButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                WriterService writerService = new WriterService();
                writerService.writerMethod();

                JOptionPane.showMessageDialog(null, "File was written!");
            }
        });
    }

    public static void main(String[] args) {

        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }

        JFrame frame = new JFrame("GSon Demo");
        frame.setContentPane(new MainWindow().panel1);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(300, 300));
        frame.pack();

        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        frame.setVisible(true);
    }
}
