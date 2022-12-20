package me.mbouzidi.designpatterns.creational.builder.director;

import me.mbouzidi.designpatterns.creational.builder.Car;
import me.mbouzidi.designpatterns.creational.builder.Manual;

public class DirectorMain {
    public static void main(String[] args) {
        Director director = new Director();

        //Build Sport Car
        CarBuilder carBuilder = new CarBuilder();
        director.constructSportCar(carBuilder);
        Car car = carBuilder.getProduct();
        System.out.println(car);

        //Build Sport Car Manual
        ManualBuilder manualBuilder = new ManualBuilder();
        director.constructSportCarManual(manualBuilder);
        Manual manual = manualBuilder.getProduct();
        System.out.println(manual);

    }
}
