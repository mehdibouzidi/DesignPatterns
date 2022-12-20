package me.mbouzidi.designpatterns.creational.builder.director;

import me.mbouzidi.designpatterns.creational.builder.Car;

// The director is only responsible for executing the building
// steps in a particular sequence. It's helpful when producing
// products according to a specific order or configuration.
// Strictly speaking, the director class is optional, since the
// client can control builders directly.
public class Director {

    public IBuilder constructSportCar(IBuilder builder){
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("SPORT Engine");
        builder.setTripComputer("Electronic");
        builder.setGPS("GARMIN GPS");
        return builder;
    }

    public IBuilder constructSportCarManual(IBuilder builder){
        builder.reset();
        builder.setSeats(2);
        builder.setEngine("SPORT Engine Manual");
        builder.setTripComputer("Electronic Manual");
        builder.setGPS("GARMIN GPS Manual");
        return builder;
    }


    public IBuilder constructSUV(IBuilder builder){
        builder.reset();
        builder.setSeats(4);
        builder.setEngine("4X4 Engine");
        builder.setTripComputer("Electronic");
        builder.setGPS("GARMIN GPS");
        return builder;
    }
}
