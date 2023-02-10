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

    public void printRepository() {
        if(this.shapeRepo.isRepositoryEmpty()) {
            throw new ShapeRepositoryEmptyException("Shape repository is empty");
        } else {
            this.shapeRepo.printRepository();
        }
    }
}
