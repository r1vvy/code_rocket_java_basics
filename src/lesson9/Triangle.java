package lesson9;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.List;
import java.util.Objects;

public class Triangle extends Shape {
    private final List<BigDecimal> sides;
    public Triangle(List<BigDecimal> sides) {
        super();
        this.sides = sides;
    }

    public List<BigDecimal> getSides() {
        return sides;
    }

    @Override
    public void calculatePerimeter() {
        BigDecimal tempPerimeter = new BigDecimal("0");
        this.sides.forEach(side -> tempPerimeter.add(side));

        this.setPerimeter(tempPerimeter);
    }

    @Override
    public void calculateArea() {
        BigDecimal tempArea = new BigDecimal("1");
        BigDecimal tempHalfPerimeter;
        // Area = square root of (p*(p-a)*(p-b)*(p-c))
        if(isPerimeterNull()) {
            tempHalfPerimeter = createHalfPerimeterFromSides();
        } else {
            tempHalfPerimeter = this.getPerimeter().divide(new BigDecimal("2"));
        }
        this.sides.forEach(side -> tempArea.multiply(tempHalfPerimeter.subtract(side)));
        tempArea.multiply(tempHalfPerimeter);
        tempArea.sqrt(new MathContext(3));

        this.setArea(tempArea);
    }

    private BigDecimal createHalfPerimeterFromSides() {
        if(!this.sides.isEmpty()) {
            BigDecimal tempHalfPerimeter = new BigDecimal("0");
            this.sides.forEach(side -> tempHalfPerimeter.add(side));
            tempHalfPerimeter.divide(new BigDecimal("2"));

            return tempHalfPerimeter;
        } else {
            // TODO: throw exception()
            return null;
        }
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "sides=" + sides +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return Objects.equals(sides, triangle.sides);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sides);
    }
}
