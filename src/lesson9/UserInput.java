package lesson9;

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
            System.out.println(i + "." + shapeTypes.get(i).getClass().getCanonicalName());
        }
        int shapeChoice = scanner.nextInt();
        if(0 >= shapeChoice && shapeChoice < shapeTypes.size()) {

        }

        return new ShapeCreationRequest("");
    }
}
