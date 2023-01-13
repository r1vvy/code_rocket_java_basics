package lesson2.task3;

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
        Triangle tempTriangle = new Triangle();

        double sideOne = triangle.getSideOne();
        double sideTwo = triangle.getSideTwo();
        double sideThree = triangle.getSideThree();
        double perimeter = sideOne + sideTwo + sideThree;

        tempTriangle.setSideOne(sideOne);
        tempTriangle.setSideTwo(sideTwo);
        tempTriangle.setSideThree(sideThree);
        tempTriangle.setPerimeter(perimeter);
        tempTriangle.setArea(triangle.getArea());

        return tempTriangle;
    }
    public Triangle calculateArea(Triangle triangle)
    {
        Triangle tempTriangle = new Triangle();

        double sideOne = triangle.getSideOne();
        double sideTwo = triangle.getSideTwo();
        double sideThree = triangle.getSideThree();
        // https://www.omnicalculator.com/math/3-sides-triangle-area
        double halfPerimeter = (sideOne + sideTwo + sideThree) / 2;
        double area = Math.sqrt(halfPerimeter * (
                (halfPerimeter - sideOne) * (halfPerimeter - sideTwo) * (halfPerimeter - sideThree)
                )
        );

        tempTriangle.setSideOne(sideOne);
        tempTriangle.setSideTwo(sideTwo);
        tempTriangle.setSideThree(sideThree);
        tempTriangle.setPerimeter(triangle.getPerimeter());
        tempTriangle.setArea(area);

        return tempTriangle;
    }

}
