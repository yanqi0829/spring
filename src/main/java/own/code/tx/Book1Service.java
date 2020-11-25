package own.code.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class Book1Service {
    @Autowired
    Book1Dao book1Dao;
@Transactional
    public void checkout(String username, String isbn) {
        book1Dao.updateStock(isbn);
        int price = book1Dao.getPrice(isbn);
        int i=1/0;
        book1Dao.updateBalance(username, price);
    }
}
