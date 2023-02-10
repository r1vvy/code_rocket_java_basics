package lesson9;

public class ShapeOperationService {
    private final ShapeService shapeService;

    public ShapeOperationService(ShapeService shapeService) {
        this.shapeService = shapeService;
    }

    public void calculateAreaOfShapeFromUserInput(ShapeOperationRequest shapeOperationRequest) {
        Shape shape = shapeOperationRequest.getShape();
        shape.calculateArea();

        this.shapeService.update(shape);
    }
    public void calculatePerimeterOfShapeFromUserInput(ShapeOperationRequest shapeOperationRequest) {
        Shape shape = shapeOperationRequest.getShape();
        shape.calculatePerimeter();

        this.shapeService.update(shape);
    }

    public void addShapePerimeterFromUserInputToTotalPerimeterInRepo(ShapeOperationRequest shapeOperationRequest) {
        Shape shape = shapeOperationRequest.getShape();

        this.shapeService.addPerimeterToTotalFromRepo(shape);
    }
    public void addShapeAreaFromUserInputToTotalPerimeterInRepo(ShapeOperationRequest shapeOperationRequest) {
        Shape shape = shapeOperationRequest.getShape();

        this.shapeService.addAreaToTotalFromRepo(shape);
    }
}
