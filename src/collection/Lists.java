package collection;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List fruits = new ArrayList();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");
        fruits.set(2, "grape");
        fruits.add("lemon");
        fruits.remove(4);

        System.out.println(fruits);
        System.out.println(fruits.get(2));
        System.out.println(fruits.indexOf("lemon"));
        System.out.println(fruits.lastIndexOf("lemon"));

        // this is immutable similar to set
        List moreFruits = List.of("cherry", "rambutan");
        System.out.println(moreFruits);
    }
}
