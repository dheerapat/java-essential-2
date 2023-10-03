package collection;

import java.util.HashMap;
import java.util.Map;

public class Maps {
    public static void main(String[] args) {
        Map fruitCalories = new HashMap();
        fruitCalories.put("apple", 95);
        fruitCalories.put("lemon", 20);
        fruitCalories.put("banana", 100);
        fruitCalories.put("orange", 40);
        //fruitCalories.put("lemon", 15); // override lemon
        fruitCalories.putIfAbsent("lemon", 17);

        System.out.println(fruitCalories);
        System.out.println(fruitCalories.get("banana"));
    }
}
