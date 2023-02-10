package lesson9.exceptions;

public class ShapeValidationException extends RuntimeException {
    public ShapeValidationException(String message) {
        super(message);
    }
}
