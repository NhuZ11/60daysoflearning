package com.nhuz;

import javax.swing.*;
import java.awt.*;

public class Panel {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setTitle("Panel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setResizable(false);
        frame.setSize(500, 500);

        JLabel label1 = new JLabel();
        label1.setText("This is red");

        JLabel label2 = new JLabel();
        label2.setText("This is blue");

        JLabel label3 = new JLabel();
        label3.setText("This is green");

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0, 0, 250, 250);
        redPanel.add(label1);
        frame.add(redPanel);

        JPanel bluePanel = new JPanel();
        bluePanel.setBackground(Color.blue);
        bluePanel.setBounds(250, 0, 250, 250);
        bluePanel.add(label2);
        frame.add(bluePanel);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.green);
        greenPanel.setBounds(0, 250, 500, 250);
        greenPanel.add(label3);
        frame.add(greenPanel);

        frame.setVisible(true);
    }
}
