package lesson9.exceptions;

public class ShapeNotFoundException extends RuntimeException {
    public ShapeNotFoundException(String message) {
        super(message);
    }
}
