package lesson10.libraryapp.author;

import lesson10.libraryapp.EntityNotFoundException;
import lesson10.libraryapp.book.Book;

import java.util.List;

public class AuthorService {

    private final AuthorRepository authorRepository;
    private final AuthorDtoConverter authorDtoConverter;

    public AuthorService(AuthorRepository authorRepository, AuthorDtoConverter authorDtoConverter) {
        this.authorRepository = authorRepository;
        this.authorDtoConverter = authorDtoConverter;
    }

    public AuthorDto save(Author author) {
        Author savedAuthor = authorRepository.save(author);
        return authorDtoConverter.convert(savedAuthor);
    }

    public AuthorDto getAuthorById(Integer id) {
//        Author author = authorRepository.findAuthorById(id);
//        if (author == null) {
//            throw new EntityNotFoundException();
//        }
//        AuthorDto dto = authorDtoConverter.convert(author);
//        return dto;
//
        return authorRepository.findAuthorById(id)
                               .map(authorDtoConverter::convert)
                               .orElseThrow(() -> new EntityNotFoundException("Author not found with id = " + id));
    }
    public List<Book> getBooksByAuthor(Author author) {
        return getAuthorById(author.getId()).getBooks();
    }

    public String getAuthorNameById(Integer id) {
        return authorRepository.findAuthorById(id)
                               .map(Author::getName)
                               .orElseThrow(() -> new EntityNotFoundException("Author not found with id = " + id));
    }
}
