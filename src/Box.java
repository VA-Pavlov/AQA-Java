import java.util.ArrayList;

public class Box<T> {
    private ArrayList<T> box = new ArrayList<>();

    public void addFruit(T fruit) {
        box.add(fruit);
    }

    public float getWeight() {
        float waight = 0;
        for (T fruit : box) {
            waight += ((Fruit) fruit).getWaight();
        }
        return waight;
    }

    public boolean compare(Box box) {
        return box.getWeight() == this.getWeight();
    }

    public void sprinkle(Box<T> anotherBox) {
        for (T fruit : this.box) {
            anotherBox.addFruit(fruit);
        }
        box.clear();
    }

}
