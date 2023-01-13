package lesson2.task3;

import lesson2.task3.TriangleService;

public class TriangleDemo {
    public static void main(String[] args) {
        TriangleService triangleService = new TriangleService();
        Triangle triangle = new Triangle();
        triangle.setSideOne(3);
        triangle.setSideTwo(4);
        triangle.setSideThree(5);

        triangle = triangleService.calculatePerimeter(triangle);
        triangle = triangleService.calculateArea(triangle);

        triangleService.printTriangleInfo(triangle);
    }
}
