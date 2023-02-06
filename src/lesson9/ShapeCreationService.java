package lesson9;

public class ShapeCreationService {
    
    public Shape createShapeFromUserInput(ShapeCreationRequest request) {
        Shape shape = request.getShape();
        shape.setParametersMap(request.getParameters());
        return shape;
    }
}
