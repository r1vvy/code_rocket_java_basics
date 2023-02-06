package lesson9;

import java.math.BigDecimal;
import java.util.List;

public class ShapeDemo {
    public static void main(String[] args) {
        List<Shape> shapeTypes = List.of(new Circle() , new Triangle());
        
        UserInput userInput = new UserInput(shapeTypes);
        
        ShapeCreationService shapeCreationService = new ShapeCreationService();

        List<MenuAction> actions = List.of(
            new ShapeCreationMenuAction(userInput, shapeCreationService),
            new ExitMenuAction()
        );

        UserMenu userMenu = new UserMenu(userInput, actions);
        userMenu.start();
    }
}
