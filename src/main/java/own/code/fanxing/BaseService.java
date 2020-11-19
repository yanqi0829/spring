package own.code.fanxing;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

public class BaseService<T> {
    @Autowired
    BaseDao<T> baseDao;

    public void save() {
        baseDao.save();
    }
}
