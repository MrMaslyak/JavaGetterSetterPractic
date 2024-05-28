import java.util.ArrayList;

public class Library {
    ArrayList<Book> books = new ArrayList<>();
    private static int countBooks = 0;

    public Library() {
        this.books = books;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public static void setCountBooks(int countBooks) {
        Library.countBooks = countBooks;
    }

    public static int getCountBooks() {
        return countBooks;
    }


    public void printBooks() {
        System.out.println("Full list of books:");
        for (Book book : books) {
            System.out.println(" - " + book);
        }
        System.out.println("Value Books in the library: " + countBooks);
    }

    public void addBook(Book book) {
        books.add(book);
        countBooks++;
        System.out.println("We add this book: " + book.getName() + " by " + book.getAuthor());
    }

    public void removeBook(Book book) {
        books.remove(book);
        countBooks--;
        System.out.println("We remove this book: " + book.getName() + " by " + book.getAuthor());
    }

    public void searchBookForName(String title) {
        for (Book book : books) {
            if (book.getName().equalsIgnoreCase(title)) {
                System.out.println("We found this book through title: " + book);
                return;
            }
        }
        System.out.println("No book found by the title: " + title);
    }

    public void searhBookForAuthor(String author) {
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                System.out.println("We found this book through author: " + book);
                return;
            }
        }
        System.out.println("No book found by the author: " + author);
    }

}
