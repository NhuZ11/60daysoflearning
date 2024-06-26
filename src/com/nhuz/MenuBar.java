package com.nhuz;

import javax.swing.*;
import java.awt.*;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.File;

public class MenuBar extends JFrame implements ActionListener {
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu editMenu;
    JButton button;
    MenuBar(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setSize(500,500);
        this.setVisible(true);

        menuBar=new JMenuBar();

         fileMenu= new JMenu("File");
         editMenu= new JMenu("Edit");

         loadItem=new JMenuItem("Load");
         saveItem=new JMenuItem("Save");

         loadItem.addActionListener(this);
         saveItem.addActionListener(this);

         loadItem.setMnemonic(KeyEvent.VK_L);  //shortcut key....sets L  as shortcut

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);


        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        this.setJMenuBar(menuBar);

        button=new JButton("Select a file");
        button.addActionListener(this);
        button.setBounds(10,30,100,20);
        this.add(button);

    }

    public static void main(String[] args) {
        MenuBar menu=new MenuBar();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==loadItem){
            System.out.println("Loading files");
        }

        if(e.getSource()==saveItem){
            System.out.println("Saving Item");
        }

        if(e.getSource()==button){
            JFileChooser fileChooser=new JFileChooser();
            int response= fileChooser.showOpenDialog(null);
            if(response==JFileChooser.APPROVE_OPTION){   //it means same as response==0
                File file=new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }

        }
    }
}
