package lesson9.actions.impl;

import lesson9.requests.ShapeOperationRequest;
import lesson9.services.ShapeOperationService;
import lesson9.UserInput;
import lesson9.actions.MenuAction;

public class ShapeOperationMenuAction implements MenuAction {
    private final UserInput userInput;
    private final ShapeOperationService shapeOperationService;

    public ShapeOperationMenuAction(UserInput userInput, ShapeOperationService shapeOperationService) {
        this.userInput = userInput;
        this.shapeOperationService = shapeOperationService;
    }

    @Override
    public String getName() {
        return "Operations with Shape";
    }

    @Override
    public void execute() {
        // TODO: catch NullPointerException
        ShapeOperationRequest shapeOperationRequest = this.userInput.getShapeOperationRequestFromUser();
        int actionChoice = shapeOperationRequest.getActionChoice();
        switch (actionChoice) {
            case 1 -> shapeOperationService.calculatePerimeterOfShapeFromUserInput(shapeOperationRequest);
            case 2 -> shapeOperationService.calculateAreaOfShapeFromUserInput(shapeOperationRequest);
            case 3 -> shapeOperationService.addShapePerimeterFromUserInputToTotalPerimeterInRepo(shapeOperationRequest);
            case 4 -> shapeOperationService.addShapeAreaFromUserInputToTotalPerimeterInRepo(shapeOperationRequest);
            default -> throw new IllegalArgumentException("Invalid input");
        }
        System.out.println("Updated succesfully!");
    }
}
