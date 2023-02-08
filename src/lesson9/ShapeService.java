package lesson9;

public class ShapeService {
    private final ShapeRepository shapeRepo;
    private final ShapeCalculatorImpl shapeCalculator = new ShapeCalculatorImpl();

    public ShapeService(ShapeRepository shapeRepo) {
        this.shapeRepo = shapeRepo;
    }
    public Shape getShapeById(Integer id) {
        return shapeRepo.findShapeById(id).orElseThrow(() -> new ShapeNotFoundException("Shape not found with id = " + id));
    }
    public void save(Shape shape) {
        shapeRepo.save(shape);
    }

    public void printRepository() {
        shapeRepo.printRepository();
    }
}
