package Lesson_1;


import java.util.ArrayList;
import java.util.Arrays;


public class Main<T> {

    public static void main(String[] args) {
        Integer[] arr = new Integer[5];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
        }
        changeArr(arr, 0, 4);
        System.out.println(Arrays.toString(arr));

        Apple apple1 = new Apple();
        Apple apple2 = new Apple();
        Apple apple3 = new Apple();
        Apple apple4 = new Apple();
        Orange orange1 = new Orange();
        Orange orange2 = new Orange();

        Box<Apple> box = new Box<>(apple1, apple2);
        Box<Apple> box2 = new Box<>();
        Box<Orange> box1 = new Box<>(orange1, orange2);
        box.add(apple3, apple4);

        System.out.println(box.compare(box1));
        box.shiftFruits(box2);

        System.out.println(box2.getSize());


    }


    public static void changeArr(Object[] arr, int a, int b) {
        Object tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;

    }

    public static <T> ArrayList<T> toArrayList(T[] arr) {
        return new ArrayList<T>(Arrays.asList(arr));
    }


}





