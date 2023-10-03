package collection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ForEach {
    public static void main(String[] args) {
        List<String> fruits = new ArrayList<>();
        fruits.add("apple");
        fruits.add("lemon");
        fruits.add("banana");
        fruits.add("orange");

        fruits.forEach(f -> System.out.println(f));
        fruits.forEach(System.out::println);
        fruits.forEach(f -> {
            f = "fruit: " + f;
            System.out.println(f);
        });

        Map<String, Integer> fruitCalories = new HashMap<>();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 100);
        fruitCalories.put("orange", 40);

        fruitCalories.forEach((k, v) -> System.out.println(k + ":" + v));
    }
}
