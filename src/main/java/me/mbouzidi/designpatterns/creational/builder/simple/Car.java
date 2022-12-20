package me.mbouzidi.designpatterns.creational.builder.simple;

public class Car {
    private int seats;
    private String engine; //might be an object of type "Engine"
    private String tripComputer; //might be an object of type "TripComputer"
    private String GPS; //might be an object of type "GPS"

    public Car() {
    }

    public Car(CarBuilder carBuilder) {
        this.seats = carBuilder.seats;
        this.engine = carBuilder.engine;
        this.tripComputer = carBuilder.tripComputer;
        this.GPS = carBuilder.GPS;
    }
    public int getSeats() {
        return seats;
    }

    public String getEngine() {
        return engine;
    }

    public String getTripComputer() {
        return tripComputer;
    }

    public String getGPS() {
        return GPS;
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

    public static class CarBuilder {
        private int seats;
        private String engine;
        private String tripComputer;
        private String GPS;

        public CarBuilder seats(int seats){
            this.seats = seats;
            return this;
        }
        public CarBuilder engine(String engine){
            this.engine = engine;
            return this;
        }
        public CarBuilder tripComputer(String seats){
            this.tripComputer = tripComputer;
            return this;
        }
        public CarBuilder GPS(String GPS){
            this.GPS = GPS;
            return this;
        }

        public Car build(){
            return new Car(this);
        }
    }
}
