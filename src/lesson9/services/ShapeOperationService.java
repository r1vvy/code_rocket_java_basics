package lesson9.services;

import lesson9.models.Shape;
import lesson9.requests.ShapeOperationRequest;

public class ShapeOperationService {
    private final ShapeService shapeService;

    public ShapeOperationService(ShapeService shapeService) {
        this.shapeService = shapeService;
    }

    public void calculateAreaOfShapeFromUserInput(ShapeOperationRequest shapeOperationRequest) {
        Shape shape = shapeOperationRequest.getShape();
        shape.calculateArea();

        this.shapeService.update(shape);
    }
    public void calculatePerimeterOfShapeFromUserInput(ShapeOperationRequest shapeOperationRequest) {
        Shape shape = shapeOperationRequest.getShape();
        shape.calculatePerimeter();

        this.shapeService.update(shape);
    }

    public void addShapePerimeterFromUserInputToTotalPerimeterInRepo(ShapeOperationRequest shapeOperationRequest) {
        Shape shape = shapeOperationRequest.getShape();

        this.shapeService.addToTotalPerimeterFromRepo(shape.getPerimeter());
    }
    public void addShapeAreaFromUserInputToTotalPerimeterInRepo(ShapeOperationRequest shapeOperationRequest) {
        Shape shape = shapeOperationRequest.getShape();

        this.shapeService.addToTotalAreaFromRepo(shape.getArea());
    }
}
