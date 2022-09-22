package Lesson_1;


import java.util.ArrayList;
import java.util.Arrays;



public class Box<T extends Fruit> {
    private ArrayList<T> items;

    public Box(T... items) {
        this.items = new ArrayList<T>(Arrays.asList(items));
    }

    public void add(T... items) {
        this.items.addAll(Arrays.asList(items));
    }

    public boolean compare(Box box) {
        return this.getWeight() == box.getWeight();
    }

    public int getSize(){
        return items.size();
    }

    public int getWeight() {
        if (items.size() == 0) {
            return 0;
        }
        int weight = 0;
        for (T item : items) {
            weight += item.getWeight();
        }
        return weight;
    }

    public void shiftFruits(Box<T> box){
//      box.items.addAll(this.items);
        for (T b:items) {
            box.add(b);
        }
      items.clear();
    }

}

