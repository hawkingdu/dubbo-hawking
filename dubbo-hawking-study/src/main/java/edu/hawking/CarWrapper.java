package edu.hawking;

import org.apache.dubbo.common.URL;

/**
 * 杜皓君 created by 2021/5/20
 * CarWrapper
 **/
public class CarWrapper implements Car {
    Car car;

    public CarWrapper(Car car) {
        this.car = car;
    }

    @Override
    public String getCarName(URL url) {
        System.out.println("CarWrapper------getCarName");
        return car.getCarName(url);
    }
}
