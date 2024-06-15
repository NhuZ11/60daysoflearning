package com.nhuz;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;

public class GUI {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        frame.setTitle("First GUI Java");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setSize(420,420);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.gray);

        Border border=BorderFactory.createLineBorder(Color.GREEN,5);

        JLabel label= new JLabel();
        label.setText("60 Days Of Learning");
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.CENTER);
        label.setFont(new Font("Times New Roman",Font.PLAIN,32));
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        frame.add(label);
    }
}
