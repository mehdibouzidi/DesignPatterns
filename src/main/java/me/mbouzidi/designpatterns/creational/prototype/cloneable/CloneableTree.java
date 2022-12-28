package me.mbouzidi.designpatterns.creational.prototype.cloneable;

/**
 * Cloneable interface don't have a 'clone()' method, and don't provide 'default' implementation of this method
 * The clone() method is in Object: Object.clone()
 * We use this interface just to say it's a cloneable object we're having here
 *
 * */
public class CloneableTree implements Cloneable{
    private Double mass;
    private Double height;
    private Double position;

    public CloneableTree() {
    }

    public CloneableTree(Double mass, Double height, Double position) {
        this.mass = mass;
        this.height = height;
        this.position = position;
    }

    public Double getMass() {
        return mass;
    }

    public void setMass(Double mass) {
        this.mass = mass;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getPosition() {
        return position;
    }

    public void setPosition(Double position) {
        this.position = position;
    }

    @Override
    public CloneableTree clone() {
        CloneableTree cloneableTree = new CloneableTree(this.getMass(), this.getHeight(),this.getPosition());
        return cloneableTree;
    }
}
