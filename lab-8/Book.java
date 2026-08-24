
import java.util.Scanner;

public class Book {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name");
        String name = sc.nextLine();
        System.out.println("Enter Price");
        double price = sc.nextDouble();
        BookInsert b1 = new BookInsert();
        BookInsert b2 = new BookInsert(name, price);
        BookInsert b3 = new BookInsert(b2);
        b1.getter();
        b2.getter();
        b3.getter();
    }
}

class BookInsert {
    public String title;
    private double price;

    public BookInsert() {
<<<<<<< HEAD
        this.title = null;
=======
        this.title = "null";
>>>>>>> 2e8c6407aca19cb9b2dc2706ef2119d13d2a9715
        this.price = 500.00;
    }

    public BookInsert(String title, double price) {
        this.title = title;
        this.price = price;
    }

    public BookInsert(BookInsert b) {
        this.title = b.title;
        this.price = b.price;
    }

    void getter() {
        System.out.println("Book Title " + title);
        System.out.println("Book Price " + price);
    }

}
