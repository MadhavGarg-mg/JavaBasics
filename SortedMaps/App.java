package SortedMaps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class App {
    public static void main(String[] args) {

        HashMap<Integer, String> hashMap = new HashMap<Integer, String>(); // Random order
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>(); // Saves the keys in the same order.
        TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>(); // Puts all keys in order -> 0,1,2, ....

        testMap(hashMap);
        System.out.println();
        testMap(linkedHashMap);
        System.out.println();
        testMap(treeMap);
    }

    public static void testMap(Map<Integer, String> map) {
        map.put(1, "fox");
        map.put(5, "cow");
        map.put(3, "cat");
        map.put(0, "dog");
        map.put(8, "camel");
        map.put(7, "elephant");

        for(Integer key: map.keySet()){
            String value = map.get(key);

            System.out.println(key + ": " + value);
        }

    }

}