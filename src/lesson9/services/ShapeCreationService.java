package lesson9.services;

import lesson9.models.Shape;
import lesson9.requests.ShapeCreationRequest;
import lesson9.validators.UserInputValidator;

public class ShapeCreationService {
    private final ShapeService shapeService;
    private final UserInputValidator userInputValidator;

    public ShapeCreationService(ShapeService shapeService, UserInputValidator userInputValidator) {
        this.shapeService = shapeService;
        this.userInputValidator = userInputValidator;
    }

    public Shape createShapeFromUserInput(ShapeCreationRequest request) {
        Shape shape = request.getShape();
        shape.setParametersMap(request.getParameters());

        if(userInputValidator.validateShapeCreationParameters(shape.getParametersMap()) == false) {
            throw new IllegalArgumentException("Parameter value should be greater than zero");
        } else {
            return shape;
        }
    }

    public void saveShapeFromUserInput(ShapeCreationRequest request) {
        this.shapeService.save(request.getShape());
    }
}
