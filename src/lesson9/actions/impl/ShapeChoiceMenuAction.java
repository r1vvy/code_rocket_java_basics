package lesson9.actions.impl;

import lesson9.*;
import lesson9.actions.MenuAction;
import lesson9.exceptions.ShapeNotFoundException;
import lesson9.models.Shape;
import lesson9.repository.ShapeRepositoryEmptyException;
import lesson9.requests.ShapeChoiceRequest;
import lesson9.services.ShapeChoiceService;
import lesson9.services.ShapeOperationService;

public class ShapeChoiceMenuAction implements MenuAction {
    private final UserInput userInput;
    private final ShapeChoiceService shapeChoiceService;
    private final ShapeOperationService shapeOperationService;

    public ShapeChoiceMenuAction(UserInput userInput, ShapeChoiceService shapeChoiceService, ShapeOperationService shapeOperationService) {
        this.userInput = userInput;
        this.shapeChoiceService = shapeChoiceService;
        this.shapeOperationService = shapeOperationService;
    }

    private void initiateOperationMenuAction() {
        ShapeOperationMenuAction shapeOperationMenuAction = new ShapeOperationMenuAction(userInput, shapeOperationService);
        shapeOperationMenuAction.execute();
    }
    @Override
    public String getName() {
        return "Choose shape";
    }

    @Override
    public void execute() {
        try {
            ShapeChoiceRequest shapeChoiceRequest = userInput.getShapeChoiceRequestFromUser();

            Shape shape = shapeChoiceService.chooseShape(shapeChoiceRequest);
            this.userInput.setChosenShape(shape);
            System.out.println("Shape choice: " + shape.toString());

            initiateOperationMenuAction();
        } catch (ShapeNotFoundException | ShapeRepositoryEmptyException e) {
            System.err.println(e.getMessage());
        }
    }
}
