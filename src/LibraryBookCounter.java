
class Book {
    private String title;
    private String author;
    private double price;


    private static int bookCount = 0;


    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;


        bookCount++;
    }


    public static int getBookCount() {
        return bookCount;
    }


    public void displayBookDetails() {
        System.out.println("Title: " + title + " | Author: " + author + " | Price: $" + price);
    }
}


public class LibraryBookCounter {
    public static void main(String[] args) {

        System.out.println("Initial Book Count: " + Book.getBookCount());
        System.out.println("-------------------------------------------------");


        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", 10.99);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", 14.95);
        Book book3 = new Book("1984", "George Orwell", 12.50);


        book1.displayBookDetails();
        book2.displayBookDetails();
        book3.displayBookDetails();

        System.out.println("-------------------------------------------------");

        System.out.println("Total Books in Library: " + Book.getBookCount());
    }
}

