package lesson6.treemap;

import java.util.Comparator;
import java.util.Map;
import java.util.NavigableSet;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapUtils{
    // associate specified value with specified key in a Tree Map
    public static void put(TreeMap<String, Integer> map, String key, Integer value) {
        map.put(key, value);
    }
    // copy a Tree Map content to another Tree Map
    public static void copy(TreeMap<String, Integer> map1, TreeMap<String, Integer> map2) {
        map2.putAll(map1);
    }
    // search for a specified key in a Tree Map
    public static boolean containsKey(TreeMap<String, Integer> map, String key) {
        return map.containsKey(key);
    }
    // search for a specified value in a Tree Map
    public static boolean containsValue(TreeMap<String, Integer> map, Integer value) {
        return map.containsValue(value);
    }
    // get all keys from the given Tree Map
    public static String[] getKeys(TreeMap<String, Integer> map) {
        return map.keySet().toArray(new String[0]);
    }
    // delete all elements from a given Tree Map
    public static void clear(TreeMap<String, Integer> map) {
        map.clear();
    }
    // sort keys in Tree Map by using comparator
    public static void sortByComparator(TreeMap<String, Integer> map) {
        TreeMap<String, Integer> sorted = new TreeMap<>(new ValueComparator(map));
        sorted.putAll(map);
        map.clear();
        map.putAll(sorted);
    }
    // get a key-value mapping associated with the greatest key and the least key in a map
    public static String getFirstKey(TreeMap<String, Integer> map) {
        return map.firstKey();
    }
    public static String getLastKey(TreeMap<String, Integer> map) {
        return map.lastKey();
    }
    // reverse order view of the keys contained in a map
    public static String[] descendingKeySet(TreeMap<String, Integer> map) {
        return map.descendingKeySet().toArray(new String[0]);
    }
    // get a key-value mapping associated with the greatest key less than or equal to the given key
    public static String getFloorKey(TreeMap<String, Integer> map, String key) {
        return map.floorKey(key);
    }
    // get a key-value mapping associated with the least key greater than or equal to the given key
    public static String getCeilingKey(TreeMap<String, Integer> map, String key) {
        return map.ceilingKey(key);
    }
    // portion of a map whose keys are strictly less than a given key
    public static String[] headMap(TreeMap<String, Integer> map, String toKey) {
        return map.headMap(toKey).keySet().toArray(new String[0]);
    }
    // portion of a map whose keys are less than or equal to a given key
    public static String[] headMapInclusive(TreeMap<String, Integer> map, String toKey) {
        return map.headMap(toKey, true).keySet().toArray(new String[0]);
    }
    // least key strictly greater than the given key
    public static String higherKey(TreeMap<String, Integer> map, String key) {
        return map.higherKey(key);
    }
    // key value mapping associated with the greatest key strictly less than the given key.
    public static String lowerKey(TreeMap<String, Integer> map, String key) {
        return map.lowerKey(key);
    }
    // greatest key strictly less than the given key
    public static String lowerEntry(TreeMap<String, Integer> map, String key) {
        return map.lowerEntry(key).getKey();
    }
    // NavigableSet view of keys contained in the map
    public static NavigableSet navigableKeySet(TreeMap<String, Integer> map) {
        return map.navigableKeySet();
    }
    // remove and get a key-value mapping associated with the least key in a map
    public static Map.Entry pollFirstEntry(TreeMap<String, Integer> map) {
        return map.pollFirstEntry();
    }
    // remove and get a key-value mapping associated with the greatest key in this map
    public static Map.Entry pollLastEntry(TreeMap<String, Integer> map) {
        return map.pollLastEntry();
    }
    // portion of a map whose keys range from a given key (inclusive) to another key (exclusive)
    public static SortedMap subMap(TreeMap<String, Integer> map, String fromKey, String toKey) {
        return map.subMap(fromKey, toKey);
    }
    // portion of a map whose keys are greater than or equal to a given key
    public static SortedMap tailMap(TreeMap<String, Integer> map, String fromKey) {
        return map.tailMap(fromKey);
    }
    // get a portion of a map whose keys are greater than to a given key
    public static SortedMap tailMapInclusive(TreeMap<String, Integer> map, String fromKey) {
        return map.tailMap(fromKey, true);
    }
    // get a key-value mapping associated with the least key greater than or equal to the given key. 
    // Return null if there is no such key
    public static Map.Entry ceilingEntry(TreeMap<String, Integer> map, String key) {
        return map.ceilingEntry(key);
    }
    // get the least key greater than or equal to the given key
    public static String ceilingKey(TreeMap<String, Integer> map, String key) {
        return map.ceilingKey(key);
    }
}

class ValueComparator implements Comparator<String> {
    Map<String, Integer> base;
    public ValueComparator(Map<String, Integer> base) {
        this.base = base;
    }
    // Note: this comparator imposes orderings that are inconsistent with equals.
    public int compare(String a, String b) {
        if (base.get(a) <= base.get(b)) {
            return -1;
        } else {
            return 1;
        } // returning 0 would merge keys
    }
}
