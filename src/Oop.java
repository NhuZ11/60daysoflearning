import java.util.Scanner;
import
class Book{
    private String title;
    private String author;

    Book(String title, String author){
        this.title=title;
        this.author=author;
    }
    public String getTitle(){return title;}

}


public class Oop {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter the title of book");
        String bookTitle= input.nextLine();
        System.out.println("Enter the name of author");
        String authorName= input.nextLine();
        Book book= new Book(bookTitle,authorName);

        System.out.println("The name of the book is"+book.getTitle());



    }
}
