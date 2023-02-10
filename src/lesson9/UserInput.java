package lesson9;

import lesson9.models.Shape;
import lesson9.repository.ShapeRepository;
import lesson9.requests.ShapeChoiceRequest;
import lesson9.requests.ShapeCreationRequest;
import lesson9.requests.ShapeOperationRequest;
import lesson9.services.ShapeService;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

// TODO: exceptions should be thrown in business logic services.
public class UserInput {
    private final List<Shape> shapeTypes;
    private final ShapeService shapeService;
    private Shape chosenShape;

    public UserInput(List<Shape> shapeTypes, ShapeRepository shapeRepo) {
        this.shapeTypes = shapeTypes;
        this.shapeService = new ShapeService(shapeRepo);
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

        int shapeChoice = getIntInput();

        Shape newShape = shapeTypes.get(shapeChoice);

        HashMap<String, BigDecimal> parameters = getShapeCreationParametersFromUser(shapeTypes.get(shapeChoice));

        return new ShapeCreationRequest(newShape, parameters);
    }
    public ShapeChoiceRequest getShapeChoiceRequestFromUser() {
        // TODO: If repo doesnt contain any shapes, throw an exception.
        System.out.println("====================================");
        this.shapeService.printAllShapesFromRepo();
        System.out.println("====================================");
        System.out.println("Pick a shape to do operations on!");

        return new ShapeChoiceRequest(getIntInput());
    }

    public ShapeOperationRequest getShapeOperationRequestFromUser() {
        System.out.println("Choose action: ");
        printAllShapeActions();

        return new ShapeOperationRequest(getIntInput(), this.chosenShape);
    }

    private void printAllShapeActions() {
        System.out.println("1. Calculate perimeter");
        System.out.println("2. Calculate area");
        System.out.println("3. Add to total perimeter");
        System.out.println("4. Add to total area");
    }
    private HashMap<String, BigDecimal> getShapeCreationParametersFromUser(Shape shape) {
        HashMap<String, BigDecimal> parameters = new HashMap<>();

        for (String parameterName : shape.getParametersMap().keySet()) {
            System.out.println("Please enter " + parameterName);

            parameters.put(parameterName, getBigDecimalInput());
        }

        return parameters;
    }

    private void printAllShapeClassSimpleNames() {
        System.out.println("====================================");
        for (int i = 0; i < shapeTypes.size(); i++) {
            System.out.println(i + "." + shapeTypes.get(i).getClass().getSimpleName());
        }
        System.out.println("====================================");
    }

    private BigDecimal getBigDecimalInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextBigDecimal();
    }

    public int getIntInput() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input your choice: ");
        return scanner.nextInt();
    }
}
