package own.code.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * 1.编写后置处理器的实现类
 * 2.将后置处理器注册在 配置文件中
 */
public class MyBeanPostProcessor implements BeanPostProcessor {
    /**
     * 初始化之前调用
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessBeforeInitialization"+bean+"将要调用初始化方法了");
       //返回传入的bean
        return bean;
    }

    /**
     * 初始化之后调用
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("postProcessAfterInitialization"+bean+"初始化方法调用完了");
        //返回传入的bean,返回的是什么，容器中保存的就是什么
        return bean;
    }
}
