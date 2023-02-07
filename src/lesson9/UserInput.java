package lesson9;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class UserInput {
    private final List<Shape> shapeTypes;
    private ShapeStorage shapeStorage;

    public UserInput(List<Shape> shapeTypes, ShapeStorage shapeStorage) {
        this.shapeTypes = shapeTypes;
        this.shapeStorage = shapeStorage;
    }

    public ShapeCreationRequest getShapeCreationRequestFromUser() {
        
        System.out.println("Please choose shape: ");
        printAllShapeClassSimpleNames();

        int shapeChoice = getShapeChoice();

        Shape newShape = shapeTypes.get(shapeChoice);
        HashMap<String, BigDecimal> parameters = getShapeCreationParametersFromUser(newShape);

        return new ShapeCreationRequest(newShape, parameters);
    }

    private int getShapeChoice() {
        Scanner scanner = new Scanner(System.in);
        int shapeChoice = scanner.nextInt();
        if(shapeChoice < 0 || shapeChoice >= shapeTypes.size()) {
            throw new IllegalArgumentException("Invalid shape choice");
        }
        return shapeChoice;
    }

    private HashMap<String, BigDecimal> getShapeCreationParametersFromUser(Shape shape) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, BigDecimal> parameters = new HashMap<>();
        for (String parameterName : shape.getParametersMap().keySet()) {
            System.out.println("Please enter " + parameterName);
            BigDecimal parameterValue = scanner.nextBigDecimal();
            parameters.put(parameterName, parameterValue);
        }
        return parameters;
    }

    public ShapeChoiceRequest getShapeChoiceRequestFromUser() throws Exception {
        Scanner scanner = new Scanner(System.in);
        List<Shape> existingShapes = this.shapeStorage.getShapes();
        if(existingShapes.isEmpty()) {
            throw new Exception("There are no existing shapes.");
        } else {
            this.shapeStorage.printShapes();

            int shapeChoice = scanner.nextInt();
            shapeChoice = getShapeChoice();

            return new ShapeChoiceRequest(existingShapes.get(shapeChoice));
        }
    }

    public ShapeStorage getShapeStorage() {
        return shapeStorage;
    }

    public int getNumber() {
        System.out.println("Please enter number: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private void printAllShapeClassSimpleNames() {
        for (int i = 0; i < shapeTypes.size(); i++) {
            System.out.println(i + "." + shapeTypes.get(i).getClass().getSimpleName());
        }
    }
}
