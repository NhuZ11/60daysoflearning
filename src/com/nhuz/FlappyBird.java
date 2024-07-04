package com.nhuz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class FlappyBird extends JFrame implements KeyListener {
    int Xlocation = 100;
    int Ylocation = 100;
    JLabel label;
    Timer fallTimer;

    FlappyBird() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.addKeyListener(this);
        this.getContentPane().setBackground(Color.black);

        label = new JLabel();
        label.setBounds(Xlocation, Ylocation, 50, 50);
        label.setBackground(Color.green);
        label.setOpaque(true);
        this.add(label);

        // Timer to handle the falling movement
        fallTimer = new Timer(10, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Ylocation < getHeight() - label.getHeight()) {
                    Ylocation += 5; // Change this value to control the falling speed
                    label.setLocation(Xlocation, Ylocation);
                } else {
                    fallTimer.stop();
                }
            }
        });
        fallTimer.start();
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new FlappyBird());
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int pressed = e.getKeyCode();
        if (pressed == KeyEvent.VK_SPACE) {
            if (Ylocation > 0) {
                Ylocation -= 50; // Change this value to control the jump height
                label.setLocation(Xlocation, Ylocation);
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }
}
