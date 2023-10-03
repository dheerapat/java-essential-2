package collection;

import java.util.HashSet;
import java.util.Set;

public class Sets {
    public static void main(String[] args) {
        Set fruits = new HashSet();
        fruits.add("apple");
        fruits.add("banana");
        fruits.add("lemon");
        fruits.add("apple");

        System.out.println(fruits);
        System.out.println("have lemon? " + fruits.contains("lemon"));

        fruits.remove("lemon");
        System.out.println("number of element: " + fruits.size());

        Set moreFruit = Set.of("pear", "raisin", "cherry");
        // below is error because set is immutable
        // moreFruit.add("cranberry");
        System.out.println(moreFruit);
    }
}
