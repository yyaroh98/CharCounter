package hw_07_10;

public class BookDemo {

    public static void main(String[] args) {
        BookStore bookStore = new BookStore();

        // Добавление книг
        bookStore.addBook(new Book(1, "Война и мир", "Лев Толстой", "Эксмо", 1869, 1225, 500.0, "Твердый"));
        bookStore.addBook(new Book(2, "Преступление и наказание", "Федор Достоевский", "Азбука", 1866, 430, 300.0, "Мягкий"));
        bookStore.addBook(new Book(3, "1984", "Джордж Оруэлл", "Питер", 1949, 328, 450.0, "Твердый"));
        bookStore.addBook(new Book(4, "Мастер и Маргарита", "Михаил Булгаков", "Художественная литература", 1967, 384, 350.0, "Мягкий"));

        // Вывод книг заданного автора
        System.out.println("Книги автора 'Лев Толстой':");
        bookStore.displayBooks(bookStore.findBooksByAuthor("Лев Толстой"));

        // Вывод книг, выпущенных заданным издательством
        System.out.println("\nКниги издательства 'Азбука':");
        bookStore.displayBooks(bookStore.findBooksByPublisher("Азбука"));

        // Вывод книг, выпущенных после заданного года
        System.out.println("\nКниги, выпущенные после 1950 года:");
        bookStore.displayBooks(bookStore.findBooksAfterYear(1950));
    }
}
