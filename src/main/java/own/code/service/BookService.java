package own.code.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import own.code.dao.BookDao;

@Service("bookServiceExt")
public class BookService {
    @Autowired(required = false)   //(required = false)  找不到就不装配不报错
    private BookDao bookDao;

    public void save() {
        bookDao.saveBook();
    }
}
