package edu.hawking;

/**
 * 杜皓君 created by 2021/5/20
 * YellowPerson
 **/
public class YellowPerson implements Person{

    private Car car;

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public Car getCar() {
        return car;
    }
}
