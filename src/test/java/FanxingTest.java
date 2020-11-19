import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import own.code.fanxing.BookService;
import own.code.fanxing.UserService;
import own.code.servlet.BookServlet;

@ContextConfiguration(locations = "classpath:ioc4.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class FanxingTest {

    @Autowired
    private BookService bookServlet;
    @Autowired
    private UserService userService;

    @Test
    public void test001() {
        bookServlet.save();
        userService.save();

    }
}
