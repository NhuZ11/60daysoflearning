import java.util.*;

class RunnableThread1 implements Runnable{
    public void run(){
        System.out.println("This is thread 1.");
        System.out.println("This is thread 1.");
        System.out.println("This is thread 1.");
        System.out.println("This is thread 1.");
        System.out.println("This is thread 1.");
        System.out.println("This is thread 1.");

    }
}
class RunnableThread2 implements Runnable{
    public void run(){
        System.out.println("This is thread 2.");
        System.out.println("This is thread 2.");
        System.out.println("This is thread 2.");
        System.out.println("This is thread 2.");
        System.out.println("This is thread 2.");
        System.out.println("This is thread 2.");
        System.out.println("This is thread 2.");

    }
}
public class ThreadExample {
    public static void main(String[] args) {
        RunnableThread1 th1= new RunnableThread1();
        Thread t1= new Thread(th1);
        RunnableThread2 th2= new RunnableThread2();
        Thread t2= new Thread(th2);
        t1.start();
        t2.start();

    }
}
