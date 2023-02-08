package lesson9;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class UserInput {
    private final List<Shape> shapeTypes;
    private final ShapeService shapeService;
    private final Scanner scanner;

    public UserInput(List<Shape> shapeTypes, ShapeRepository shapeRepo) {
        this.shapeTypes = shapeTypes;
        this.shapeService = new ShapeService(shapeRepo);
        this.scanner = new Scanner(System.in);
    }

    public ShapeCreationRequest getShapeCreationRequestFromUser() {
        System.out.println("Please choose shape: ");
        printAllShapeClassSimpleNames();

        int shapeChoice = getChoice();
        Shape newShape = shapeTypes.get(shapeChoice);
        HashMap<String, BigDecimal> parameters = getShapeCreationParametersFromUser(newShape);

        return new ShapeCreationRequest(newShape, parameters);
    }

    public ShapeChoiceRequest getShapeChoiceRequestFromUser(){
        System.out.println("Please choose shape to do operations on: ");
        this.shapeService.printRepository();
        return new ShapeChoiceRequest(getChoice());
    }

    public int getNumber() {
        System.out.println("Please enter number: ");
        return getIntInput();
    }

    private int getChoice() {
        return getIntInput();
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

    private int getIntInput() {
        return scanner.nextInt();
    }

    private BigDecimal getBigDecimalInput() {
        return scanner.nextBigDecimal();
    }
}
