package lesson9.validators;

import lesson9.exceptions.ShapeValidationException;
import lesson9.models.Shape;

public class ShapeParameterValidation {
    
    public static void validate(Shape shape) {
        if (shape.getParametersMap().containsValue(null)) {
            throw new ShapeValidationException("Shape parameters are not set");
        }
    }
}
