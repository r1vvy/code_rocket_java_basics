package lesson9;

import lesson9.actions.MenuAction;
import lesson9.actions.impl.*;
import lesson9.models.Circle;
import lesson9.models.Rectangle;
import lesson9.models.Shape;
import lesson9.models.Triangle;
import lesson9.repository.ShapeRepository;
import lesson9.services.ShapeChoiceService;
import lesson9.services.ShapeCreationService;
import lesson9.services.ShapeOperationService;
import lesson9.services.ShapeService;

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
