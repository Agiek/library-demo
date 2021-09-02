package learn.java.library.libraryadmin.api;

import learn.java.library.libraryadmin.model.Book;
import learn.java.library.libraryadmin.service.BookServer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {

    private BookServer bookServer;

    @Autowired
    public BookController(BookServer bookServer) {
        this.bookServer = bookServer;
    }

    @GetMapping("/list")
    public List<Book> getAllBooks() {
        return bookServer.getAllBooks();
    }

    @GetMapping("/isbn")
    public List<Book> getAllBooks(@RequestParam String isbn) {
        return bookServer.getBooksByISBN(isbn);
    }


}
