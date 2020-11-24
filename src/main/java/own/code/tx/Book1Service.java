package own.code.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Book1Service {
    @Autowired
    Book1Dao book1Dao;

    public void checkout(String username, String isbn) {
        book1Dao.updateStock(isbn);
        int price = book1Dao.getPrice(isbn);
        book1Dao.updateBalance(username, price);
    }
}
