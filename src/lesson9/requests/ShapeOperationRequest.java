package lesson9.requests;

import lesson9.models.Shape;

public class ShapeOperationRequest {
    private final Shape shape;
    private final int actionChoice;

    public ShapeOperationRequest(int actionChoice, Shape shape) {
        this.actionChoice = actionChoice;
        this.shape = shape;
    }

    public int getActionChoice() {
        return actionChoice;
    }

    public Shape getShape() {
        return shape;
    }
}
