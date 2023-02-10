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
        ShapeOperationService shapeOperationService = new ShapeOperationService(shapeService);

        List<MenuAction> actions = List.of(
                new RepoTotalPerimeterMenuAction(shapeService),
            new RepoTotalAreaMenuAction(shapeService),
            new ShapeCreationMenuAction(userInput, shapeCreationService),
            new ShapeChoiceMenuAction(userInput, shapeChoiceService, shapeOperationService),
            new ExitMenuAction()
        );

        UserMenu userMenu = new UserMenu(userInput, actions);
        userMenu.start();
    }
}
