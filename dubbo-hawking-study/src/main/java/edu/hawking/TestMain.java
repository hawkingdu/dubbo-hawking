package edu.hawking;

import org.apache.dubbo.common.URL;
import org.apache.dubbo.common.extension.ExtensionLoader;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * 杜皓君 created by 2021/5/20
 * TestMain
 **/
public class TestMain {

    public static void main(String[] args) {
//        ServiceLoader<Car> cars = ServiceLoader.load(Car.class);
//        for (Car car : cars ) {
//            System.out.println(car.getCarName());
//        }

        ExtensionLoader<Person> extensionLoader = ExtensionLoader.getExtensionLoader(Person.class);
        Person person = extensionLoader.getExtension("yellow");
        URL url = new URL("XX", "localhost", 8080);
        URL newu = url.addParameter("car", "yellow");
        System.out.println(newu.getParameter("car"));
        System.out.println(person.getCar().getCarName(newu));
    }
}
