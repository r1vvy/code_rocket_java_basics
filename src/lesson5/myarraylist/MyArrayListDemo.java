package lesson5.myarraylist;

public class MyArrayListDemo {
    public static void main(String[] args) {
        MyArrayListUtils utils = new MyArrayListUtils();

        MyArrayList<String> list = new MyArrayList<>();
        list.add("Hello");
        list.add("World");
        list.add("!");
        
        utils.print(list);
        System.out.println("SIZE: " + list.size());
        System.out.println("2nd ELEMENT: " + list.get(1));
        list.remove(1);
        utils.print(list);
        System.out.println(list.size());

        // test utils
        MyArrayList<String> list2 = new MyArrayList<>();
        list2.add("Hello");
        list2.add("World");
        list2.add("!");
        utils.copy(list2, list);
        utils.print(list);
        utils.update(list, 1, "World");
        utils.print(list);
        utils.replaceSecondElement(list, "World");
        utils.print(list);
        utils.removeThirdElement(list);
        utils.print(list);
        System.out.println(utils.doesElementExist(list, "World"));
        System.out.println(utils.findIndexOfElement(list, "World"));
        utils.sort(list);
        utils.print(list);
    }
}
