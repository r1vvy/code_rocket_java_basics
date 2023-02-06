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

    public ShapeCreationRequest getShapeCreationRequestFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please choose shape: ");
        for (int i = 0; i < shapeTypes.size(); i++) {
            System.out.println(i + "." + shapeTypes.get(i).getClass().getSimpleName());
        }
        int shapeChoice = scanner.nextInt();
        if(0 >= shapeChoice && shapeChoice < shapeTypes.size()) {

        }
        Triangle test = new Triangle(List.of(
                new BigDecimal("2"),
                new BigDecimal("3"),
                new BigDecimal("4")
        ));
        return new ShapeCreationRequest(test);
    }
}
