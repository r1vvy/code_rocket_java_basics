package lesson6.treeset;

import java.util.TreeSet;

public class TreeSetUtilsDemo {
    public static void main(String[] args) {
        // utils test
        TreeSetUtils utils = new TreeSetUtils();
        // add elements to a tree set
        TreeSet<String> elements = new TreeSet<>();
        elements.add("Red");
        elements.add("Green");
        elements.add("Orange");
        elements.add("White");
        elements.add("Black");
        TreeSet<String> treeSet = new TreeSet<>();
        utils.addElementsToTreeSet(treeSet, elements);
        System.out.println("TreeSet: " + treeSet);
        // create a reverse order view of the elements contained in a given tree set
        TreeSet<String> reverseOrderView = utils.createReverseOrderViewOfTreeSet(treeSet);
        System.out.println("Reverse order view of the elements: " + reverseOrderView);
    }
}
