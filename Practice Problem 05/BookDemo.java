public class BookDemo {
    String title;
    String author;

    BookDemo(String title) {
        this.title = title;
        this.author = "Unknown";
    }

    BookDemo(String title, String author) {
        this.title = title;
        this.author = author;
    }

    void displayInfo() {
        System.out.println("Title: " + title + ", Author: " + author);
    }

    public static void main(String[] args) {
        BookDemo book1 = new BookDemo("Java Programming");
        BookDemo book2 = new BookDemo("Clean Code", "Robert Martin");
        book1.displayInfo();
        book2.displayInfo();
    }
}
