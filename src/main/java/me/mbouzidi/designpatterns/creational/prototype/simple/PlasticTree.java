package me.mbouzidi.designpatterns.creational.prototype.simple;

public class PlasticTree extends Tree{
    private Double mass;
    private Double height;
    private Double position;

    public PlasticTree() {
    }

    public PlasticTree(Double mass, Double height) {
        this.mass = mass;
        this.height = height;
    }

    @Override
    public Tree copy() {
        PlasticTree plasticTreeClone = new PlasticTree(this.getMass(), this.getHeight());
            plasticTreeClone.setPosition(this.getPosition());
        return plasticTreeClone;
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
