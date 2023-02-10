package lesson9;

public class RepoTotalAreaMenuAction implements MenuAction{
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
