package lesson9.services.tests;

import lesson9.exceptions.ShapeNotFoundException;
import lesson9.exceptions.ShapeRepositoryEmptyException;
import lesson9.exceptions.ShapeUpdateException;
import lesson9.models.Circle;
import lesson9.models.Rectangle;
import lesson9.models.Shape;
import lesson9.models.Triangle;
import lesson9.repository.ShapeRepository;
import lesson9.services.ShapeService;

import java.math.BigDecimal;
import java.util.List;

public class ShapeServiceTest {
    public static void main(String[] args) {
        shouldThrowShapeNotFoundExceptionIfNoShapePresentWithId1();
        shouldFindShapeWithId1();

        shouldThrowShapeNotFoundExceptionIfNoShapePresent();
        shouldFindShape();

        shouldUpdateShapeIfShapeExistsInRepo();
        shouldThrowShapeUpdateExceptionIfShapeNotPresent();

        shouldAddToRepoArea6FromTriangle();
        shouldAddToRepoArea12FromRectangle();
        shouldAddToRepoArea28Point27FromCircle();

        shouldAddToRepoPerimeter12FromTriangle();
        shouldAddToRepoPerimeter14FromRectangle();
        shouldAddToRepoPerimeter18Point85FromCircle();

        shouldThrowShapeRepositoryEmptyExceptionIfRepoEmpty();
        shouldPrintRepositoryIfNotEmpty();
    }
    private static void shouldThrowShapeNotFoundExceptionIfNoShapePresentWithId1() {
        ShapeRepository shapeRepository = new ShapeRepository();
        ShapeService shapeService = new ShapeService(shapeRepository);
        try {
            shapeService.getShapeById(1);
            System.err.println("shouldThrowShapeNotFoundException: FAILED, Shape is present!");
        } catch(ShapeNotFoundException e) {
            System.out.println("shouldThrowShapeNotFoundException: SUCCESS");
        }
    }

    private static void shouldFindShapeWithId1() {
        ShapeRepository shapeRepository = new ShapeRepository();
        ShapeService shapeService = new ShapeService(shapeRepository);
        Triangle triangle = new Triangle();
        shapeService.save(triangle);
        try {
            shapeService.getShapeById(1);
            System.out.println("shouldFindShapeWithId1: SUCCESS");
        } catch(ShapeNotFoundException e) {
            System.err.println("shouldFindShapeWithId1: FAILED, ShapeNotFoundException thrown!");
        }
    }

    private static void shouldThrowShapeNotFoundExceptionIfNoShapePresent() {
        ShapeRepository shapeRepository = new ShapeRepository();
        ShapeService shapeService = new ShapeService(shapeRepository);
        Triangle triangle = new Triangle();
        try {
            shapeService.getShape(triangle);
            System.err.println("shouldThrowShapeNotFoundExceptionIfNoShapePresent: FAILED, Shape is present!");
        } catch(ShapeNotFoundException e) {
            System.out.println("shouldThrowShapeNotFoundExceptionIfNoShapePresent: SUCCESS, ShapeNotFoundException thrown!");
        }
    }

    private static void shouldFindShape() {
        ShapeRepository shapeRepository = new ShapeRepository();
        ShapeService shapeService = new ShapeService(shapeRepository);
        Triangle triangle = new Triangle();
        shapeService.save(triangle);
        try {
            shapeService.getShape(triangle);
            System.out.println("shouldFindShape: SUCCESS");
        } catch(ShapeNotFoundException e) {
            System.err.println("shouldFindShape: FAILED, ShapeNotFoundException thrown!");
        }
    }

