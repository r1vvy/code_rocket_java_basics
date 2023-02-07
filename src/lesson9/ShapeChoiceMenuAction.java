package lesson9;

public class ShapeChoiceMenuAction implements MenuAction {
    private final UserInput userInput;
    private final ShapeChoiceService shapeChoiceService;

    public ShapeChoiceMenuAction(UserInput userInput, ShapeChoiceService shapeChoiceService) {
        this.userInput = userInput;
        this.shapeChoiceService = shapeChoiceService;
    }

    @Override
    public String getName() {
        return "Choose shape";
    }

    @Override
    public void execute() {
        ShapeChoiceRequest shapeChoiceRequest = userInput.getShapeChoiceRequestFromUser();
        Shape shape = shapeChoiceService.chooseShapeFromUserInput(shapeChoiceRequest);

        System.out.println("Shape choice: " + shape.toString());
    }
}
