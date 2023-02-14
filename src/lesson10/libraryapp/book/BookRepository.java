package lesson10.libraryapp.book;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class BookRepository {

    private Map<Integer, Book> repository = new HashMap<>();

    public List<Book> findAllByStartWith(String prefix) {
        return repository.values().stream()
                         .filter(book -> book.getTitle().startsWith(prefix))
                         .collect(Collectors.toList());
    }
}
