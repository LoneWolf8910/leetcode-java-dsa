
import java.util.*;

public class hashmap_hashset {

    public static void main(String[] args) {

        // =====================================
        // HASHSET
        // =====================================

        System.out.println("========== HASHSET ==========");

        // 1. Declaration
        HashSet<Integer> set = new HashSet<>();

        // 2. Adding elements
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(20); // Duplicate - ignored

        // 3. Printing HashSet
        System.out.println("HashSet: " + set);

        // 4. Checking whether an element exists
        System.out.println("Contains 20: " + set.contains(20));

        // 5. Removing an element
        set.remove(30);
        System.out.println("After removing 30: " + set);

        // 6. Getting the size
        System.out.println("Size: " + set.size());

        // 7. Traversing using for-each
        System.out.println("Traversing HashSet:");

        for (int num : set) {
            System.out.println(num);
        }

        // 8. Checking whether HashSet is empty
        System.out.println("Is empty: " + set.isEmpty());

        // 9. Clearing HashSet
        set.clear();
        System.out.println("After clear: " + set);

        // =====================================
        // HASHMAP
        // =====================================

        System.out.println("\n========== HASHMAP ==========");

        // 1. Declaration
        HashMap<String, Integer> map = new HashMap<>();

        // 2. Adding key-value pairs
        map.put("Saurav", 90);
        map.put("Rahul", 85);
        map.put("Aman", 95);
        map.put("Bishal", 80);

        // 3. Printing HashMap
        System.out.println("HashMap: " + map);

        // 4. Accessing a value using its key
        System.out.println("Saurav's Marks: " + map.get("Saurav"));

        // 5. Getting a value safely
        System.out.println("Marks: " + map.getOrDefault("Rohit", 0));

        // 6. Checking whether a key exists
        System.out.println("Contains Saurav: " + map.containsKey("Saurav"));

        // 7. Checking whether a value exists
        System.out.println("Contains marks 95: " + map.containsValue(95));

        // 8. Updating a value
        map.put("Saurav", 98);
        System.out.println("After updating: " + map);

        // 9. Removing a key-value pair
        map.remove("Rahul");
        System.out.println("After removing Rahul: " + map);

        // 10. Getting the size
        System.out.println("Map size: " + map.size());

        // 11. Traversing using entrySet()
        System.out.println("Traversing HashMap:");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(
                    "Key: " + entry.getKey() +
                            " | Value: " + entry.getValue());
        }

        // 12. Traversing only keys
        System.out.println("Keys:");

        for (String key : map.keySet()) {
            System.out.println(key);
        }

        // 13. Traversing only values
        System.out.println("Values:");

        for (int value : map.values()) {
            System.out.println(value);
        }

        // 14. Clearing HashMap
        map.clear();
        System.out.println("After clear: " + map);
    }
}


