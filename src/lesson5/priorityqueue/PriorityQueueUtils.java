package lesson5.priorityqueue;

import java.util.Collections;
import java.util.PriorityQueue;

public class PriorityQueueUtils {
    // create a priority queue
    public static PriorityQueue<Object> createPriorityQueue() {
       return new PriorityQueue<Object>();
    }
    // print the elements of a priority queue
    public static void printPriorityQueue(PriorityQueue<Object> priorityQueue) {
        for (Object s : priorityQueue) {
            System.out.println(s);
        }
    }
    // add elements to a priority queue
    public static void addElements(PriorityQueue<Object> priorityQueue, PriorityQueue<Object> elements) {
        priorityQueue.addAll(elements);
    }
    // insert a specified element into a priority queue
    public static void insertElement(PriorityQueue<Object> priorityQueue, Object element) {
        priorityQueue.add(element);
    }
    // remove all elements
    public static void removeAllElements(PriorityQueue<Object> priorityQueue) {
        priorityQueue.clear();
    }
    // count elements
    public static int countElements(PriorityQueue<Object> priorityQueue) {
        return priorityQueue.size();
    }
    // compare two queues
    public static boolean compare(PriorityQueue<Object> priorityQueue1, PriorityQueue<Object> priorityQueue2) {
        return priorityQueue1.equals(priorityQueue2);
    }
    // retrieve the first element
    public static Object retrieveFirstElement(PriorityQueue<Object> priorityQueue) {
        return priorityQueue.peek();
    }
    // retrieve and remove the first element
    public static Object retrieveAndRemoveFirstElement(PriorityQueue<Object> priorityQueue) {
        return priorityQueue.poll();
    }
    // convert to an array
    public static Object[] convertToArray(PriorityQueue<Object> priorityQueue) {
        return priorityQueue.toArray();
    }
    // convert to a string
    public static String convertToString(PriorityQueue<Object> priorityQueue) {
        return priorityQueue.toString();
    }
    // change priorityqueue to maximum priorityqueue
    public static PriorityQueue<Object> changeToMaximumPriorityQueue(PriorityQueue<Object> priorityQueue) {
        PriorityQueue<Object> maximumPriorityQueue = new PriorityQueue<Object>(Collections.reverseOrder());
        maximumPriorityQueue.addAll(priorityQueue);
        return maximumPriorityQueue;
    }
}
