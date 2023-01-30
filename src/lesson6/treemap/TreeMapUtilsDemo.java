package lesson5.treemap;

import java.util.Arrays;
import java.util.TreeMap;

public class TreeMapUtilsDemo {
    // utils test
    public static void main(String[] args) {
        TreeMap<String, Integer> map = new TreeMap<>();
        TreeMapUtils.put(map, "a", 1);
        TreeMapUtils.put(map, "b", 2);
        TreeMapUtils.put(map, "c", 3);
        TreeMapUtils.put(map, "d", 4);
        TreeMapUtils.put(map, "e", 5);
        TreeMapUtils.put(map, "f", 6);
        TreeMapUtils.put(map, "g", 7);
        TreeMapUtils.put(map, "h", 8);
        TreeMapUtils.put(map, "i", 9);
        TreeMapUtils.put(map, "j", 10);
        TreeMapUtils.put(map, "k", 11);
        TreeMapUtils.put(map, "l", 12);
        TreeMapUtils.put(map, "m", 13);
        TreeMapUtils.put(map, "n", 14);
        TreeMapUtils.put(map, "o", 15);
        TreeMapUtils.put(map, "p", 16);
        TreeMapUtils.put(map, "q", 17);
        TreeMapUtils.put(map, "r", 18);
        TreeMapUtils.put(map, "s", 19);
        TreeMapUtils.put(map, "t", 20);
        TreeMapUtils.put(map, "u", 21);
        TreeMapUtils.put(map, "v", 22);
        TreeMapUtils.put(map, "w", 23);
        TreeMapUtils.put(map, "x", 24);
        TreeMapUtils.put(map, "y", 25);
        TreeMapUtils.put(map, "z", 26);
        System.out.println("map: " + map);
        System.out.println("containsKey(map, \"a\"): " + TreeMapUtils.containsKey(map, "a"));
        System.out.println("containsKey(map, \"z\"): " + TreeMapUtils.containsKey(map, "z"));
        System.out.println("containsValue(map, 1): " + TreeMapUtils.containsValue(map, 1));
        System.out.println("containsValue(map, 26): " + TreeMapUtils.containsValue(map, 26));
        System.out.println("getKeys(map): " + Arrays.toString(TreeMapUtils.getKeys(map)));
        TreeMap<String, Integer> map2 = new TreeMap<>();
        TreeMapUtils.copy(map, map2);
        System.out.println("map2: " + map2);
        TreeMapUtils.clear(map);
    }
}
