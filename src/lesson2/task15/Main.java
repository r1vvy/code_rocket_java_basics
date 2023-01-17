package lesson2.task15;

public class Main {
    public static void main(String[] args) {
        String name = "Hello, World";
        System.out.println("First occurence of o: " + name.indexOf("o") + 1);
        System.out.println("Last occurence of o: " + name.lastIndexOf("o") + 1);
        System.out.println("First occurence of ',': " + name.indexOf(",") + 1);
        System.out.println("Last occurence of ',': " + name.lastIndexOf(",") + 1);
    }
}
