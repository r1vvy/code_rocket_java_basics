package lesson2.task5;

import org.w3c.dom.ls.LSOutput;

public class RectangleDemo {
    public static void main(String[] args) {
        Rectangle rectangleOne = new Rectangle(4, 5);
        Rectangle rectangleTwo = new Rectangle(5, 8);

        System.out.println(rectangleOne.Area());
        System.out.println(rectangleTwo.Area());
    }
}
