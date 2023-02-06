package lesson9;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class UserInput {
    private final List<Shape> shapeTypes;

    public UserInput(List<Shape> shapeTypes) {
        this.shapeTypes = shapeTypes;
    }

    public ShapeCreationRequest getRequestFromUser() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Please choose shape: ");
        printAllShapeClassSimpleNames();

        int shapeChoice = scanner.nextInt();
        if(0 > shapeChoice || shapeChoice > shapeTypes.size()) {
            throw new IllegalArgumentException("Invalid shape choice");
        }

        Shape shape = shapeTypes.get(shapeChoice);
        HashMap<String, BigDecimal> parameters = getParametersFromUser(shape);

        return new ShapeCreationRequest(shape, parameters);
    }

    private HashMap<String, BigDecimal> getParametersFromUser(Shape shape) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String, BigDecimal> parameters = new HashMap<>();
        for (String parameterName : shape.getParametersMap().keySet()) {
            System.out.println("Please enter " + parameterName);
            BigDecimal parameterValue = scanner.nextBigDecimal();
            parameters.put(parameterName, parameterValue);
        }
        return parameters;
    }

    private void printAllShapeClassSimpleNames() {
        for (int i = 0; i < shapeTypes.size(); i++) {
            System.out.println(i + "." + shapeTypes.get(i).getClass().getSimpleName());
        }
    }

    public int getNumber() {
        System.out.println("Please enter number: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
