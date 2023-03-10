package lesson9.services;

import lesson9.exceptions.ShapeNotFoundException;
import lesson9.exceptions.ShapeUpdateException;
import lesson9.models.Shape;
import lesson9.repository.ShapeRepository;
import lesson9.exceptions.ShapeRepositoryEmptyException;

import java.math.BigDecimal;

public class ShapeService {
    private final ShapeRepository shapeRepo;

    public ShapeService(ShapeRepository shapeRepo) {
        this.shapeRepo = shapeRepo;
    }
    public Shape getShapeById(Integer id) {
        return shapeRepo.findShapeById(id).orElseThrow(() -> new ShapeNotFoundException("Shape not found with id = " + id));
    }

    // TODO: test(shouldFindShape) fails!
    public Shape getShape(Shape shape) {
        return shapeRepo.findShape(shape).orElseThrow(() -> new ShapeNotFoundException("Shape not found"));
    }
    public void save(Shape shape) {
        shapeRepo.save(shape);
    }

    public void update(Shape shape) {
        if(shape != null && shapeRepo.doesShapeExist(shape)) {
            this.shapeRepo.update(shape.getId(), shape);
        } else {
            throw new ShapeUpdateException("Failed to update shape");
        }
    }

    public void addToTotalAreaFromRepo(BigDecimal numberToAdd) {
        this.shapeRepo.addToTotalArea(numberToAdd);
    }
    public void addToTotalPerimeterFromRepo(BigDecimal numberToAdd) {
        this.shapeRepo.addToTotalPerimeter(numberToAdd);
    }

    public void printAllShapesFromRepo() {
        if(this.shapeRepo.isRepositoryEmpty()) {
            throw new ShapeRepositoryEmptyException("Shape repository is empty");
        } else {
            this.shapeRepo.printRepository();
        }
    }

    public void printTotalPerimeter() {
        System.out.println("Total perimeter is: " + this.shapeRepo.getTotalPerimeter().toString());
    }
    public void printTotalArea() {
        System.out.println("Total area is: " + shapeRepo.getTotalArea().toString());
    }
}
