package lesson9;

import java.util.ArrayList;
import java.util.List;

public class ShapeStorage {
    private List<Shape> shapes;

    public ShapeStorage() {
        shapes = new ArrayList<>();
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public List<Shape> getShapes() {
        return shapes;
    }

    public void printShapes() {
        for (int i = 0; i < shapes.size(); i++) {
            System.out.println(i + ". " + shapes.get(i).toString());
        }
    }
}
