package lesson10.libraryapp.book;

import lesson10.libraryapp.author.Author;

public class Book {

    private Integer id;
    private String title;
    protected Author author;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public void addAuthor(Author author) {
        this.author = author;
        author.addBook(this);
    }

}
