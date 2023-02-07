package lesson9;

import java.math.BigDecimal;
import java.util.List;

public class ShapeDemo {
    public static void main(String[] args) {
        List<Shape> shapeTypes = List.of(new Circle() , new Triangle(), new Rectangle());
        ShapeStorage shapeStorage = new ShapeStorage();
        UserInput userInput = new UserInput(shapeTypes, shapeStorage);
        
        ShapeCreationService shapeCreationService = new ShapeCreationService();
        ShapeChoiceService shapeChoiceService = new ShapeChoiceService();

        List<MenuAction> actions = List.of(
            new ShapeCreationMenuAction(userInput, shapeCreationService),
            new ShapeChoiceMenuAction(userInput, shapeChoiceService),
            new ExitMenuAction()
        );

        UserMenu userMenu = new UserMenu(userInput, actions);
        userMenu.start();
    }
}
