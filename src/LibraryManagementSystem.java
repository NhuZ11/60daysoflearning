import java.util.*;
class Library{
    private String bookName;
    private String author;
    String[] books;
    int no_of_books;

    public String getBookName() {
        return bookName;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    Library(){
        this.books= new String[100];
        this.no_of_books=0;
    }

     void addBook(String book){
        this.books[no_of_books]=book;
        no_of_books++;
        System.out.println(book+" "+ "has been added to library");

    }
    public void issueBook(String issuedBook){
        for (int i=0;i<=no_of_books;i++){
            if(this.books[i]==issuedBook){

                System.out.println(issuedBook+"has been issued.");
                this.books[i]=null;

            }
        }

    }
    public void returnBook(String book){
        addBook(book);
        System.out.println(book + "has been returned");

    }
    public void showAvailableBooks(){
        System.out.println("Available books are:");
        for (String book:this.books){
            if(book!=null) {
                System.out.println("* " + book);
            }
        }
    }
}
public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library obj= new Library();
        obj.addBook("Power of subconsious mind");
        obj.addBook("Think And Grow Rich");
        obj.showAvailableBooks();
        obj.issueBook("Think And Grow Rich");
        obj.showAvailableBooks();

        obj.returnBook("Think And Grow Rich");

    }
}
