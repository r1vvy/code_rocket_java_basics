package lesson9;

public class ShapeChoiceRequest {
    private final Shape shape;

    public ShapeChoiceRequest(Shape shape) {
        this.shape = shape;
    }

    public Shape getShape() {
        return shape;
    }
}
