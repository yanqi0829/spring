package own.code.bean.factory;

import own.code.bean.AirPlane;

/**
 * 静态工厂
 */
public class AirPlaneStaticFactory {
   public static AirPlane getAirPlane(String name) {
        AirPlane airPlane = new AirPlane(name);
        airPlane.setFdj("asdas");
        airPlane.setFjName("asdasdasd");
        airPlane.setNum("123123");
        airPlane.setJzName(name);
        airPlane.setYc("12");
        return airPlane;
    }
}
