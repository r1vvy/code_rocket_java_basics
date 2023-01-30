package lesson5.hashset;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.TreeSet;

public class HashSetUtils {
    // print the elements of a HashSet
    public static void printHashSet(HashSet<String> set) {
        for (String s : set) {
            System.out.println(s);
        }
    }
    public static int getHashSetSize(HashSet<String> set) {
        return set.size();
    }
    // empty hash set
    public static void emptyHashSet(HashSet<String> set) {
        set.clear();
    }
    // check if a hash set is empty
    public static boolean isHashSetEmpty(HashSet<String> set) {
        return set.isEmpty();
    }
    // clone a hash set to another hash set
    public static HashSet<String> cloneHashSet(HashSet<String> set) {
        HashSet<String> clone = new HashSet<String>();
        clone.addAll(set);
        return clone;
    }
    // convert a hash set to an array
    public static String[] convertHashSetToArray(HashSet<String> set) {
        String[] array = new String[set.size()];
        set.toArray(array);
        return array;
    }
    // convert a hash set to a tree set
    public static TreeSet<String> convertHashSetToTreeSet(HashSet<String> set) {
        TreeSet<String> treeSet = new TreeSet<String>();
        treeSet.addAll(set);
        return treeSet;
    }
    // convert a hash set to a List/ArrayList
    public static List<String> convertHashSetToList(HashSet<String> set) {
        List<String> list = new ArrayList<String>(set);
        return list;
    }
    // compare two hash sets
    public static boolean compareTwoHashSet(HashSet<String> set1, HashSet<String> set2) {
        return set1.equals(set2);
    }
    // compare two sets and retain elements which are same on both sets
    public static HashSet<String> compareTwoHashSetAndRetainElements(HashSet<String> set1, HashSet<String> set2) {
        set1.retainAll(set2);
        return set1;
    }
    // remove all elements from a hash set
    public static void removeAllElementsFromHashSet(HashSet<String> set) {
        set.removeAll(set);
    }
}
