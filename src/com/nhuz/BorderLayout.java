package com.nhuz;

import javax.swing.*;
import java.awt.*;

public class BorderLayout {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setTitle("Border Layout");
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 500);
        frame.setLayout(new java.awt.BorderLayout());

        JPanel panel1=new JPanel();
        JPanel panel2=new JPanel();
        JPanel panel3=new JPanel();
        JPanel panel4=new JPanel();
        JPanel panel5=new JPanel();
        JPanel panel6=new JPanel();
        JPanel panel7=new JPanel();

        panel1.setBackground(Color.red);
        panel2.setBackground(Color.green);
        panel3.setBackground(Color.blue);
        panel4.setBackground(Color.yellow);
        panel5.setBackground(Color.white);

        panel1.setPreferredSize(new Dimension(100,100));
        panel2.setPreferredSize(new Dimension(100,100));
        panel3.setPreferredSize(new Dimension(100,100));
        panel4.setPreferredSize(new Dimension(100,100));
        panel5.setPreferredSize(new Dimension(100,100));

        //SUB PANEL
        panel5.setLayout(new java.awt.BorderLayout());

        panel6.setBackground(Color.BLACK);
        panel7.setBackground(Color.BLACK);
        panel6.setPreferredSize(new Dimension(50,50));
        panel7.setPreferredSize(new Dimension(50,50));
        panel5.add(panel6, java.awt.BorderLayout.EAST);
        panel5.add(panel7, java.awt.BorderLayout.WEST);

        JLabel label=new JLabel();
        label.setText("This is Day 18");

        label.setHorizontalAlignment(JLabel.CENTER);
        panel5.add(label);




        frame.add(panel1, java.awt.BorderLayout.NORTH);
        frame.add(panel2, java.awt.BorderLayout.SOUTH);
        frame.add(panel3, java.awt.BorderLayout.EAST);
        frame.add(panel4, java.awt.BorderLayout.WEST);
        frame.add(panel5, java.awt.BorderLayout.CENTER);

    }
}
