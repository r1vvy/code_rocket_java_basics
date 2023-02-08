package lesson9;

import java.util.List;

public class ShapeDemo {
    public static void main(String[] args) {
        List<Shape> shapeTypes = List.of(new Circle() , new Triangle(), new Rectangle());
        ShapeRepository shapeRepository = new ShapeRepository();
        UserInput userInput = new UserInput(shapeTypes, shapeRepository);

        ShapeService shapeService = new ShapeService(shapeRepository);

        ShapeCreationService shapeCreationService = new ShapeCreationService(shapeService);
        ShapeChoiceService shapeChoiceService = new ShapeChoiceService(shapeService);

        List<MenuAction> actions = List.of(
            new ShapeCreationMenuAction(userInput, shapeCreationService),
            new ShapeChoiceMenuAction(userInput, shapeChoiceService),
            new ExitMenuAction()
        );

        UserMenu userMenu = new UserMenu(userInput, actions);
        userMenu.start();
    }
}
