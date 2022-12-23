package me.mbouzidi.designpatterns.creational.builder.consumer;

public class Car {
    private int seats;
    private String engine; //might be an object of type "Engine"
    private String tripComputer; //might be an object of type "TripComputer"
    private String GPS; //might be an object of type "GPS"

    public Car() {
    }

    public Car(CarBuilderConsumer builder) {
        this.seats = builder.seats;
        this.engine = builder.engine;
        this.tripComputer = builder.tripComputer;
        this.GPS = builder.GPS;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    public String getTripComputer() {
        return tripComputer;
    }

    public void setTripComputer(String tripComputer) {
        this.tripComputer = tripComputer;
    }

    public String getGPS() {
        return GPS;
    }

    public void setGPS(String GPS) {
        this.GPS = GPS;
    }

    @Override
    public String toString() {
        return "Car{" +
                "seats=" + seats +
                ", engine='" + engine + '\'' +
                ", tripComputer='" + tripComputer + '\'' +
                ", GPS='" + GPS + '\'' +
                '}';
    }
}
