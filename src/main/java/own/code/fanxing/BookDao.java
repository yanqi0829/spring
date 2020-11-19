package own.code.fanxing;

import org.springframework.stereotype.Repository;
import own.code.bean.Book;
@Repository
public class BookDao extends BaseDao<Book> {
    @Override
    public void save() {
        System.out.println("保存图书");
    }
}
