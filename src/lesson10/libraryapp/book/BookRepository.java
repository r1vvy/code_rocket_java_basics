package lesson10.libraryapp.book;

import lesson10.libraryapp.author.Author;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class BookRepository {

    private Integer bookIdSequence = 0;
    private Map<Integer, Book> repository = new HashMap<>();

    public List<Book> findAllByStartWith(String prefix) {
        return repository.values().stream()
                         .filter(book -> book.getTitle().startsWith(prefix))
                         .collect(Collectors.toList());
    }

    public Optional<Book> findById(Integer id) {
        return Optional.ofNullable(repository.get(id));
    }
    public Book save(Book book) {
        book.setId(bookIdSequence);
        bookIdSequence++;

        repository.put(book.getId(), book);

        return book;
    }

    public Book delete(Book book) {
        this.repository.remove(book.getId());

        return book;
    }
}
