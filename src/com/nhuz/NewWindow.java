package com.nhuz;

import javax.swing.*;

public class NewWindow {
    JFrame frame=new JFrame("New Window");
    JLabel label= new JLabel("This is the new window");
    NewWindow(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setLayout(null);

        label.setBounds(50,50,500,50);
        frame.add(label);

    }
}
