package me.mbouzidi.designpatterns.creational.builder.functionalinterface;

/**
 * This builder obliges you to construct the object in a specific order
 * Source: https://benjiweber.co.uk/blog/2014/11/02/builder-pattern-with-java-8-lambdas/
 * */
public class Car {
    private int seats;
    private String engine; //might be an object of type "Engine"
    private String tripComputer; //might be an object of type "TripComputer"
    private String GPS; //might be an object of type "GPS"

    public Car() {
    }

    public Car(int seats, String engine, String tripComputer, String GPS) {
        this.seats = seats;
        this.engine = engine;
        this.tripComputer = tripComputer;
        this.GPS = GPS;
    }


    public static Seats buildCar() {
        return seats -> engine -> tripComputer -> gps -> new Car(seats, engine, tripComputer,gps);
    }
    @FunctionalInterface
    public interface Seats{
        Engine seats(int seats);
    }

    @FunctionalInterface
    public interface Engine{
        TripComputer engine(String engine);
        default TripComputer defaultEngine() {
            return engine("NORMAL ENGINE");
        }
    }

    @FunctionalInterface
    public interface TripComputer{
        GPS tripComputer(String tripComputer);
    }

    @FunctionalInterface
    public interface GPS{
        Car gps(String GPS);
    }

    public static void main(String[] args) {
        Car sportCar = Car.buildCar()
                .seats(3)
                .engine("Sport Engine")
                .tripComputer("ULTRA Computer")
                .gps("NEW GARMIN GPS");
        System.out.println(sportCar);
        Car normaleCar = Car.buildCar()
                .seats(3)
                .defaultEngine()
                .tripComputer("ULTRA Computer")
                .gps("NEW GARMIN GPS");
        System.out.println(normaleCar);
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
