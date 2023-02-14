package lesson10.libraryapp.book.tests;

import lesson10.libraryapp.EntityNotFoundException;
import lesson10.libraryapp.book.*;

import java.util.ArrayList;
import java.util.List;

public class BookServiceTest {
    public static void main(String[] args) {
        shouldReturnBookDtoAndSaveBook();
        shouldReturnBookDtoAndDeleteBook();
        shouldGetAllBooksByStartWithHarry();
    }

    public static void shouldReturnBookDtoAndSaveBook() {
        BookRepository bookRepository = new BookRepository();
        BookDtoConverter bookDtoConverter = new BookDtoConverter();
        BookService bookService = new BookService(bookRepository, bookDtoConverter);

        Book book = new Book();
        bookService.save(book);

        try {
            BookDto bookDto = bookService.getBookById(book.getId());
            System.out.println("shouldReturnBookDtoAndSaveBook: SUCCESS");
        } catch(EntityNotFoundException e) {
            System.err.println("shouldReturnBookDtoAndSaveBook: FAIL, expected: bookDto returned, actual: " + e.getMessage());
        }
    }


    public static void shouldReturnBookDtoAndDeleteBook() {
        BookRepository bookRepository = new BookRepository();
        BookDtoConverter bookDtoConverter = new BookDtoConverter();
        BookService bookService = new BookService(bookRepository, bookDtoConverter);

        Book book = new Book();
        bookService.save(book);
        bookService.delete(book);

        try {
            BookDto bookDto = bookService.getBookById(book.getId());
            System.err.println("shouldReturnBookDtoAndDeleteBook: FAIL, expected: EntityNotFoundException, actual: Book returned");
        } catch(EntityNotFoundException e) {
            System.out.println("shouldReturnBookDtoAndDeleteBook: SUCCESS");
        }
    }

    public static void shouldGetAllBooksByStartWithHarry() {
        String prefix = "Harry";

        BookRepository bookRepository = new BookRepository();
        BookDtoConverter bookDtoConverter = new BookDtoConverter();
        BookService bookService = new BookService(bookRepository, bookDtoConverter);

        List<Book> books = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            Book bookToAdd = new Book();
            bookToAdd.setTitle("Harry" + " " + "Potter" + " " + i);
            books.add(bookToAdd);
        }

        Book bookToNotReturn = new Book();
        bookToNotReturn.setTitle("Pirates of the Caribbean Sea");
        books.add(bookToNotReturn);

        books.forEach(book -> bookService.save(book));

        try {
            List<BookDto> bookDtos = bookService.getAllBooksByStartWith("Harry");
            if(bookDtos.size() == 3) {
                System.out.println("shouldGetAllBooksByStartWithHarry: SUCCESS");
            } else {
                System.err.println("shouldGetAllBooksByStartWithHarry: FAIL, expected: Returns 3 books with prefix Harry, actual: Returns also books that dont have the prefix");
            }
        } catch(EntityNotFoundException e) {
            System.err.println("shouldGetAllBooksByStartWithHarry: FAIL, expected: Returns 3 books with prefix Harry, actual: " + e.getMessage());
        }
    }

}
