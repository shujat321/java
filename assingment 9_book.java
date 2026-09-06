class assingment 9_book {
    final String isbn = "978-0135166307";
    String title = "Java Programming";
    String author = "Herbert Schildt";
    double price = 650;

    void displayBook() {
        System.out.println("Book ISBN: " + isbn);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

public class assignment9_library {
    public static void main(String[] args) {
        Book b = new Book();
        b.displayBook();
    }
}