    private static void shouldUpdateShapeIfShapeExistsInRepo() {
        ShapeRepository shapeRepository = new ShapeRepository();
        ShapeService shapeService = new ShapeService(shapeRepository);

        Triangle triangle= new Triangle();

        // TODO: should be done in model with updateParams
        triangle.getParametersMap().put("sideA", new BigDecimal("3"));
        triangle.getParametersMap().put("sideB", new BigDecimal("4"));
        triangle.getParametersMap().put("sideC", new BigDecimal("5"));

        shapeService.save(triangle);
        triangle.calculateArea();

        try {
            shapeService.update(triangle);
            System.out.println("shouldUpdateShapeIfShapeExistsInRepo: SUCCESS");
        } catch(ShapeUpdateException e) {
            System.err.println("shouldUpdateShapeIfShapeExistsInRepo: FAIL, expected: Shape updated, actual: " + e.getMessage());
        }
    }
    private static void shouldThrowShapeUpdateExceptionIfShapeNotPresent() {
        ShapeRepository shapeRepository = new ShapeRepository();
        ShapeService shapeService = new ShapeService(shapeRepository);

        Triangle triangle= new Triangle();

        // TODO: should be done in model with updateParams
        triangle.getParametersMap().put("sideA", new BigDecimal("3"));
        triangle.getParametersMap().put("sideB", new BigDecimal("4"));
        triangle.getParametersMap().put("sideC", new BigDecimal("5"));

        triangle.calculateArea();

        try {
            shapeService.update(triangle);
            System.err.println("shouldUpdateShapeIfShapeExistsInRepo: FAIL, expected: ShapeUpdateException, actual: Shape in Repository updated!");
        } catch(ShapeUpdateException e) {
            System.out.println("shouldUpdateShapeIfShapeExistsInRepo: SUCCESS");
        }
    }

    public static void shouldAddToRepoArea6FromTriangle() {
        ShapeRepository shapeRepository = new ShapeRepository();
        ShapeService shapeService = new ShapeService(shapeRepository);

        Triangle triangle= new Triangle();

        // TODO: should be done in model with updateParams
        triangle.getParametersMap().put("sideA", new BigDecimal("3"));
        triangle.getParametersMap().put("sideB", new BigDecimal("4"));
        triangle.getParametersMap().put("sideC", new BigDecimal("5"));

        triangle.calculateArea();

        shapeService.addToTotalAreaFromRepo(triangle.getArea());

        if(shapeRepository.getTotalArea().compareTo(new BigDecimal("6")) == 0) {
            System.out.println("shouldAddToRepoArea6FromTriangle: SUCCESS");
        } else {
            System.err.println("shouldAddToRepoArea6FromTriangle: FAIL, expected: 6, actual: " + shapeRepository.getTotalArea());
        }
    }

    public static void shouldAddToRepoArea12FromRectangle() {
        ShapeRepository shapeRepository = new ShapeRepository();
        ShapeService shapeService = new ShapeService(shapeRepository);

        Rectangle rectangle= new Rectangle();

        // TODO: should be done in model with updateParams
        rectangle.getParametersMap().put("sideA", new BigDecimal("3"));
        rectangle.getParametersMap().put("sideB", new BigDecimal("4"));

        rectangle.calculateArea();

        shapeService.addToTotalAreaFromRepo(rectangle.getArea());

        if(shapeRepository.getTotalArea().compareTo(new BigDecimal("12")) == 0) {
            System.out.println("shouldAddToRepoArea12FromRectangle: SUCCESS");
        } else {
            System.err.println("shouldAddToRepoArea12FromRectangle: FAIL, expected: 12, actual: " + shapeRepository.getTotalArea());
        }
    }

