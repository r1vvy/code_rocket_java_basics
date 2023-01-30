package lesson5.treeset;

import java.util.TreeSet;

public class TreeSetUtils<T>{
    
    // print the elements of a tree set
    public  void printTreeSet(TreeSet<T> treeSet) {
        for (T s : treeSet) {
            System.out.println(s);
        }
    }
    // add elements to a tree set
    public  void addElementsToTreeSet(TreeSet<T> treeSet, TreeSet<T> elements) {
        treeSet.addAll(elements);
    }
    // create a reverse order view of the elements contained in a given tree set
    public  TreeSet<T> createReverseOrderViewOfTreeSet(TreeSet<T> treeSet) {
        return (TreeSet<T>) treeSet.descendingSet();
    }
    // get the first and last elements in a tree set
    public  T getFirstElementInTreeSet(TreeSet<T> treeSet) {
        return treeSet.first();
    }
    public  T getLastElementInTreeSet(TreeSet<T> treeSet) {
        return treeSet.last();
    }
    // clone a tree set to another tree set
    public  TreeSet<T> cloneTreeSet(TreeSet<T> treeSet) {
        TreeSet<T> clone = new TreeSet<T>();
        clone.addAll(treeSet);
        return clone;
    }
    // get the number of elements in a tree set
    public  int getTreeSetSize(TreeSet<T> treeSet) {
        return treeSet.size();
    }
    // compare two tree sets
    public  boolean compareTwoTreeSet(TreeSet<T> treeSet1, TreeSet<T> treeSet2) {
        return treeSet1.equals(treeSet2);
    }
    // find the numbers less than 7 in a tree set
    public TreeSet<Integer> findNumbersLessThan7InTreeSet(TreeSet<Integer> treeSet) {
        return (TreeSet<Integer>) treeSet.headSet(7);
    }
    // find the element which is greater than or equal to the given element
    public T findElementGreaterThanOrEqualTo(TreeSet<T> treeSet, T element) {
        return treeSet.ceiling(element);
    }
    // less than or equal to the given element
    public T findElementLessThanOrEqualTo(TreeSet<T> treeSet, T element) {
        return treeSet.floor(element);
    }
    // strictly greater than or equal to the given element
    public  T findElementStrictlyGreaterThanOrEqualTo(TreeSet<T> treeSet, T element) {
        return treeSet.higher(element);
    }
    // strictly less than or equal to the given element
    public  T findElementStrictlyLessThanOrEqualTo(TreeSet<T> treeSet, T element) {
        return treeSet.lower(element);
    }
    // retrieve and remove the first element of a tree set
    public  T retrieveAndRemoveFirstElementOfTreeSet(TreeSet<T> treeSet) {
        return treeSet.pollFirst();
    }
    // retrieve and remove the last element of a tree set
    public  T retrieveAndRemoveLastElementOfTreeSet(TreeSet<T> treeSet) {
        return treeSet.pollLast();
    }
    // remove a given element from a tree set
    public void removeElementFromTreeSet(TreeSet<T> treeSet, T element) {
        treeSet.remove(element);
    }
    
}
