package com.nhuz;

import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class RockPaperGUI extends JFrame implements ActionListener {
    JButton btnRock,btnPaper,btnScissor;
    JLabel head,label1, labelResult;
    int stringChoice;


    RockPaperGUI(){
        this.setSize(400, 500);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Rock Paper Scissor Game");
        this.setLayout(new FlowLayout());

        JPanel header = new JPanel();
        head=new JLabel("ROCK PAPER SCISSOR GAME");
        header.add(head);



        this.add(header);

        JPanel body = new JPanel();

        btnRock = new JButton("Rock");
        btnPaper = new JButton("Paper");
        btnScissor = new JButton("Scissor");

        label1 = new JLabel("Enter your Choice:");
        body.add(label1);

        btnRock.addActionListener(this);
        btnPaper.addActionListener(this);
        btnScissor.addActionListener(this);

        body.add(btnRock);
        body.add(btnPaper);
        body.add(btnScissor);
        this.add(body);

        JPanel footer = new JPanel();

        labelResult = new JLabel("");
        footer.add(labelResult);
        this.add(footer);

        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==btnRock){
             stringChoice=0;
        }
        if (e.getSource()==btnScissor){
            stringChoice=1;
        }
        if(e.getSource()==btnPaper){
            stringChoice=2;
        }

        int[] possibleActions = {0, 1, 2};
        Random random = new Random();
        int randomIndex = random.nextInt(possibleActions.length);
        int computerAction = possibleActions[randomIndex];

        switch (stringChoice){
            case 0:
                System.out.println("You Chose Rock");
                break;

            case 1:
                System.out.println("You Chose Scissor");
                break;

            case 2:
                System.out.println("You Chose Paper");
                break;

            default:
                System.out.println("Choose Valid Number");
        }


        switch (computerAction){
            case 0:
                System.out.println("Computer Chose Rock");
                break;

            case 1:
                System.out.println("Computer Chose Scissor");
                break;

            case 2:
                System.out.println("Computer Chose Paper");
                break;
        }

        if(stringChoice==computerAction){
            System.out.println("Its a tie");
            labelResult.setText("Its a tie");
        }
        else if (stringChoice==0) {
            if (computerAction==1){
                System.out.println("Rock Smash scissor, You win");
                labelResult.setText("Rock Smash scissor, You win");
            }else{
                System.out.println("Paper covers rock, You lose");
                labelResult.setText("Paper covers rock, You lose");
            }
        } else if (stringChoice==1) {
            if (computerAction==0){
                System.out.println("Rock Smash Scissor, You lose");
                labelResult.setText("Rock Smash Scissor, You lose");
            }else{
                System.out.println("Scissor cuts paper, You Win");
                labelResult.setText("Scissor cuts paper, You Win");
            }
        } else if (stringChoice==2) {
            if (computerAction==0){
                System.out.println("Paper throws rock, You win");
                labelResult.setText("Paper throws rock, You win");
            }else {
                System.out.println("Scissor cuts paper, You lose");
                labelResult.setText("Scissor cuts paper, You lose");
            }

        }

    }

    public static void main(String[] args) {
        RockPaperGUI rockPaperGUI=new RockPaperGUI();
    }
}
