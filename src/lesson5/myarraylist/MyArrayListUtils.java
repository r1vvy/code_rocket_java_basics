package lesson5.myarraylist;

public class MyArrayListUtils {
    public static <T> void copy(MyArrayList<T> src, MyArrayList<T> dst) {
        for (int i = 0; i < src.size(); i++) {
            dst.add(src.get(i));
        }
    }

    public static <T> void print(MyArrayList<T> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

    // update specific element in the list
    public static <T> void update(MyArrayList<T> list, int index, T value) {
        if (index < 0 || index >= list.size()) {
            throw new IndexOutOfBoundsException();
        }
        list.updateValue(value, index);
    }

    // replace second element with specified value
    public static <T> void replaceSecondElement(MyArrayList<T> list, T value) {
        if (list.size() < 2) {
            throw new IndexOutOfBoundsException();
        }
        list.updateValue(value, 1);
    }
    // remove third element from the list
    public static <T> void removeThirdElement(MyArrayList<T> list) {
        if (list.size() < 3) {
            throw new IndexOutOfBoundsException();
        }
        list.remove(2);
    }
    // does element exist in the list
    public static <T> boolean doesElementExist(MyArrayList<T> list, T value) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(value)) {
                return true;
            }
        }
        return false;
    }
    // find index of element in the list
    public static <T> int findIndexOfElement(MyArrayList<T> list, T value) {
        if(doesElementExist(list, value) == false) {
            return -1;
        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(value)) {
                return i;
            }
        }
        return -1;
    }
    // sort list in ascending order
    public static <T extends Comparable<T>> void sort(MyArrayList<T> list) {
        for (int i = 0; i < list.size(); i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i).compareTo(list.get(j)) > 0) {
                    T temp = list.get(i);
                    list.updateValue(list.get(j), i);
                    list.updateValue(temp, j);
                }
            }
        }
    }

    // shuffle list
    public static <T> void shuffle(MyArrayList<T> list) {
        for (int i = 0; i < list.size(); i++) {
            int randomIndex = (int) (Math.random() * list.size());
            T temp = list.get(i);
            list.updateValue(list.get(randomIndex), i);
            list.updateValue(temp, randomIndex);
        }
    }
    // reverse list
    public static <T> void reverse(MyArrayList<T> list) {
        for (int i = 0; i < list.size() / 2; i++) {
            T temp = list.get(i);
            list.updateValue(list.get(list.size() - 1 - i), i);
            list.updateValue(temp, list.size() - 1 - i);
        }
    }
    // extract sublist from list
    public static <T> MyArrayList<T> extractSublist(MyArrayList<T> list, int startIndex, int endIndex) {
        if (startIndex < 0 || startIndex >= list.size() || endIndex < 0 || endIndex >= list.size()) {
            throw new IndexOutOfBoundsException();
        }
        MyArrayList<T> subList = new MyArrayList<T>();
        for (int i = startIndex; i <= endIndex; i++) {
            subList.add(list.get(i));
        }
        return subList;
    }

    // compare two lists
    public static <T> boolean compare(MyArrayList<T> list1, MyArrayList<T> list2) {
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

    // join two lists
    public static <T> MyArrayList<T> join(MyArrayList<T> list1, MyArrayList<T> list2) {
        MyArrayList<T> joinedList = new MyArrayList<T>();
        for (int i = 0; i < list1.size(); i++) {
            joinedList.add(list1.get(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            joinedList.add(list2.get(i));
        }
        return joinedList;
    }
    // combine two lists into a single list
    public static <T> MyArrayList<T> combineLists(MyArrayList<T> list1, MyArrayList<T> list2) {
        MyArrayList<T> combinedList = new MyArrayList<T>();
        for (int i = 0; i < list1.size(); i++) {
            combinedList.add(list1.get(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            combinedList.add(list2.get(i));
        }
        return combinedList;
    }


}   
