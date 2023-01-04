package me.mbouzidi.designpatterns.creational.factorymethod;
/**
 * Applicability:
 * - Use the Factory Method when you don’t know beforehand the exact types and dependencies of the objects your code should work with.
 * - Use the Factory Method when you want to provide users of your library or framework with a way to extend its internal components.
 * - Use the Factory Method when you want to save system resources by reusing existing objects instead of rebuilding them each time.
 *
 * Source 1: https://refactoring.guru/design-patterns/factory-method
 * Source 2: https://refactoring.guru/design-patterns/factory-method/java/example
 * */
public class FactoryMethodMain {
    private static Dialog dialog;

    public static void main(String[] args) {
        configure();
        runBusinessLogic();
    }

    /**
     * The concrete factory is usually chosen depending on configuration or
     * environment options.
     */
    static void configure() {
        if (System.getProperty("os.name").equals("Windows 10")) {
            dialog = new WindowsDialog();
        } else {
            dialog = new HtmlDialog();
        }
    }

    /**
     * All of the client code should work with factories and products through
     * abstract interfaces. This way it does not care which factory it works
     * with and what kind of product it returns.
     */
    static void runBusinessLogic() {
        dialog.renderWindow();
    }
}
