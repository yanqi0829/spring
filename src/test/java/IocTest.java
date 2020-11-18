import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import own.code.bean.AirPlane;
import own.code.bean.Book;
import own.code.bean.Person;
import own.code.servlet.BookServlet;

public class IocTest {
    // ClassPathXmlApplicationContext:当前应用的xml配置文件在classpath下
    private ApplicationContext ioc = new ClassPathXmlApplicationContext("ioc.xml");

    /**
     * 存在几个问题：
     * 1、src，源码包开始的路径，称为类路径的开始
     * 所有源码包里面的东西会被合并放在类路径里面 E:\ownCode\spring\target\classes
     * web：在/WEB-INF/classes/ 下
     */
    @Test
    public void test01() {

        System.out.println("容器启动完成、、、");
        Person person01 = (Person) ioc.getBean("person01");
        System.out.println(person01);
        //单例的
        Person person1 = (Person) ioc.getBean("person01");
        System.out.println(person01 == person1);
    }

    /**
     * 实验2：根据bean的类型从IOC容器中获取bean的实例★
     */
    @Test
    public void test02() {
        Person bean = ioc.getBean(Person.class);
        System.out.println(bean);
        Person bean2 = ioc.getBean("person01", Person.class);
        System.out.println(bean2);
    }

    @Test
    public void test03() {
        Person bean = ioc.getBean("person03", Person.class);
        System.out.println(bean);
        Person bean1 = ioc.getBean("person04", Person.class);
        System.out.println(bean1);
    }

    /**
     * 实验4：正确的为各种属性赋值
     */
    @Test
    public void test04() {
        ApplicationContext ioc2 = new ClassPathXmlApplicationContext("ioc2.xml");
        Person bean = ioc2.getBean("person01", Person.class);
        System.out.println(bean);
        Person bean1 = ioc2.getBean("person02", Person.class);
        System.out.println(bean1);
    }

    /**
     * 实验5：通过继承实现bean配置信息的重用
     */
    @Test
    public void test05() {
        Person bean = ioc.getBean("person05", Person.class);
        System.out.println(bean);
    }

    /**
     * 实验6：：配置通过静态工厂方法创建的bean、实例工厂方法创建的bean、FactoryBean★
     */
    @Test
    public void test06() {
        AirPlane bean = (AirPlane) ioc.getBean("airPlane01");
        System.out.println(bean);
        AirPlane bean2 = (AirPlane) ioc.getBean("airPlane02");
        System.out.println(bean2);
        AirPlane bean3 = (AirPlane) ioc.getBean("airPlane03");
        System.out.println(bean3);
    }

    /**
     * 创建带有生命周期方法的bean
     */
    @Test
    public void test07() {
        Book bean = (Book) ioc.getBean("book001");
        System.out.println(bean);
        ConfigurableApplicationContext cc = (ConfigurableApplicationContext) ioc;
        cc.close();

    }
    @Test
    public void test08() {
        Object bean = ioc.getBean("dataSource");
    }

    /**
     * 注解
     */
    @Test
    public void test09() {
        ApplicationContext ioc3 = new ClassPathXmlApplicationContext("ioc3.xml");
        Object bean = ioc3.getBean("bookDao");
        System.out.println(bean);
    }

    /**
     * 自动注入
     */
    @Test
    public void test10() {
        ApplicationContext ioc3 = new ClassPathXmlApplicationContext("ioc3.xml");
        BookServlet bean =(BookServlet) ioc3.getBean("bookServlet");
        bean.doGet();
    }

}
