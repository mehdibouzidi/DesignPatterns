package me.mbouzidi.designpatterns.creational.builder.director;

public interface IBuilder {
    void reset();
    void setSeats(int seats);
    void setEngine(String engine);
    void setTripComputer(String tripComputer);
    void setGPS(String GPS);
}
