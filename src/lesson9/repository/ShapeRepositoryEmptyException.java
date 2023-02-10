package lesson9.repository;

public class ShapeRepositoryEmptyException extends RuntimeException {
    public ShapeRepositoryEmptyException(String message) {
        super(message);
    }
}