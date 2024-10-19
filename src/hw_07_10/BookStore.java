package hw_07_10;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BookStore {
    private List<Book> books;

    public BookStore() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public List<Book> findBooksByAuthor(String author) {
        return books.stream()
                .filter(book -> book.getAuthors().contains(author))
                .collect(Collectors.toList());
    }

    public List<Book> findBooksByPublisher(String publisher) {
        return books.stream()
                .filter(book -> book.getPublisher().equalsIgnoreCase(publisher))
                .collect(Collectors.toList());
    }

    public List<Book> findBooksAfterYear(int year) {
        return books.stream()
                .filter(book -> book.getYear() > year)
                .collect(Collectors.toList());
    }

    public void displayBooks(List<Book> books) {
        if (books.isEmpty()) {
            System.out.println("Нет книг по заданному критерию.");
        } else {
            books.forEach(System.out::println);
        }
    }


}
