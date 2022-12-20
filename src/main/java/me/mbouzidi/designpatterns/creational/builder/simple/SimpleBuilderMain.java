package me.mbouzidi.designpatterns.creational.builder.simple;

public class SimpleBuilderMain {
    public static void main(String[] args) {
        Car sportCar = new Car.CarBuilder()
                .seats(2)
                .engine("Simple SPORT Engine")
                .tripComputer("Intel")
                .GPS("GARMIN GPS")
                .build();
        System.out.println(sportCar);
    }
}
