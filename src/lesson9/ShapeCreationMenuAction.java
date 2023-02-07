package lesson9;

public class ShapeCreationMenuAction implements MenuAction{
    
    private final UserInput userInput;
    private final ShapeCreationService shapeCreationService;

    public ShapeCreationMenuAction(UserInput userInput, ShapeCreationService shapeCreationService) {
        this.userInput = userInput;
        this.shapeCreationService = shapeCreationService;
    }

    @Override
    public String getName() {
        return "Create shape";
    }
    
    @Override
    public void execute() {
        ShapeCreationRequest request = userInput.getShapeCreationRequestFromUser();
        Shape shape = shapeCreationService.createShapeFromUserInput(request);
        userInput.getShapeStorage().addShape(shape);

        System.out.println(shape.toString());
    }
}
