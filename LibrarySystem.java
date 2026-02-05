abstract class LibraryItem {
    private String title;
    private String author;
    private int itemId;
    private boolean isAvailable;

    public LibraryItem(String title, String author, int itemId) {
        this.title = title;
        this.author = author;
        this.itemId = itemId;
        this.isAvailable = true;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getItemId() {
        return itemId;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        this.isAvailable = available;
    }

    public abstract void displayInfo();
}

class Book extends LibraryItem {
    private String genre;

    public Book(String title, String author, int itemId, String genre) {
        super(title, author, itemId);
        this.genre = genre;
    }

    @Override
    public void displayInfo() {
        System.out.println("Book ID: " + getItemId());
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Genre: " + genre);
        System.out.println("Available: " + (isAvailable() ? "Yes" : "No"));
        System.out.println("------------------------");
    }
}

class Member {
    private String name;
    private int memberId;

    public Member(String name, int memberId) {
        this.name = name;
        this.memberId = memberId;
    }

    public String getName() {
        return name;
    }

    public int getMemberId() {
        return memberId;
    }

    public void borrowBook(Book book) {
        if (book.isAvailable()) {
            book.setAvailable(false);
            System.out.println(name + " borrowed the book: " + book.getTitle());
        } else {
            System.out.println("Sorry, the book is not available.");
        }
    }

    public void returnBook(Book book) {
        book.setAvailable(true);
        System.out.println(name + " returned the book: " + book.getTitle());
    }
}

public class LibrarySystem {
    public static void main(String[] args) {
        Book b1 = new Book("Java Programming", "James Gosling", 101, "Programming");
        Book b2 = new Book("The Alchemist", "Paulo Coelho", 102, "Fiction");

        Member m1 = new Member("Navya", 201);

        System.out.println(" Library Books:");
        b1.displayInfo();
        b2.displayInfo();

        m1.borrowBook(b1);
        m1.borrowBook(b1);
        m1.returnBook(b1);

        System.out.println("\n Book Status After Transactions:");
        b1.displayInfo();
        b2.displayInfo();
    }
}
