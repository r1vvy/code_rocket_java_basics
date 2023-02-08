package lesson9;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

// TODO: exceptions should be thrown in business logic services.
public class UserInput {
    private final List<Shape> shapeTypes;
    private ShapeRepository shapeRepo;

    public UserInput(List<Shape> shapeTypes, ShapeRepository shapeRepo) {
        this.shapeTypes = shapeTypes;
        this.shapeRepo = shapeRepo;
    }

    public ShapeCreationRequest getShapeCreationRequestFromUser() {
        
        System.out.println("Please choose shape: ");
        printAllShapeClassSimpleNames();

        int shapeChoice = getShapeTypeChoice();

        Shape newShape = shapeTypes.get(shapeChoice);
        HashMap<String, BigDecimal> parameters = getShapeCreationParametersFromUser(newShape);

        return new ShapeCreationRequest(newShape, parameters);
    }
    public ShapeChoiceRequest getShapeChoiceRequestFromUser() throws Exception {
        Scanner scanner = new Scanner(System.in);
        if(this.shapeRepo.getRepository().isEmpty()) {
            throw new Exception("There are no existing shapes.");
        } else {
            this.shapeRepo.printRepository();
            return new ShapeChoiceRequest(getExistingShapeChoice());
        }
    }
    private int getShapeTypeChoice() {
        Scanner scanner = new Scanner(System.in);
        int shapeChoice = scanner.nextInt();
        if(shapeChoice < 0 || shapeChoice >= shapeTypes.size()) {
            throw new IllegalArgumentException("Invalid shape type choice");
        }
        return shapeChoice;
    }

    private Shape getExistingShapeChoice() {
        Scanner scanner = new Scanner(System.in);
        Integer choice = scanner.nextInt();

        return shapeRepo.findShapeById(choice);
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


    public ShapeRepository getShapeRepo() {
        return shapeRepo;
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
