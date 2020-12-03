package own.code.tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Service
public class Book1Service {
    @Autowired
    Book1Dao book1Dao;

//    @Transactional(timeout = 3,readOnly = false,noRollbackFor = {ArithmeticException.class,NullPointerException.class})
//    @Transactional(propagation = Propagation.REQUIRED)
    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void checkout(String username, String isbn) {
        book1Dao.updateStock(isbn);
        int price = book1Dao.getPrice(isbn);
//    try {  将异常try catch起来将不会回滚
//    } catch (Exception e) {
//    }
        /*try {
            Thread.sleep(4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        book1Dao.updateBalance(username, price);
//        int i = 1 / 0;
    }
    @Transactional(propagation = Propagation.REQUIRED)

    public  void updatePrice(String isbn,int price){
        book1Dao.updatePrice(isbn,price);
        int i=10/0;
    }
}
