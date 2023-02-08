package lesson9;

import java.math.BigDecimal;

public class ShapeCalculatorImpl implements ShapeCalculator {
    @Override
    public void calculateArea(Shape shape) {
        shape.calculateArea();
    }

    @Override
    public void calculatePerimeter(Shape shape) {
        shape.calculatePerimeter();
    }
}
