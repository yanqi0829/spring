package own.code.fanxing;

import org.springframework.stereotype.Repository;
import own.code.bean.Person;
@Repository
public class UserDao extends BaseDao<Person> {
    @Override
    public void save() {
        System.out.println("保存用户");
    }
}
