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
            Shape shape = shapeCreationService.createShapeFromUserInput(request);

            // test part
            ShapeCalculatorImpl shapeCalculator = new ShapeCalculatorImpl();
            shapeCalculator.calculateArea(shape);
            //
            userInput.getShapeRepo().save(shape);
            System.out.println(shape.toString());
        } catch (ShapeValidationException | IllegalArgumentException e) {
            System.err.println(e.getMessage());
            System.err.println("Please try again!");
        }
    }
}
