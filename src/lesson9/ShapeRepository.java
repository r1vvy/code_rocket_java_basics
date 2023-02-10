package lesson9;

import java.math.BigDecimal;
import java.util.*;

// TODO: edit repo like in lesson10 in code rocket java basics
public class ShapeRepository {
    private Integer shapeIdSequence = 1;
    private final Map<Integer, Shape> repository = new HashMap<>();
    private BigDecimal totalArea;
    private BigDecimal totalPerimeter;

    public Shape save(Shape shape) {
        shape.setId(shapeIdSequence);
        repository.put(shapeIdSequence, shape);

        shapeIdSequence++;

        return shape;
    }

    public void update(Integer id, Shape shape) {
        repository.put(id, shape);
    }

    public BigDecimal getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(BigDecimal totalArea) {
        this.totalArea = totalArea;
    }

    public BigDecimal getTotalPerimeter() {
        return totalPerimeter;
    }

    public void setTotalPerimeter(BigDecimal totalPerimeter) {
        this.totalPerimeter = totalPerimeter;
    }

    public Optional<Shape> findShapeById(Integer id) {
        return Optional.ofNullable(repository.get(id));
    }
    public Optional<Shape> findShape(Shape shape) {
        return Optional.ofNullable(repository.get(shape));
    }
    public Map<Integer, Shape> getRepository() {
        return repository;
    }
    public boolean isRepositoryEmpty() {
        return this.repository.isEmpty();
    }
    public boolean doesShapeExist(Shape shape) {
        return repository.containsValue(shape);
    }

    // TODO: if not found, throw exception
    public void printRepository() {
        this.repository.forEach((key, value) -> System.out.println(key + ". " + value));
    }
}
