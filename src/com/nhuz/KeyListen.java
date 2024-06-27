package com.nhuz;

import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyListen extends JFrame implements KeyListener {
    JLabel label;
    ImageIcon icon;
    KeyListen(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.addKeyListener(this);

        icon=new ImageIcon(getClass().getResource("/com/nhuz/icon.png"));
        Image image = icon.getImage();
        Image scaledImage = image.getScaledInstance(50, 50, Image.SCALE_SMOOTH);
        icon = new ImageIcon(scaledImage);

        label=new JLabel();
        label.setBounds(0,0,100,100);
//        label.setBackground(Color.red);
//        label.setOpaque(true);
        label.setIcon(icon);
        this.getContentPane().setBackground(Color.black);

        this.add(label);
        this.setVisible(true);

    }

    public static void main(String[] args) {
        KeyListen keyListen=new KeyListen();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        switch (e.getKeyChar()){
            case 'a': label.setLocation(label.getX()-10,label.getY());
                break;
            case 'w': label.setLocation(label.getX(),label.getY()-10);
                break;
            case 's': label.setLocation(label.getX(),label.getY()+10);
                break;
            case 'd': label.setLocation(label.getX()+10,label.getY());
                break;
        }

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch (e.getKeyCode()){
            case 37: label.setLocation(label.getX()-10,label.getY());
                break;
            case 38: label.setLocation(label.getX(),label.getY()-10);
                break;
            case 39: label.setLocation(label.getX()+10,label.getY());
                break;
            case 40: label.setLocation(label.getX(),label.getY()+10);
                break;
        }

    }

    @Override
    public void keyReleased(KeyEvent e) {

        System.out.println("pressed"+e.getKeyCode());

    }
}
