package lesson10.libraryapp.author.tests;

import lesson10.libraryapp.EntityNotFoundException;
import lesson10.libraryapp.author.*;
import lesson10.libraryapp.book.Book;

import java.util.ArrayList;
import java.util.List;

public class AuthorServiceTest {

    public static void main(String[] args) {
        shouldReturn3BooksCreatedByAuthor();
        shouldReturnAuthorWithId5();
        shouldReturnAuthorNameIsAdam();
        shouldDeleteAuthorWithId5();
    }
    public static void shouldReturnAuthorWithId5(){
        AuthorRepository authorRepository = new AuthorRepository();
        AuthorDtoConverter authorDtoConverter = new AuthorDtoConverter();
        AuthorService authorService = new AuthorService(authorRepository, authorDtoConverter);

        for (int i = 1; i <= 5; i++) {
            authorService.save(new Author());
        }

        try {
            Author authorFromRepo = authorRepository.findAuthorById(5).get();
            if(authorFromRepo.getId().equals(5)) {
                System.out.println("shouldReturnAuthorWithId5: SUCCESS");
            } else {
                System.err.println("shouldReturnAuthorWithId5: FAIL, expected: Author with id 5, actual: " + authorFromRepo.getId());
            }

        } catch(EntityNotFoundException e) {
            System.err.println("shouldReturnAuthorWithId5: FAIL, expected: Author with id 5, actual: EntityNotFoundException");
        }
    }
    public static void shouldReturn3BooksCreatedByAuthor() {
        AuthorRepository authorRepository = new AuthorRepository();
        AuthorDtoConverter authorDtoConverter = new AuthorDtoConverter();
        AuthorService authorService = new AuthorService(authorRepository, authorDtoConverter);

        Author author = new Author();

        List<Book> books = List.of(
                new Book(),
                new Book(),
                new Book()
        );

        author.addBooks(books);

        authorService.save(author);

        List<Book> authorBooks = authorService.getBooksByAuthor(author);

        if(authorBooks.size() == 2) {
            System.err.println("shouldReturnBooksCreatedByAuthor: FAIL, expected: List of Author's books, actual: Author has no books");
        } else {
            System.out.println("shouldReturnBooksCreatedByAuthor: SUCCESS");
        }
    }

    private static void shouldReturnAuthorNameIsAdam() {
        AuthorRepository authorRepository = new AuthorRepository();
        AuthorDtoConverter authorDtoConverter = new AuthorDtoConverter();
        AuthorService authorService = new AuthorService(authorRepository, authorDtoConverter);

        Author author = new Author();
        author.setName("Adam");

        authorService.save(author);

        try {
            String authorName = authorService.getAuthorNameById(1);
            if(authorName.equals("Adam")) {
                System.out.println("shouldReturnAuthorNameIsAdam: SUCCESS");
            } else {
                System.err.println("shouldReturnAuthorNameIsAdam: FAIL, expected: Adam, actual: " + authorName);
            }
        } catch(EntityNotFoundException e) {
            System.err.println("shouldReturnAuthorNameIsAdam: FAIL, expected: Adam, actual: EntityNotFoundException");
        }
    }

    private static void shouldDeleteAuthorWithId5() {
        AuthorRepository authorRepository = new AuthorRepository();
        AuthorDtoConverter authorDtoConverter = new AuthorDtoConverter();
        AuthorService authorService = new AuthorService(authorRepository, authorDtoConverter);

        List<Author> authors = List.of(
                new Author(),
                new Author(),
                new Author(),
                new Author(),
                new Author()
        );

        authors.forEach(author -> authorService.save(author));
        try {
            Author authorWithId5 = authorRepository.findAuthorById(5).get();
            authorService.delete(authorWithId5);
            System.out.println("shouldDeleteAuthorWithId5: SUCCESS");
        } catch(EntityNotFoundException e) {
            System.out.println("shouldDeleteAuthorWithId5: FAIL, expected: Author with id 5 deleted, actual: EntityNotFoundException");
        }
    }
}
