package me.mbouzidi.designpatterns.creational.builder.functionalinterface;

public class FctIntMain {
    public static void main(String[] args) {
        Car suv = new CarBuilderFctInt()
                .with(carBuilderFctInt -> {
                    carBuilderFctInt.seats =4;
                    carBuilderFctInt.engine = "4X4 Engine";
                })
                .createCar();
        System.out.println(suv);
    }
}
