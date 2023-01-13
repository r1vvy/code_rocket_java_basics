package lesson2.task4;

public class TriangleDemo {
    public static void main(String[] args) {
        TriangleService triangleService = new TriangleService();
        Triangle triangle = new Triangle(3.0, 4.0, 5.0, 0, 0);

        triangle = triangleService.calculatePerimeter(triangle);
        triangle = triangleService.calculateArea(triangle);

        triangleService.printTriangleInfo(triangle);
    }
}
