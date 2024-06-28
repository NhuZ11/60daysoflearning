package com.nhuz;

import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MouseListen extends JFrame implements MouseListener {
    JLabel label;
    ImageIcon smile;
    ImageIcon pagal;
    MouseListen(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.pack();

        this.setSize(500,500);
        this.setVisible(true);

        label=new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.red);
        label.setOpaque(true);


        this.add(label);
        label.addMouseListener(this);
    }

    public static void main(String[] args) {
        MouseListen mouseListen=new MouseListen();
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("You Clicked the mouse");
//        label.setBackground(Color.BLUE);
        label.setIcon(pagal);

    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("You pressed the mouse");
        label.setBackground(Color.CYAN);

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        label.setBackground(Color.GREEN);

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("You entered the component.");
        label.setBackground(Color.BLACK);

    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("You exited the component.");


    }
}
