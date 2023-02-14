package lesson10.libraryapp.book;

import lesson10.libraryapp.EntityNotFoundException;

import java.util.List;

public class BookService {

    private final BookRepository bookRepository;
    private final BookDtoConverter bookDtoConverter;


    public BookService(BookRepository bookRepository, BookDtoConverter bookDtoConverter) {
        this.bookRepository = bookRepository;
        this.bookDtoConverter = bookDtoConverter;
    }

    public BookDto save(Book book) {
        Book savedBook = bookRepository.save(book);

        return bookDtoConverter.convert(book);
    }

    public BookDto delete(Book book) {
        Book deletedBook = bookRepository.delete(book);

        return bookDtoConverter.convert(book);
    }

    public List<BookDto> getAllBooksByStartWith(String prefix) {
        List<BookDto> bookDtos =  bookRepository.findAllByStartWith(prefix)
                .stream()
                .map(bookDtoConverter::convert)
                .toList();

        if(bookDtos.stream().anyMatch(bookDto -> bookDto.getTitle().startsWith(prefix))) {
            return bookDtos;
        } else {
            throw new EntityNotFoundException("Book's title that starts with this prefix: " + prefix + " not found!");
        }
    }

    public BookDto getBookById(Integer id) {
        return this.bookRepository.findById(id)
                .map(bookDtoConverter::convert)
                .orElseThrow(() -> new EntityNotFoundException("Book not found with id = " + id));
    }
}
