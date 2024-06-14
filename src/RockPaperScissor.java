/**
 *
 *
 * @author Nhuz
 * @version 1.0
 */


import java.util.Scanner;
import java.util.Random;

public class RockPaperScissor {
    public static void main(String[] args) {

        System.out.println("Enter your choice \n 0 for rock \n 1 for scissor \n 2 for paper");
        Scanner choice= new Scanner(System.in);
        int userAction = choice.nextInt();
        int[] possibleActions = {0, 1, 2};
        Random random = new Random();
        int randomIndex = random.nextInt(possibleActions.length);
        int computerAction = possibleActions[randomIndex];
        switch (userAction){
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

        if(userAction==computerAction){
            System.out.println("Its a tie");
        }
        else if (userAction==0) {
            if (computerAction==1){
                System.out.println("Rock Smash scissor, You win");
            }else{
                System.out.println("Paper covers rock, You lose");
            }
        } else if (userAction==1) {
            if (computerAction==0){
                System.out.println("Rock Smash Scissor, You lose");
            }else{
                System.out.println("Scissor cuts paper, You Win");
            }
        } else if (userAction==2) {
            if (computerAction==0){
                System.out.println("Paper throws rock, You win");
            }else {
                System.out.println("Scissor cuts paper, You lose");
            }

        }


    }
}
