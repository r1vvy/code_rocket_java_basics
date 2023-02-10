package lesson9.actions.impl;

import lesson9.services.ShapeService;
import lesson9.actions.MenuAction;

public class RepoTotalAreaMenuAction implements MenuAction {
    private final ShapeService shapeService;

    public RepoTotalAreaMenuAction(ShapeService shapeService) {
        this.shapeService = shapeService;
    }

    @Override
    public String getName() {
        return "Total area";
    }

    @Override
    public void execute() {
        this.shapeService.printTotalArea();
    }
}
