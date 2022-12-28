package me.mbouzidi.designpatterns.creational.prototype;

import me.mbouzidi.designpatterns.creational.prototype.cloneable.CloneableTree;

public class MainPrototype {
    public static void main(String[] args) {
        CloneableTree tree = new CloneableTree(5.0,2.5, 2.6);
        System.out.println(tree);
        CloneableTree treeClone = tree.clone();
        System.out.println(treeClone);
        System.out.println("Should return 'False': "+ (tree==treeClone));
    }
}
