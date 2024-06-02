import java.util.Scanner;
public class UserInput {
    public static void main(String[] args) {
        System.out.println("Enter the Input");
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the first number");
        int num = sc.nextInt();
        System.out.println("Enter the second number");
        int num1 = sc.nextInt();
        int sum = num + num1;
        System.out.println("The sum is:"+sum);

    }
}
