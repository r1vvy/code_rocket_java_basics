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
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please choose shape: ");
        printAllShapeClassSimpleNames();

        int shapeChoice = scanner.nextInt();
        if(0 > shapeChoice || shapeChoice > shapeTypes.size()) {
            throw new IllegalArgumentException("Invalid shape choice");
        }

        Shape newShape = shapeTypes.get(shapeChoice);
        HashMap<String, BigDecimal> parameters = getShapeCreationParametersFromUser(newShape);

        return new ShapeCreationRequest(newShape, parameters);
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

    public ShapeChoiceRequest getShapeChoiceRequestFromUser() {
        Scanner scanner = new Scanner(System.in);
        List<Shape> existingShapes = this.shapeStorage.getShapes();
        if(existingShapes.isEmpty()) {
            // TODO: throws exception
            System.out.println("No existing shapes found, please create a new shape first");
            return null;
        } else {
            this.shapeStorage.printShapes();
            int shapeChoice = scanner.nextInt();
            if(0 > shapeChoice || shapeChoice > shapeTypes.size()) {
                throw new IllegalArgumentException("Invalid shape choice");
            } else {
                return new ShapeChoiceRequest(existingShapes.get(shapeChoice));
            }
        }
    }
    public void getShapeCalcRequestFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What do you want to calculate?");


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
