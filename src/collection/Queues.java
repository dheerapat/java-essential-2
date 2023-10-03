package collection;

import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    public static void main(String[] args) {
        Queue fruits = new LinkedList();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");
        fruits.add("lemon");
        System.out.println(fruits);
        var removeFruit = fruits.remove();

        System.out.println(fruits);
        System.out.println(removeFruit);
        System.out.println(fruits.peek());
        System.out.println(fruits);
    }
}
