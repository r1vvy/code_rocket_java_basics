package lesson2.task6;

public class Area {
    private double length, breadth;

    public Area(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public void setDim(double length, double breadth)
    {
        this.length = length;
        this.breadth = breadth;
    }
    public double getArea()
    {
        return this.length * this.breadth;
    }
}
