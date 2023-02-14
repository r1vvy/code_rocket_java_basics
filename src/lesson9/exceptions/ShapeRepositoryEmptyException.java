package lesson9.exceptions;

public class ShapeRepositoryEmptyException extends RuntimeException {
    public ShapeRepositoryEmptyException(String message) {
        super(message);
    }
}