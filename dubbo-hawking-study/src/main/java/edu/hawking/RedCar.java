package edu.hawking;

import org.apache.dubbo.common.URL;

/**
 * 杜皓君 created by 2021/5/20
 * RedCar
 **/
public class RedCar implements Car{
    @Override
    public String getCarName(URL url) {
        return "RedCar";
    }
}
