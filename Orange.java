package lesson3new;

public class Orange extends Fruit{
    float weight = 1.5f;

    public float getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "Orange";
    }
}
