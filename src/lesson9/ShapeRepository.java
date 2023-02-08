package lesson9;

import java.util.*;

// TODO: edit repo like in lesson10 in code rocket java basics
public class ShapeRepository {
    private Integer shapeIdSequence = 1;
    private Map<Integer, Shape> repository = new HashMap<>();

    public Shape save(Shape shape) {
        shape.setId(shapeIdSequence);
        repository.put(shapeIdSequence, shape);

        shapeIdSequence++;

        return shape;
    }

    public Optional<Shape> findShapeById(Integer id) {
        return Optional.ofNullable(repository.get(id));
    }
    public Map<Integer, Shape> getRepository() {
        return repository;
    }

    // TODO: if not found, throw exception
    public void printRepository() {
        this.repository.forEach((key, value) -> System.out.println(key + ". " + value));
    }
}
