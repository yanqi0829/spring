import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import own.code.servlet.BookServlet;

@ContextConfiguration(locations = "classpath:ioc3.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringUnitTest {

    @Autowired
    private BookServlet bookServlet;

    @Test
    public void test001() {
        System.out.println(bookServlet);

    }
}
