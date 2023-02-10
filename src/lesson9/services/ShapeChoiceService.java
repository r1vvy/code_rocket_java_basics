package lesson9.services;

import lesson9.models.Shape;
import lesson9.requests.ShapeChoiceRequest;

public class ShapeChoiceService {
    private final ShapeService shapeService;
    public ShapeChoiceService(ShapeService shapeService) {
        this.shapeService = shapeService;
    }

    public Shape chooseShape(ShapeChoiceRequest request) {
        return this.shapeService.getShapeById(request.getChoice());
    }
}
