package lesson3new;

public class Apple extends Fruit{
    float weight = 1.0f;

    public float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Apple";
    }
}
