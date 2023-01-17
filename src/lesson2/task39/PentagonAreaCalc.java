package lesson2.task39;

public class PentagonAreaCalc {
    public static void main(String[] args) {
        double area = calcArea(6);
        System.out.println("The area of the pentagon is " + area);
    }

    public static double calcArea(double side) {
        return (5 * side * side) / (4 * Math.tan(Math.PI / 5));
    }
}
