package Singleton2;

public class DemoSingleton {
    public static void main(String[] args) {
        BookBorrower b1 = new BookBorrower();
        BookBorrower b2 = new BookBorrower();

        b1.borrowBook();
        System.out.println(b1.getAuthorAndTitle());
        b2.borrowBook();
        System.out.println(b2.getAuthorAndTitle());
        b1.returnBook();
        System.out.println("BookBorrower1 returned the book");
//        Do return sách rồi lên phân biệt.
        b2.borrowBook();
        System.out.println("BookBorrower2 Author and Title: ");
        System.out.println(b1.getAuthorAndTitle());
        b1.borrowBook();
        System.out.println(b2.getAuthorAndTitle());


    }
}
