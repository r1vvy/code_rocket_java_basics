package lesson2.task5;

public class Rectangle {
    private double sideOne, sideTwo;

    public Rectangle(double sideOne, double sideTwo) {
        this.sideOne = sideOne;
        this.sideTwo = sideTwo;
    }

    public double Area()
    {
        return this.sideOne * this.sideTwo;
    }
}
