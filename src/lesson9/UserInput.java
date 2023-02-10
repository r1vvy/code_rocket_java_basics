package lesson9;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

// TODO: exceptions should be thrown in business logic services.
public class UserInput {
    private final List<Shape> shapeTypes;
    private final ShapeService shapeService;
    private final Scanner scanner;

    private Shape chosenShape;

    public UserInput(List<Shape> shapeTypes, ShapeRepository shapeRepo) {
        this.shapeTypes = shapeTypes;
        this.shapeService = new ShapeService(shapeRepo);
        this.scanner = new Scanner(System.in);
    }

    public void setChosenShape(Shape chosenShape) {
        this.chosenShape = chosenShape;
    }

    public Shape getChosenShape() {
        return chosenShape;
    }

    public ShapeCreationRequest getShapeCreationRequestFromUser() {
        System.out.println("Please choose shape: ");
        printAllShapeClassSimpleNames();

        int shapeChoice = getChoice();

        Shape newShape = shapeTypes.get(shapeChoice);
        HashMap<String, BigDecimal> parameters = getShapeCreationParametersFromUser(newShape);

        return new ShapeCreationRequest(newShape, parameters);
    }
    public ShapeChoiceRequest getShapeChoiceRequestFromUser() {
        // TODO: If repo doesnt contain any shapes, throw an exception.
        this.shapeService.printAllShapesFromRepo();
        System.out.println("Pick a shape to do operations on: ");
        return new ShapeChoiceRequest(getChoice());
    }

    public ShapeOperationRequest getShapeOperationRequestFromUser() {
        System.out.println("Choose action: ");
        printAllShapeActions();
        int choice = getChoice();

        return new ShapeOperationRequest(choice, this.chosenShape);
    }

    private void printAllShapeActions() {
        System.out.println("Actions: ");
        System.out.println("1. Calculate perimeter");
        System.out.println("2. Calculate area");
        System.out.println("3. Add to total perimeter");
        System.out.println("4. Add to total area");
    }

    private int getChoice() {
        Scanner scanner = new Scanner(System.in);

        return scanner.nextInt();
    }

    private HashMap<String, BigDecimal> getShapeCreationParametersFromUser(Shape shape) {
        HashMap<String, BigDecimal> parameters = new HashMap<>();
        for (String parameterName : shape.getParametersMap().keySet()) {
            System.out.println("Please enter " + parameterName);
            BigDecimal parameterValue = getBigDecimalInput();
            parameters.put(parameterName, parameterValue);
        }
        return parameters;
    }

    private void printAllShapeClassSimpleNames() {
        for (int i = 0; i < shapeTypes.size(); i++) {
            System.out.println(i + "." + shapeTypes.get(i).getClass().getSimpleName());
        }
    }

    private BigDecimal getBigDecimalInput() {
        return scanner.nextBigDecimal();
    }

    public int getMenuChoice() {
        return scanner.nextInt();
    }
}
