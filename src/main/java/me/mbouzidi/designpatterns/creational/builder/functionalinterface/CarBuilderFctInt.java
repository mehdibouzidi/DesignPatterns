package me.mbouzidi.designpatterns.creational.builder.functionalinterface;


import java.util.function.Consumer;

/**
 * ssource: https://medium.com/beingprofessional/think-functional-advanced-builder-pattern-using-lambda-284714b85ed5
 *
 */
public class CarBuilderFctInt {
    public int seats;
    public String engine;
    public String tripComputer;
    public String GPS;

    public CarBuilderFctInt with(Consumer<CarBuilderFctInt> builderFonction){
        builderFonction.accept(this);
        return this;
    }

    public Car createCar(){
        return new Car(this);
    }

}
