package com.nhuz;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class CardLayoutExample extends JFrame {
    CardLayout cardLayout = new CardLayout();
    JPanel cardPanel = new JPanel(cardLayout);

    public CardLayoutExample() {
        // Create two panels with different content
        JPanel firstPanel = new JPanel();
        firstPanel.add(new JLabel("This is the first panel"));
        JButton switchToSecond = new JButton("Go to Second Panel");
        firstPanel.add(switchToSecond);

        JPanel secondPanel = new JPanel();
        secondPanel.add(new JLabel("This is the second panel"));
        JButton switchToFirst = new JButton("Go to First Panel");
        secondPanel.add(switchToFirst);

        // Add panels to cardPanel
        cardPanel.add(firstPanel, "First Panel");
        cardPanel.add(secondPanel, "Second Panel");

        // Set up button actions to switch panels
        switchToSecond.addActionListener(e -> cardLayout.show(cardPanel, "Second Panel"));
        switchToFirst.addActionListener(e -> cardLayout.show(cardPanel, "First Panel"));

        // Add cardPanel to the frame
        add(cardPanel);

        // Frame settings
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        new CardLayoutExample();
    }
}

