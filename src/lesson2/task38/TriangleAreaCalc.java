package lesson2.task38;

public class TriangleAreaCalc {
    public static void main(String[] args) {
        System.out.println("The area of the triangle is " + triangleArea(10, 15, 20));
    }
    
    public static double triangleArea(double sideOne, double sideTwo, double sideThree) {
        double area = (sideOne + sideTwo + sideThree) / 2;
        return Math.sqrt(area * (area - sideOne) * (area - sideTwo) * (area - sideThree));
    }
}
