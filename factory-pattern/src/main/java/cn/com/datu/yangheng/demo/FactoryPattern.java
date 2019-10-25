package cn.com.datu.yangheng.demo;

import cn.com.datu.yangheng.demo.model.Bike;
import cn.com.datu.yangheng.demo.model.Car;
import cn.com.datu.yangheng.demo.model.Vehicle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.Map;

/**
 * @author yangheng
 * @Classname FactoryPattern
 * @Description TODO
 * @Date 2019/10/25 10:21
 * @group smart video north
 */
public class FactoryPattern {
    private static final Logger LOGGER = LoggerFactory.getLogger(FactoryPattern.class);

    private Map<String, Class> registerVehicle = new HashMap<String, Class>();

    public enum VehicleType {
        bike, car
    }

    public static Vehicle create(VehicleType type) {

        if (type.equals(VehicleType.bike)) {
            return new Bike();
        } else if (type.equals(VehicleType.car)) {
            return new Car();
        }
        return null;
    }

    /**
     * 工厂模式，注册一个子类
     * @param vehicleId
     * @param clazz
     */
    public void registerVehicle(String vehicleId, Class clazz) {
        registerVehicle.put(vehicleId, clazz);
    }

    /**
     * 工厂模式，通过反射获取指定的子类
     * @param vehicelId
     * @return
     * @throws IllegalAccessException
     * @throws InstantiationException
     */
    public Vehicle createVehicle(String vehicelId) throws IllegalAccessException, InstantiationException {
        Class clazz = registerVehicle.get(vehicelId);
        return (Vehicle) clazz.newInstance();
    }
}
