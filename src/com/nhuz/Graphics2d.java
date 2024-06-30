package com.nhuz;

import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;

public class Graphics2d extends JFrame {
    JPanel panel;
    Graphics2d(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(500,500);
        this.setVisible(true);




    }
    public void paint(Graphics g){
        Graphics2D g2D=(Graphics2D) g;

        g2D.setPaint(Color.blue);
        g2D.setStroke(new BasicStroke(5));

        g2D.drawRect(50,50,200,300);
        g2D.fillOval(50,50,100,100);

        int[] xPoints={100,200,300};
        int[] yPoints={100,200,500};
        g2D.fillPolygon(xPoints,yPoints,3);

    }
    public static void main(String[] args) {
        Graphics2d graphics2d=new Graphics2d();
    }
}
