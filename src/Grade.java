import java.util.Scanner;
import java.lang.String;

public class Grade {
    public static void main(String[] args) {
        System.out.println("GPA Calculator");
        Scanner input= new Scanner(System.in);
        System.out.println("Enter marks of Maths");
        double m1 =input.nextDouble();
        System.out.println("Enter marks of English");
        double m2 =input.nextDouble();
        System.out.println("Enter marks of Economics");
        double m3 =input.nextDouble();
        System.out.println("Enter marks of Computer");
        double m4 =input.nextDouble();
        System.out.println("Enter marks of Account");
        double m5 =input.nextDouble();
        if(m1 > 32 && m2 > 32 && m3 > 32 && m4 > 32 && m5 > 32) {
            //converting the grade it gpa
            float g1= gradeConverter(m1);
            float g2= gradeConverter(m2);
            float g3= gradeConverter(m3);
            float g4= gradeConverter(m4);
            float g5= gradeConverter(m5);
            float cgpa = (g1+g2+g3+g4+g5)/5;
            System.out.println("Your CGPA is:"+cgpa);
        }
        else {
            System.out.println("Sorry! You Failed");
        }
    }
//function to convert the grade
    public static float gradeConverter(double m){
        if(m>90){
            return 4.0f;
        }
        else if(m>80){
            return 3.6f;
        }
        else if(m>70){
            return 3.2f;
        }
        else if (m > 60) {
            return 2.8f;
        }
        else if(m > 50){
            return 2.4f;
        }
        else{
            return 2.0f;
        }
    }
}

