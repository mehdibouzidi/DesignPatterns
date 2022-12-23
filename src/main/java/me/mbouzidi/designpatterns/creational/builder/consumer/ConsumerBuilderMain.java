package me.mbouzidi.designpatterns.creational.builder.consumer;

public class ConsumerBuilderMain {
    public static void main(String[] args) {
        Car suv = new CarBuilderConsumer()
                .with(carBuilderConsumer -> {
                    carBuilderConsumer.seats =4;
                    carBuilderConsumer.engine = "4X4 Engine";
                })
                .createCar();
        System.out.println(suv);
    }
}
