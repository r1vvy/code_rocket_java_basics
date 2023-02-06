package lesson9;

public class ShapeParameterValidation {
    
    public static void validate(Shape shape) {
        if (shape.getParametersMap().containsValue(null)) {
            throw new ShapeValidationException("Shape parameters are not set");
        }
    }
}
