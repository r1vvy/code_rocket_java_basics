package lesson9;

public class ShapeService {
    private final ShapeRepository shapeRepo;

    public ShapeService(ShapeRepository shapeRepo) {
        this.shapeRepo = shapeRepo;
    }
    public Shape getShapeById(Integer id) {
        return shapeRepo.findShapeById(id).orElseThrow(() -> new ShapeNotFoundException("Shape not found with id = " + id));
    }

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
            new ShapeUpdateException("Failed to update shape");
        }
    }

    public void addPerimeterToTotalFromRepo(Shape shape) {
        if(shape != null && shapeRepo.doesShapeExist(shape) && shape.getPerimeter() != null) {
            shapeRepo.getTotalPerimeter().add(shape.getPerimeter());
        } else {
            new ShapeOperationException("Cannot add to total perimeter because the Shape's perimeter has no reference");
        }
    }
    public void addAreaToTotalFromRepo(Shape shape) {
        if(shape != null && shapeRepo.doesShapeExist(shape) && shape.getPerimeter() != null) {
            shapeRepo.getTotalArea().add(shape.getArea());
        } else {
            new ShapeOperationException("Cannot add to total area because the Shape's area has no reference");
        }
    }

    public void printAllShapesFromRepo() {
        if(this.shapeRepo.isRepositoryEmpty()) {
            throw new ShapeRepositoryEmptyException("Shape repository is empty");
        } else {
            this.shapeRepo.printRepository();
        }
    }
}
