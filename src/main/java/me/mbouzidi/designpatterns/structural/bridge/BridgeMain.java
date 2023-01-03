package me.mbouzidi.designpatterns.structural.bridge;

/**
 * Applicability:
 * - Use the Bridge pattern when you want to divide and organize a monolithic class that has several variants of some functionality (for example, if the class can work with various database servers).
 * - Use the pattern when you need to extend a class in several orthogonal (independent) dimensions.
 * -  Use the Bridge if you need to be able to switch implementations at runtime.
 *
 * Source 1: https://refactoring.guru/design-patterns/bridge
 * Source 2: https://refactoring.guru/design-patterns/bridge/java/example
 * */
public class BridgeMain {
    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
