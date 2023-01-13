package lesson2.task3;


public class Triangle {
    private double sideOne, sideTwo, sideThree, perimeter, area;
    public Triangle() {
    }
    public double getSideOne() {
        return sideOne;
    }

    public void setSideOne(double sideOne) {
        if(this.sideTwo > 0 && this.sideThree > 0)
        {
            double sideOtherSum = this.sideTwo + this.sideThree;
            if(sideOne > 0 && sideOne < sideOtherSum)
            {
                this.sideOne = sideOne;
            }
        } else if(sideOne > 0){
            this.sideOne = sideOne;
        }
    }

    public double getSideTwo() {
        return sideTwo;
    }

    public void setSideTwo(double sideTwo) {
        if(this.sideOne > 0 && this.sideThree > 0)
        {
            double sideOtherSum = this.sideOne + this.sideThree;
            if(sideTwo > 0 && sideTwo < sideOtherSum)
            {
                this.sideTwo = sideTwo;
            }
        } else if(sideTwo > 0){
            this.sideTwo = sideTwo;
        }
    }

    public double getSideThree() {
        return sideThree;
    }

    public void setSideThree(double sideThree) {
        if(this.sideOne > 0 && this.sideTwo > 0)
        {
            double sideOtherSum = this.sideOne + this.sideTwo;
            if(sideThree > 0 && sideThree < sideOtherSum)
            {
                this.sideThree = sideThree;
            }
        } else if(sideThree > 0){
            this.sideThree = sideThree;
        }
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
