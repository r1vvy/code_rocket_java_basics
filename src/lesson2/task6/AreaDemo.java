package lesson2.task6;

import java.util.Scanner;

public class AreaDemo {
    public static void main(String[] args) {
        double length, breadth;
        Area area = new Area(0, 0);

        System.out.println("Length:");
        Scanner myLength = new Scanner(System.in);
        length = myLength.nextDouble();


        System.out.println("Breadth:");
        Scanner myBreadth = new Scanner(System.in);
        breadth = myBreadth.nextDouble();

        area.setDim(length, breadth);
        System.out.printf("Area: %f", area.getArea());

        myLength.close();
        myBreadth.close();
    }
}
