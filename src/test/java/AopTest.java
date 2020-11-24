import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import own.aop.Calculator;
import own.aop.MyMathCalculatorImpl;
import own.code.servlet.BookServlet;

public class AopTest {
    @Test
    public void test001() {
        ApplicationContext ioc3 = new ClassPathXmlApplicationContext("aop.xml");
        /**
         * 1.从ioc容器中拿到目标对象:注意:如果想要用类型没一定用它的接口类型，不要用本类
         * AOP的底层是动态代理，容器中保存的组件是它的代理对象
         */
        Calculator bean = ioc3.getBean(Calculator.class);
        Calculator bean2 = (Calculator) ioc3.getBean("myMathCalculatorImpl");
        bean.add(1, 1);
        System.out.println(bean);
        System.out.println(bean.getClass());
    }
    @Test
    public void test002() {
        ApplicationContext ioc3 = new ClassPathXmlApplicationContext("aop.xml");

        MyMathCalculatorImpl bean = ioc3.getBean(MyMathCalculatorImpl.class);
        bean.div(1, 0);
        System.out.println(bean);//own.aop.MyMathCalculatorImpl@6a2b953e
        //没有接口就是本类类型，cglib创建好的代理对象
        System.out.println(bean.getClass()); //class own.aop.MyMathCalculatorImpl$$EnhancerBySpringCGLIB$$29a1d696
    }
}
