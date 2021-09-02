package learn.java.library.libraryadmin.service;

import learn.java.library.libraryadmin.model.Book;

import java.util.List;

public interface BookServer {

    public List<Book> getAllBooks();

    public List<Book> getBooksByISBN(String isbn);

    public List<Book> getBooksByName();

    public List<Book> getBooksByAuthor();

    public List<Book> getBooksByPublisher();


}
