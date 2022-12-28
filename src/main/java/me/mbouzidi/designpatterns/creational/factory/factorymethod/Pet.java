package me.mbouzidi.designpatterns.creational.factory.factorymethod;

public interface Pet {
    void setName(String name);
    String getName();
    String getType();
    boolean isHungry();
    void feed();
}
