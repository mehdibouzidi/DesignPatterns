package me.mbouzidi.designpatterns.behavioral.template;

/**
 * Source: https://refactoring.guru/design-patterns/template-method
 * */
public abstract class GameAI {
    /**
     * Template Method
     * */
    protected void turn(){
        collectResources();
        buildStructures();
        buildsUnits();
        attack();
    }

    protected void attack() {
        System.out.println(this.getClass()+":Atack");
    }

    protected void buildsUnits() {
        System.out.println(this.getClass()+": Build Units");
    }

    protected void buildStructures() {
        System.out.println(this.getClass()+": Build Structures");
    }

    protected void collectResources() {
        System.out.println(this.getClass()+": Build Structures");
    }

    abstract void sendScouts(Integer position);
    abstract void sendWarriors(Integer position);
}
