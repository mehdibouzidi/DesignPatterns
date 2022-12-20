package me.mbouzidi.designpatterns.creational.builder.director;

import me.mbouzidi.designpatterns.creational.builder.Car;
import me.mbouzidi.designpatterns.creational.builder.Manual;

public class ManualBuilder implements IBuilder{
    private Manual manual;

    public ManualBuilder() {
        this.reset();
    }

    @Override
    public void reset() {
        this.manual = new Manual();
    }

    @Override
    public void setSeats(int seats) {
        this.manual.setSeats(seats);
    }

    @Override
    public void setEngine(String engine) {
        this.manual.setEngine(engine);
    }

    @Override
    public void setTripComputer(String tripComputer) {
        this.manual.setTripComputer(tripComputer);
    }

    @Override
    public void setGPS(String GPS) {
        this.manual.setGPS(GPS);
    }

    public Manual getProduct(){
        Manual result = this.manual;
        this.reset();
        return result;
    }
}
