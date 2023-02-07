package lesson9;

public class ShapeChoiceService {

    public Shape chooseShapeFromUserInput(ShapeChoiceRequest request) {
        return request.getShape();
    }
}
