package own.code.servlet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import own.code.service.BookService;

@Controller
public class BookServlet {
    @Autowired
   @Qualifier("bookServiceExt") //指定一个名作为id
    private BookService bookService;

    public void doGet() {
        bookService.save();
    }
}
