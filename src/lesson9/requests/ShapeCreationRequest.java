package lesson9.requests;

import lesson9.models.Shape;

import java.math.BigDecimal;
import java.util.HashMap;

public class ShapeCreationRequest {
    private final Shape shape;
    private final HashMap<String, BigDecimal> parameters;

    public ShapeCreationRequest(Shape shape, HashMap<String, BigDecimal> parameters) {
        this.shape = shape;
        this.parameters = parameters;
    }
    public Shape getShape() {
        return shape;
    }

    public HashMap<String, BigDecimal> getParameters() {
        return parameters;
    }
}
