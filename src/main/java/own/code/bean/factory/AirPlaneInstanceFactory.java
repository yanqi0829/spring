package own.code.bean.factory;

import own.code.bean.AirPlane;

/**
 * 实例工厂
 */
public class AirPlaneInstanceFactory {

    public AirPlane getAirPlane(String name) {
        AirPlane airPlane = new AirPlane(name);
        airPlane.setFdj("asdas");
        airPlane.setFjName("asdasdasd");
        airPlane.setNum("123123");
        airPlane.setJzName(name);
        airPlane.setYc("12");
        return airPlane;
    }
}
