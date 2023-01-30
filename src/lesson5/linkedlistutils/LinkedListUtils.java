package lesson4.linkedlistutils;

import java.util.LinkedList;

public class LinkedListUtils {
    public static <T> void append(LinkedList<T> list, T value) {
        list.add(value);
    }
    public static <T> void print(LinkedList<T> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    public static <T> void printWithPosition(LinkedList<T> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(i + ": " + list.get(i));
        }
    }
    public static <T> void printFromPosition(LinkedList<T> list, int startIndex) {
        for (int i = startIndex; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
    public static <T> void printReverse(LinkedList<T> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }
    public static <T> void insertFirst(LinkedList<T> list, T value) {
        list.addFirst(value);
    }
    public static <T> void insertLast(LinkedList<T> list, T value) {
        list.addLast(value);
    }
    public static <T> void insertFirstAndLast(LinkedList<T> list, T value) {
        list.addFirst(value);
        list.addLast(value);
    }
    public static <T> void insertAt(LinkedList<T> list, T value, int index) {
        list.add(index, value);
    }

    public static <T> int getFirstOccurrence(LinkedList<T> list, T value) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(value)) {
                return i;
            }
        }
        return -1;
    }
    public static <T> int getLastOccurrence(LinkedList<T> list, T value) {
        for (int i = list.size() - 1; i >= 0; i--) {
            if (list.get(i).equals(value)) {
                return i;
            }
        }
        return -1;
    }

    public static <T> void remove(LinkedList<T> list, T value) {
        list.remove(value);
    }

    public static <T> void removeFirst(LinkedList<T> list) {
        list.removeFirst();
    }
    public static <T> void removeLast(LinkedList<T> list) {
        list.removeLast();
    }
    public static <T> void removeFirstAndLast(LinkedList<T> list) {
        if(list.size() < 2) {
            throw new IndexOutOfBoundsException();
        }
        list.removeFirst();
        list.removeLast();
    }
    public static <T> void removeAt(LinkedList<T> list, int index) {
        list.remove(index);
    }
    public static <T> void clear(LinkedList<T> list) {
        list.clear();
    }

    public static <T> void swap(LinkedList<T> list, int index1, int index2) {
        T temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }
    public static <T> void shuffle(LinkedList<T> list) {
        for (int i = 0; i < list.size(); i++) {
            int randomIndex = (int) (Math.random() * list.size());
            swap(list, i, randomIndex);
        }
    }

    public static <T> void join(LinkedList<T> list1, LinkedList<T> list2) {
        list1.addAll(list2);
    }
    public static <T> T getFirst(LinkedList<T> list) {
        return list.getFirst();
    }
    public static <T> T getLast(LinkedList<T> list) {
        return list.getLast();
    }
    public static <T> boolean contains(LinkedList<T> list, T value) {
        return list.contains(value);
    }
    public static <T> java.util.ArrayList<T> toArrayList(LinkedList<T> list) {
        return new java.util.ArrayList<>(list);
    }
    public static <T> boolean equals(LinkedList<T> list1, LinkedList<T> list2) {
        if (list1.size() != list2.size()) {
            return false;
        }
        for (int i = 0; i < list1.size(); i++) {
            if (!list1.get(i).equals(list2.get(i))) {
                return false;
            }
        }
        return true;
    }
    public static <T> boolean isEmpty(LinkedList<T> list) {
        return list.isEmpty();
    }
    public static <T> void replace(LinkedList<T> list, T oldValue, T newValue) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(oldValue)) {
                list.set(i, newValue);
            }
        }
    }
}
