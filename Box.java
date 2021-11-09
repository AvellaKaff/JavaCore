package lesson3new;

import java.util.ArrayList;

public class Box<Fruit> extends ArrayList {
    float boxW;
    ArrayList<Fruit> box;

    public Box() {
        box = new ArrayList<>();
    }



    public void addFruit(Apple apple) {
        box.add((Fruit) apple);
    }
    public void addFruit(Orange orange) {
        box.add((Fruit) orange);
    }

    public int sizeBox() {
        return box.size();
    }
    

    public float boxWeight(float weight, int size){
        boxW = weight * size;
        return boxW;
    }

    public boolean compare(Box o) {
        if (this.boxW == o.boxW) {
            return true;
        } return false;
    }

    public void addAllFruits(Box b) {
        box.addAll(b);
    }

    @Override
    public String toString() {
        return "Box" + box + ' ';
    }

}
