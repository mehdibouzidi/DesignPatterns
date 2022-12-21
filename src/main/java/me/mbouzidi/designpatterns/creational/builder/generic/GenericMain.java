package me.mbouzidi.designpatterns.creational.builder.generic;

import me.mbouzidi.designpatterns.creational.builder.Car;
import me.mbouzidi.designpatterns.creational.builder.Manual;

public class GenericMain {
    public static void main(String[] args) {
        Car genericSportCar = GenericBuilder.of(Car::new)
                .with(Car::setSeats, 2)
                .with(Car::setEngine, "Sport Generic Engine")
                .with(Car::setTripComputer, "Generic Computer")
                .with(Car::setGPS, "Normal GPS")
                .build();
        System.out.println(genericSportCar);

        Manual genericSportCarManual = GenericBuilder.of(Manual::new)
                .with(Manual::setSeats, 2)
                .with(Manual::setEngine, "Sport Generic Engine Manual")
                .with(Manual::setTripComputer, "Generic Computer  Manual")
                .with(Manual::setGPS, "Normal GPS  Manual")
                .build();
        System.out.println(genericSportCarManual);

        Person me = GenericBuilder.of(Person::new)
                .with(Person::setFirstName, "Mehdi")
                .with(Person::setLastName, "BOUZIDI")
                .build();
        System.out.println(me);
    }
}
