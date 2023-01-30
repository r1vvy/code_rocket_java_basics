package lesson5.linkedlistutils;

import java.util.LinkedList;

public class LinkedListUtilsDemo {
    public static void main(String[] args) {
        // test utils
        LinkedListUtils utils = new LinkedListUtils();
        LinkedList<String> list = new LinkedList<>();
        list.add("Hello");
        list.add("World");
        list.add("!");
        utils.print(list);
        utils.append(list, "World");
        utils.print(list);
        utils.printWithPosition(list);
        utils.printFromPosition(list, 1);
        utils.printReverse(list);
        utils.insertFirst(list, "Hello");
        utils.print(list);
        utils.insertLast(list, "!");
        utils.print(list);
        utils.insertFirstAndLast(list, "Hello");
        utils.print(list);
        utils.insertAt(list, "World", 1);
        utils.print(list);
        System.out.println(utils.getFirstOccurrence(list, "World"));
        System.out.println(utils.getLastOccurrence(list, "World"));
        utils.remove(list, "World");
        utils.print(list);
    }
}
