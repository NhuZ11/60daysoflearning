package com.nhuz;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewFrame implements ActionListener {
    JButton button;

    public static void main(String[] args) {
        new NewFrame(); // Create an instance of NewFrame
    }

    public NewFrame() {
        JFrame frame = new JFrame();
        frame.setTitle("Button");

        frame.setResizable(false);
        frame.setLayout(null);
        frame.setSize(420, 420);
        frame.setVisible(true);

        button = new JButton("Click Me");
        button.setBounds(100, 200, 100, 50);
        button.addActionListener(this); // Add action listener to the button
        frame.add(button);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            JOptionPane.showMessageDialog(null, "Button Clicked!");
        }
    }
}
