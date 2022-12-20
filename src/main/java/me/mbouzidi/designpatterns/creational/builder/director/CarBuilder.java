package me.mbouzidi.designpatterns.creational.builder.director;

import me.mbouzidi.designpatterns.creational.builder.Car;

public class CarBuilder implements IBuilder{
    private Car car;

    public CarBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.car = new Car();
    }

    @Override
    public void setSeats(int seats) {
        this.car.setSeats(seats);
    }

    @Override
    public void setEngine(String engine) {
        this.car.setEngine(engine);
    }

    @Override
    public void setTripComputer(String tripComputer) {
        this.car.setTripComputer(tripComputer);
    }

    @Override
    public void setGPS(String GPS) {
        this.car.setGPS(GPS);
    }

    public Car getProduct(){
        Car result = this.car;
        this.reset();
        return result;
    }
}
