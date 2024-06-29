package com.nhuz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Game {
    Action upAction;
    Action downAction;
    Action rightAction;
    Action leftAction;
    JFrame frame;
    JLabel label;
    Game(){
        frame= new JFrame("Key Binding");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(null);

        label=new JLabel();
        label.setBackground(Color.red);
        label.setBounds(0,0,100,100);
        label.setOpaque(true);
        frame.add(label);
        frame.setVisible(true);

        upAction=new UpAction();
        downAction=new DownAction();
        rightAction=new RightAction();
        leftAction=new LeftAction();


        label.getInputMap().put(KeyStroke.getKeyStroke("UP"),"upAction");
        label.getActionMap().put("upAction",upAction);

        label.getInputMap().put(KeyStroke.getKeyStroke("DOWN"),"downAction");
        label.getActionMap().put("downAction",downAction);

        label.getInputMap().put(KeyStroke.getKeyStroke("RIGHT"),"rightAction");
        label.getActionMap().put("rightAction",rightAction);

        label.getInputMap().put(KeyStroke.getKeyStroke("LEFT"),"leftAction");
        label.getActionMap().put("leftAction",leftAction);

    }
    public class UpAction extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(),label.getY()-10);

        }
    }

    public class DownAction extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX(),label.getY()+10);
        }
    }

    public class RightAction extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX()+10,label.getY());

        }
    }

    public class LeftAction extends AbstractAction {
        @Override
        public void actionPerformed(ActionEvent e) {
            label.setLocation(label.getX()-10,label.getY());

        }
    }

    public static void main(String[] args) {
        Game game=new Game();
    }
}
