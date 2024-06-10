import java.util.Scanner;

public class ExceptionHandling {
    public static int divison(int a, int b) throws ArithmeticException{
        int div=a/b;
        return div;
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int a= input.nextInt();
        int b=input.nextInt();

        try{
            int divide=a/b;
            divison(5,0);
            System.out.println(divide);
        }
        catch (Exception e){
            System.out.println("Error:"+e.getMessage());

        }
    }
}
