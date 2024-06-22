package com.nhuz;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LauchPage implements ActionListener {
    JFrame frame=new JFrame("Main page");
    JButton myButton=new JButton("New Window");

    LauchPage(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);
        frame.setLayout(null);
        frame.add(myButton);
         myButton.setBounds(100,200,200,40);
         myButton.setFocusable(false);
        myButton.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==myButton){
            NewWindow myWindow= new NewWindow();
        }

    }
}
