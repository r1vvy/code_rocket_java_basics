package lesson10.libraryapp.book;

public class BookDtoConverter {

    public BookDto convert(Book book) {
        BookDto dto = new BookDto();

        dto.setTitle(book.getTitle());
        dto.setAuthor(book.getAuthor());

        return dto;
    }
}
