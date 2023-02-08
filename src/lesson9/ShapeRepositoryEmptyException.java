package lesson9;

public class ShapeRepositoryEmptyException extends RuntimeException {
    public ShapeRepositoryEmptyException(String message) {
        super(message);
    }
}