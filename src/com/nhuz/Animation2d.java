package com.nhuz;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Animation2d extends JPanel implements ActionListener {

    private int x = 0;
    private int y = 0;
    private int xSpeed = 2;
    private int ySpeed = 2;
    private final int BALL_DIAMETER = 30;
    private final int DELAY = 10;
    private Timer timer;

    public Animation2d() {
        initPanel();
    }

    private void initPanel() {
        this.setBackground(Color.WHITE);
        this.setPreferredSize(new Dimension(400, 300));
        timer = new Timer(DELAY, this);
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawBall(g);
    }

    private void drawBall(Graphics g) {
        g.setColor(Color.BLUE);
        g.fillOval(x, y, BALL_DIAMETER, BALL_DIAMETER);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        moveBall();
        repaint();
    }

    private void moveBall() {
        x += xSpeed;
        y += ySpeed;

        if (x < 0 || x + BALL_DIAMETER > getWidth()) {
            xSpeed = -xSpeed;
        }
        if (y < 0 || y + BALL_DIAMETER > getHeight()) {
            ySpeed = -ySpeed;
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bouncing Ball Animation");
        Animation2d animation = new Animation2d();
        frame.add(animation);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
