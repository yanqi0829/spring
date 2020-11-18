package own.code.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

@Repository
//@Scope(value = "prototype")  //默认是单例的
public class BookDao {
    public  void saveBook(){
        System.out.println("保存书籍");
    }

}
