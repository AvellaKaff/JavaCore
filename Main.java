package lesson3new;

public class Main {
    public static void main(String args[]) {
    Apple apple = new Apple();
    Orange orange = new Orange();

        Box<Apple> appleBox = new Box<Apple>();
        appleBox.addFruit(apple);
        appleBox.addFruit(apple);
        appleBox.addFruit(apple);

        Box<Orange> orangeBox = new Box<>();
        orangeBox.addFruit(orange);
        orangeBox.addFruit(orange);



        Box<Orange> newBox = new Box<Orange>();
        newBox.addFruit(orange);
        newBox.addFruit(orange);
        newBox.addFruit(orange);


        System.out.println(appleBox.boxWeight(apple.weight, appleBox.sizeBox()));
        System.out.println(orangeBox.boxWeight(orange.weight, orangeBox.sizeBox()));
        System.out.println(orangeBox.compare(appleBox));
        System.out.println(orangeBox.compare(newBox));
        System.out.println(newBox.toString());
        System.out.println(newBox.boxWeight(orange.weight, newBox.sizeBox()));
    }
}
