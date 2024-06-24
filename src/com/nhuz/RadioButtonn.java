package com.nhuz;

import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RadioButtonn extends JFrame implements ActionListener {
    JCheckBox checkBox;
    JButton button;
    RadioButtonn(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setVisible(true);


        checkBox=new JCheckBox();
        checkBox.setText("I am not robot");
        checkBox.setFocusable(false);
        this.add(checkBox);

        JRadioButton button1=new JRadioButton();
        JRadioButton button2=new JRadioButton();
        JRadioButton button3=new JRadioButton();
        ButtonGroup group=new ButtonGroup();
        group.add(button1);
        group.add(button2);
        group.add(button3);

        this.add(button2);
        this.add(button1);
        this.add(button3);

        button=new JButton("Submit");
        button.addActionListener(this);
        this.add(button);



        //combobox
        String[] animals={"cat","dog","mouse"};
        JComboBox comboBox=new JComboBox(animals);

        this.add(comboBox);
        this.pack();


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println(checkBox.isSelected());
        }

    }

    public static void main(String[] args) {
        RadioButtonn radio=new RadioButtonn();
    }
}
