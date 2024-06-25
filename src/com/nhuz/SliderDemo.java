package com.nhuz;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class SliderDemo implements ChangeListener {
    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;
    JProgressBar bar;


    SliderDemo(){
        frame=new JFrame("Slider Demo");
        panel=new JPanel();
        label=new JLabel();
//        slider=new JSlider(0,100,50);
//        slider.setPreferredSize(new Dimension(200,200));
//        slider.setPaintTicks(true);
//        slider.setMinorTickSpacing(10);
//        slider.setPaintTrack(true);
//        slider.setPaintLabels(true);
//        label.setText("Value="+slider.getValue());
//        slider.addChangeListener(this);
//
//        panel.add(slider);
//        panel.add(label);
//        frame.add(panel);
        frame.setSize(1000,1000);



        //progress bar

        bar=new JProgressBar();
        bar.setBounds(300,500,500,100);
        bar.setStringPainted(true);
        bar.setValue(0);

        frame.add(bar);
        fill();
        frame.setLayout(null);
        frame.setVisible(true);
    }
//    public void fill(){
//        int counter=0;
//        while(counter<=100){
//            bar.setValue(counter);
//            try{
//                Thread.sleep(500);
//            }catch(InterruptedException e){
//                e.printStackTrace();
//            }
//            counter++;
//        }
//        bar.setString("Progress Completed");
//    }

    public void fill() {
        new Thread(() -> {
            int counter = 0;
            while (counter <= 100) {
                bar.setValue(counter);
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                counter++;
            }
            bar.setString("Progress Completed");
        }).start();
    }

    @Override
    public void stateChanged(ChangeEvent e) {
        label.setText("Value="+slider.getValue());
    }

    public static void main(String[] args) {
        SliderDemo sliderDemo=new SliderDemo();
    }
}
