package me.mbouzidi.designpatterns.creational.prototype.simple;

public class PineTree extends Tree{
    private Double mass;
    private Double height;
    private Double position;

    public PineTree() {
    }

    public PineTree(Double mass, Double height) {
        this.mass = mass;
        this.height = height;
    }

    @Override
    public Tree copy() {
        PineTree pineTreeClone = new PineTree(this.getMass(), this.getHeight());
        pineTreeClone.setPosition(this.getPosition());
        return pineTreeClone;
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
}
