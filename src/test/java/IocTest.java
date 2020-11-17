import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import own.code.bean.Person;

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

    }
}
