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
        try {
            ShapeCreationRequest request = userInput.getShapeCreationRequestFromUser();
            Shape shape = this.shapeCreationService.createShapeFromUserInput(request);
            this.shapeCreationService.saveShapeFromUserInput(request);
            System.out.println("Shape created successfully!");
            System.out.println("New shape: " + shape.toString());
        } catch (ShapeValidationException | IllegalArgumentException e) {
            System.err.println(e.getMessage());
            System.err.println("Please try again!");
        }
    }
}
