package me.mbouzidi.designpatterns.creational.builder.consumer;


import java.util.function.Consumer;

/**
 * ssource: https://medium.com/beingprofessional/think-functional-advanced-builder-pattern-using-lambda-284714b85ed5
 *
 */
public class CarBuilderConsumer {
    public int seats;
    public String engine;
    public String tripComputer;
    public String GPS;

    public CarBuilderConsumer with(Consumer<CarBuilderConsumer> builderFonction){
        builderFonction.accept(this);
        return this;
    }

    public Car createCar(){
        return new Car(this);
    }

}
