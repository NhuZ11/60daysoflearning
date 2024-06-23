package com.nhuz;

import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame extends JFrame implements ActionListener {
    JButton button;
    JTextField textField;
    MyFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
        button=new JButton("Submit");


        textField=new JTextField();
        textField.setPreferredSize(new Dimension(300,40));
        button=new JButton("Submit");
        button.addActionListener(this);
        this.add(textField);
        this.add(button);
        this.pack();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println("Welcome"+" "+textField.getText());
            button.setEnabled(false);
            textField.setEditable(false);
        }

    }

    public static void main(String[] args) {
        new MyFrame();
    }
}
