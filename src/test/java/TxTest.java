import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import own.code.tx.Book1Service;

import javax.sql.DataSource;
import java.sql.Connection;

public class TxTest {
    ApplicationContext ioc = new ClassPathXmlApplicationContext("tx.xml");
    JdbcTemplate jdbcTemplate = ioc.getBean(JdbcTemplate.class);

    @Test
    public void test01() {
        System.out.println(jdbcTemplate);
//        jdbcTemplate.update()
//        jdbcTemplate.batchUpdate()  批量执行
//        jdbcTemplate.queryForObject() 查询单个对象
//        jdbcTemplate.query()  查询一个集合List
    }

    @Test
    public void test02() {
        Book1Service bean = ioc.getBean(Book1Service.class);
        System.out.println(bean);
        bean.checkout("Tom","ISBN-001");

    }
}
