package lesson9;

public class ShapeChoiceMenuAction implements MenuAction {
    private final UserInput userInput;
    private final ShapeChoiceService shapeChoiceService;
    private final ShapeOperationService shapeOperationService;

    public ShapeChoiceMenuAction(UserInput userInput, ShapeChoiceService shapeChoiceService, ShapeOperationService shapeOperationService) {
        this.userInput = userInput;
        this.shapeChoiceService = shapeChoiceService;
        this.shapeOperationService = shapeOperationService;
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
            System.out.println("Shape choice: " + shape.toString());
            this.userInput.setChosenShape(shape);
            ShapeOperationMenuAction shapeOperationMenuAction = new ShapeOperationMenuAction(userInput, shapeOperationService);
            shapeOperationMenuAction.execute();
        } catch (ShapeNotFoundException e) {
            System.err.println(e.getMessage());
            System.err.println("Please CREATE a new shape!");
        }
    }
}
