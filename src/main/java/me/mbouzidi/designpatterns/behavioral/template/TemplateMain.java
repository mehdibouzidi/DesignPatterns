package me.mbouzidi.designpatterns.behavioral.template;

public class TemplateMain {
    public static void main(String[] args) {
        OrcsAI orcsAI = new OrcsAI();
        orcsAI.turn();
        MonstersAI monstersAI = new MonstersAI();
        monstersAI.turn();
    }
}
