package com.nhuz;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class FlappyBird2 extends JFrame implements KeyListener {
    int Xlocation = 100;
    int Ylocation = 100;
    JLabel label;
    JLabel boundryDown;
    JLabel boundryUp;
    JPanel panel;
    Timer fallTimer;

    FlappyBird2() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500, 500);
        this.setVisible(true);
        this.addKeyListener(this);
        this.getContentPane().setBackground(Color.black);

        // Create the label (bird)
        label = new JLabel();
        label.setBounds(Xlocation, Ylocation, 50, 50);
        label.setBackground(Color.green);
        label.setOpaque(true);
        // Add border to the label
        Border labelBorder = BorderFactory.createLineBorder(Color.WHITE, 2);
        label.setBorder(labelBorder);

        // Create the panel
        panel = new JPanel();
        panel.setBounds(0, 0, 500, 500);
        panel.setLayout(null); // Use null layout to set bounds manually
        panel.setBackground(Color.gray);

        // Create the bottom boundary
        boundryDown = new JLabel();
        boundryDown.setBounds(0, 440, 500, 30);
        boundryDown.setBackground(Color.blue);
        boundryDown.setOpaque(true);

        // Add label to panel
        panel.add(label);

        // Add panel to frame
        this.add(panel);

        // Add bottom boundary to frame
        this.add(boundryDown);

        Point location = label.getLocation();
        System.out.println("Label Location: " + location);

        Point boundryLocation = boundryDown.getLocation();
        System.out.println("Boundary Location: " + boundryLocation);

        // Timer for falling motion
        fallTimer = new Timer(40, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (Ylocation < getHeight() - label.getHeight()) {
                    Ylocation += 5; // Change this value to control the falling speed
                    label.setLocation(Xlocation, Ylocation);

                    if (label.getBounds().intersects(boundryDown.getBounds())) {
                        System.out.println("Game over");
                        fallTimer.stop();
                    }
                }
            }
        });
        fallTimer.start();
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            if (Ylocation > 0) {
                Ylocation -= 20; // Move up by 20 pixels
                label.setLocation(Xlocation, Ylocation);
            }
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    public static void main(String[] args) {
        FlappyBird2 flappyBird2 = new FlappyBird2();
    }
}
