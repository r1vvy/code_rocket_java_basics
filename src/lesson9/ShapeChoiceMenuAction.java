package lesson9;

public class ShapeChoiceMenuAction implements MenuAction {
    private final UserInput userInput;
    private final ShapeChoiceService shapeChoiceService;
    private Shape chosenShape;

    public ShapeChoiceMenuAction(UserInput userInput, ShapeChoiceService shapeChoiceService) {
        this.userInput = userInput;
        this.shapeChoiceService = shapeChoiceService;
    }

    public Shape getChosenShape() {
        return chosenShape;
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
            // TODO: executes ShapeOperationMenuAction
        } catch (ShapeNotFoundException e) {
            System.err.println(e.getMessage());
            System.err.println("Please CREATE a new shape!");
        }
    }
}
