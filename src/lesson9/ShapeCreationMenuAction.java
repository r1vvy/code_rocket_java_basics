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
        ShapeCreationRequest request = userInput.getRequestFromUser();
        Shape shape = shapeCreationService.createShapeFromUserInput(request);
        System.out.println(shape.toString());
    }
}
