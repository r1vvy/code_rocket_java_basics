package lesson9.services;

import lesson9.models.Shape;
import lesson9.requests.ShapeCreationRequest;

public class ShapeCreationService {
    private final ShapeService shapeService;

    public ShapeCreationService(ShapeService shapeService) {
        this.shapeService = shapeService;
    }

    public Shape createShapeFromUserInput(ShapeCreationRequest request) {
        Shape shape = request.getShape();
        shape.setParametersMap(request.getParameters());
        return shape;
    }

    public void saveShapeFromUserInput(ShapeCreationRequest request) {
        this.shapeService.save(request.getShape());
    }
}
