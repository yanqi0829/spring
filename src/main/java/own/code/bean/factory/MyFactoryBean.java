package own.code.bean.factory;

import org.springframework.beans.factory.FactoryBean;
import own.code.bean.AirPlane;

public class MyFactoryBean implements FactoryBean<AirPlane> {

    public AirPlane getObject() throws Exception {
        System.out.println("spring 调用 getObject   自动创建对象");
        AirPlane airPlane = new AirPlane();
        airPlane.setFjName("FactoryBean");
        return airPlane;
    }

    /**
     * 返回创建对象的类型
     */
    public Class<?> getObjectType() {
        return null;
    }

    public boolean isSingleton() {
        return false;
//        return true;
    }
}
