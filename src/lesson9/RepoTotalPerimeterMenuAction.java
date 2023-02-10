package lesson9;

public class RepoTotalPerimeterMenuAction implements MenuAction{
    private final ShapeService shapeService;
    public RepoTotalPerimeterMenuAction(ShapeService shapeService) {
        this.shapeService = shapeService;
    }

    @Override
    public String getName() {
        return "Total perimeter";
    }

    @Override
    public void execute() {
        this.shapeService.printTotalPerimeter();
    }
}