    public static void shouldAddToRepoArea28Point27FromCircle() {
        ShapeRepository shapeRepository = new ShapeRepository();
        ShapeService shapeService = new ShapeService(shapeRepository);

        Circle circle= new Circle();

        // TODO: should be done in model with updateParams
        circle.getParametersMap().put("radius", new BigDecimal("3"));

        circle.calculateArea();

        shapeService.addToTotalAreaFromRepo(circle.getArea());

        if(shapeRepository.getTotalArea().compareTo(new BigDecimal("28.27")) == 0) {
            System.out.println("shouldAddToRepoArea28Point27FromCircle: SUCCESS");
        } else {
            System.err.println("shouldAddToRepoArea28Point27FromCircle: FAIL, expected: 28.27, actual: " + shapeRepository.getTotalArea());
        }
    }
    public static void shouldAddToRepoPerimeter18Point85FromCircle() {
        ShapeRepository shapeRepository = new ShapeRepository();
        ShapeService shapeService = new ShapeService(shapeRepository);

        Circle circle= new Circle();

        // TODO: should be done in model with updateParams
        circle.getParametersMap().put("radius", new BigDecimal("3"));

        circle.calculatePerimeter();

        shapeService.addToTotalPerimeterFromRepo(circle.getPerimeter());

        if(shapeRepository.getTotalPerimeter().compareTo(new BigDecimal("18.85")) == 0) {
            System.out.println("shouldAddToRepoPerimeter18Point84FromCircle: SUCCESS");
        } else {
            System.err.println("shouldAddToRepoPerimeter18Point84FromCircle: FAIL, expected: 18.84, actual: " + shapeRepository.getTotalPerimeter());
        }
    }
    public static void shouldAddToRepoPerimeter12FromTriangle() {
        ShapeRepository shapeRepository = new ShapeRepository();
        ShapeService shapeService = new ShapeService(shapeRepository);

        Triangle triangle = new Triangle();

        // TODO: should be done in model with updateParams
        triangle.getParametersMap().put("sideA", new BigDecimal("3"));
        triangle.getParametersMap().put("sideB", new BigDecimal("4"));
        triangle.getParametersMap().put("sideC", new BigDecimal("5"));

        triangle.calculatePerimeter();

        shapeService.addToTotalPerimeterFromRepo(triangle.getPerimeter());

        if(shapeRepository.getTotalPerimeter().compareTo(new BigDecimal("12")) == 0) {
            System.out.println("shouldAddToRepoPerimeter12FromTriangle: SUCCESS");
        } else {
            System.err.println("shouldAddToRepoPerimeter12FromTriangle: FAIL, expected: 12, actual: " + shapeRepository.getTotalPerimeter());
        }
    }
    public static void shouldAddToRepoPerimeter14FromRectangle() {
        ShapeRepository shapeRepository = new ShapeRepository();
        ShapeService shapeService = new ShapeService(shapeRepository);

        Rectangle rectangle= new Rectangle();

        // TODO: should be done in model with updateParams
        rectangle.getParametersMap().put("sideA", new BigDecimal("3"));
        rectangle.getParametersMap().put("sideB", new BigDecimal("4"));

        rectangle.calculatePerimeter();

        shapeService.addToTotalPerimeterFromRepo(rectangle.getPerimeter());

        if(shapeRepository.getTotalPerimeter().compareTo(new BigDecimal("14")) == 0) {
            System.out.println("shouldAddToRepoPerimeter14FromRectangle: SUCCESS");
        } else {
            System.err.println("shouldAddToRepoPerimeter14FromRectangle: FAIL, expected: 14, actual: " + shapeRepository.getTotalPerimeter());
        }
    }

    public static void shouldThrowShapeRepositoryEmptyExceptionIfRepoEmpty() {
        ShapeRepository shapeRepository = new ShapeRepository();
        ShapeService shapeService = new ShapeService(shapeRepository);

        try {
            shapeService.printAllShapesFromRepo();
            System.err.println("shouldThrowShapeRepositoryEmptyExceptionIfRepoEmpty: FAILED, expected: ShapeNotFoundException");
        } catch(ShapeRepositoryEmptyException e) {
            System.out.println("shouldThrowShapeRepositoryEmptyExceptionIfRepoEmpty: SUCCESS");
        }
    }
    public static void shouldPrintRepositoryIfNotEmpty() {
        ShapeRepository shapeRepository = new ShapeRepository();
        ShapeService shapeService = new ShapeService(shapeRepository);

        List<Shape> elementsList = List.of(
                new Triangle(),
                new Circle(),
                new Rectangle()
        );

        elementsList.forEach(shape -> shapeService.save(shape));

        try {
            shapeService.printAllShapesFromRepo();
            System.out.println("shouldPrintRepositoryIfNotEmpty: SUCCESS");
        } catch(ShapeRepositoryEmptyException e) {
            System.err.println("shouldPrintRepositoryIfNotEmpty: FAILED, expected: Stored shapes printed to console");
        }
    }
}
