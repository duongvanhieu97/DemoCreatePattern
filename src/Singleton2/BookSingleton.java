package Singleton2;

public class BookSingleton {
    private static BookSingleton book;
    private static boolean isLoanedOut;
    private final String author;
    private final String title;

//    Khởi tạo Thuộc tính trong book
    private BookSingleton() {
        author = "Gamma, Helm, Johnson, and Vlissides";
        title = "Design Patterns";
        book = null;
        isLoanedOut = false;
    }

    public static BookSingleton borrowBook() {
//     Kiểm tra xem Singleton được tạo ra chưa
        if (!isLoanedOut) {
            if (book == null) {
                book = new BookSingleton();
            }
            isLoanedOut = true;
            return book;
        }
        return null;
    }

//    Các thuộc tính dưới là lấy các phương thức.
    public void returnBook(BookSingleton bookReturned) {
        isLoanedOut = false;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorAndTitle() {
        return getTitle() + " by " + getAuthor();
    }
}
