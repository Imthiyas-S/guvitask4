package task3managementsystem;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Book added: " + book);
    }

    
    public boolean removeBook(int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId) {
                books.remove(book);
                System.out.println("Book removed: " + book);
                return true;
            }
        }
        System.out.println("Book with ID " + bookId + " not found.");
        return false;
    }

  
    public Book searchBook(int bookId) {
        for (Book book : books) {
            if (book.getId() == bookId) {
                return book;
            }
        }
        return null;
    }


    public void displayBooks() {
        System.out.println("All books in the library:");
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
