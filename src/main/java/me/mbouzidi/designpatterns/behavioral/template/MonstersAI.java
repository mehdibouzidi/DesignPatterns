package me.mbouzidi.designpatterns.behavioral.template;

public class MonstersAI extends GameAI{
    @Override
    protected void buildsUnits() {
        System.out.println(this.getClass()+": Build Monsters Units ");
    }

    @Override
    protected void buildStructures() {
        System.out.println(this.getClass()+": Build Monsters Structures");
    }

    @Override
    protected void collectResources() {
        System.out.println(this.getClass()+": Build Monsters Structures");
    }

    @Override
    void sendScouts(Integer position) {
        System.out.println(this.getClass()+": Sending Monsters Scouts to Position "+position);
    }

    @Override
    void sendWarriors(Integer position) {
        System.out.println(this.getClass()+": Sending Monsters Warriors to Position "+position);
    }

}
