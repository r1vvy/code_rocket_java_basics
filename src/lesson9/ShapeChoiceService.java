package lesson9;

import java.util.Optional;

public class ShapeChoiceService {
    private final ShapeService shapeService;
    public ShapeChoiceService(ShapeService shapeService) {
        this.shapeService = shapeService;
    }

    public Shape chooseShape(ShapeChoiceRequest request) {
        return this.shapeService.getShapeById(request.getChoice());
    }
}
