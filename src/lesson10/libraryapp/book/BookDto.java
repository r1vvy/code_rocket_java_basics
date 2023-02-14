package lesson10.libraryapp.book;

import lesson10.libraryapp.author.Author;

public class BookDto {
    private String title;
    private Author author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

}
