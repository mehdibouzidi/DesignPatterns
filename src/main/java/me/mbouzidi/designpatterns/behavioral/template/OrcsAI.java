package me.mbouzidi.designpatterns.behavioral.template;

public class OrcsAI extends GameAI{
    @Override
    protected void buildsUnits() {
        System.out.println(this.getClass()+": Build Orcs Units ");
    }

    @Override
    protected void buildStructures() {
        System.out.println(this.getClass()+": Build Orcs Structures");
    }

    @Override
    void sendScouts(Integer position) {
        System.out.println(this.getClass()+": Sending Orcs Scouts to Position "+position);
    }

    @Override
    void sendWarriors(Integer position) {
        System.out.println(this.getClass()+": Sending Orcs Warriors to Position "+position);
    }
}
