package me.mbouzidi.designpatterns.creational.builder;

//Car Guide Book
//Have same attributes of a Car, cause for every model of Car you have a different Manual
public class Manual {
    private int seats;
    private String engine; //might be an object of type "Engine"
    private String tripComputer; //might be an object of type "TripComputer"
    private String GPS; //might be an object of type "GPS"

    public Manual() {
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
        return "Manual{" +
                "seats=" + seats +
                ", engine='" + engine + '\'' +
                ", tripComputer='" + tripComputer + '\'' +
                ", GPS='" + GPS + '\'' +
                '}';
    }
}
