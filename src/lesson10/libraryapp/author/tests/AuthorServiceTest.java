package lesson10.libraryapp.author.tests;

import lesson10.libraryapp.author.Author;
import lesson10.libraryapp.author.AuthorDtoConverter;
import lesson10.libraryapp.author.AuthorRepository;
import lesson10.libraryapp.author.AuthorService;
import lesson10.libraryapp.book.Book;

import java.util.ArrayList;
import java.util.List;

public class AuthorServiceTest {

    public static void main(String[] args) {
        shouldReturnBooksCreatedByAuthor();
    }
    public static void shouldReturnBooksCreatedByAuthor() {

        Author author = new Author();

        List<Book> books = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Book bookToAdd = new Book();
            books.add(bookToAdd);
        }

        author.addBooks(books);
        if(author.getBooks().isEmpty() || author.getBooks() == null) {
            System.err.println("shouldReturnBooksCreatedByAuthor: FAIL, expected: List of Author's books, actual: Author has no books");
        } else {
            System.out.println("shouldReturnBooksCreatedByAuthor: SUCCESS");
        }
    }
}
