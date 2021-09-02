package learn.java.library.libraryadmin.service.impl;

import learn.java.library.libraryadmin.mapper.BookMapper;
import learn.java.library.libraryadmin.model.Book;
import learn.java.library.libraryadmin.model.BookExample;
import learn.java.library.libraryadmin.service.BookServer;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServerImpl implements BookServer {

    BookMapper bookMapper;

    @Autowired
    public BookServerImpl(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public List<Book> getBooksByISBN(String isbn) {
        BookExample bookExample = new BookExample();
        BookExample.Criteria criteria = bookExample.createCriteria();
        criteria.andIsbnEqualTo(isbn);
        return bookMapper.selectByExample(bookExample);
    }

    @Override
    public List<Book> getBooksByName() {
        return null;
    }

    @Override
    public List<Book> getBooksByAuthor() {
        return null;
    }

    @Override
    public List<Book> getBooksByPublisher() {
        return null;
    }



    public List<Book> getAllBooks() {
        BookExample bookExample = new BookExample();
        BookExample.Criteria criteria = bookExample.createCriteria();
        return bookMapper.selectByExample(bookExample);
    }

}
