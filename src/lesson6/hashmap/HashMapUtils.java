package lesson6.hashmap;

import java.util.HashMap;

public class HashMapUtils<T> {
    // associate the specified value with the specified key
    public void addElementToKey(HashMap<T, T> hashMap, T key, T value) {
        hashMap.put(key, value);
    }
    // get the size of the HashMap
    public int getSize(HashMap<T, T> hashMap) {
        return hashMap.size();
    }
    // copy all of the mappings from the specified map to this map
    public void copyAll(HashMap<T, T> hashMap, HashMap<T, T> hashMap2) {
        hashMap.putAll(hashMap2);
    }
    // remove all of the mappings from this map
    public void clear(HashMap<T, T> hashMap) {
        hashMap.clear();
    }
    // check if the map contains key-value mappings or not
    public boolean isEmpty(HashMap<T, T> hashMap) {
        return hashMap.isEmpty();
    }
    // get a shallow copy of this HashMap instance
    public HashMap<T, T> clone(HashMap<T, T> hashMap) {
        return (HashMap<T, T>) hashMap.clone();
    }
    // check if the map contains the specified key
    public boolean containsKey(HashMap<T, T> hashMap, T key) {
        return hashMap.containsKey(key);
    }
    // check if the map contains the specified value
    public boolean containsValue(HashMap<T, T> hashMap, T value) {
        return hashMap.containsValue(value);
    }
    // create a set view of the mappings contained in this map
    public void entrySet(HashMap<T, T> hashMap) {
        hashMap.entrySet();
    }
    // get the value to which the specified key is mapped
    public T getValueOfKey(HashMap<T, T> hashMap, T key) {
        return hashMap.get(key);
    }
    // get a set view of the keys contained in this map
    public void keySet(HashMap<T, T> hashMap) {
        hashMap.keySet();
    }
    // get a collection view of the values contained in this map
    public void values(HashMap<T, T> hashMap) {
        hashMap.values();
    }
}
