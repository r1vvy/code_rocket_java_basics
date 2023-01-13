package lesson2.task4;

public class TriangleService {

    public void printTriangleInfo(Triangle triangle)
    {
        System.out.printf(
                "Perimeter: %f \n" +
                        "Area: %f \n",
                triangle.getPerimeter(),
                triangle.getArea()
        );
    }
    public Triangle calculatePerimeter(Triangle triangle)
    {
        double sideOne = triangle.getSideOne();
        double sideTwo = triangle.getSideTwo();
        double sideThree = triangle.getSideThree();
        double perimeter = sideOne + sideTwo + sideThree;

        return new Triangle(
                sideOne,
                sideTwo,
                sideThree,
                perimeter,
                triangle.getArea()
        );
    }
    public Triangle calculateArea(Triangle triangle)
    {
        double sideOne = triangle.getSideOne();
        double sideTwo = triangle.getSideTwo();
        double sideThree = triangle.getSideThree();
        // https://www.omnicalculator.com/math/3-sides-triangle-area
        double halfPerimeter = (sideOne + sideTwo + sideThree) / 2;
        double area = Math.sqrt(
                halfPerimeter * (
                        (halfPerimeter - sideOne) * (halfPerimeter - sideTwo) * (halfPerimeter - sideThree)
                )
        );

        return new Triangle(
                sideOne,
                sideTwo,
                sideThree,
                triangle.getPerimeter(),
                area
        );
    }

}
