package lesson2.task4;


public class Triangle {
    private final double sideOne, sideTwo, sideThree, perimeter, area;

    public Triangle(double sideOne, double sideTwo, double sideThree, double perimeter, double area) throws IllegalArgumentException {
        if (sideOne + sideTwo > sideThree && sideOne + sideThree > sideTwo && sideTwo + sideThree > sideOne) {
            this.sideOne = sideOne;
            this.sideTwo = sideTwo;
            this.sideThree = sideThree;
            this.perimeter = perimeter;
            this.area = area;
        } else {
            throw new IllegalArgumentException("Invalid side arguments");
        }
    }
    public double getSideOne() {
        return sideOne;
    }
    public double getSideTwo() {
        return sideTwo;
    }
    public double getSideThree() {
        return sideThree;
    }
    public double getPerimeter() {
        return perimeter;
    }
    public double getArea() {
        return area;
    }

}
