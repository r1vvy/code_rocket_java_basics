package lesson9.models;

import java.math.BigDecimal;
import java.math.MathContext;
import java.util.Objects;

public class Triangle extends Shape {

    public Triangle() {
        super();
        this.getParametersMap().put("sideA", null);
        this.getParametersMap().put("sideB", null);
        this.getParametersMap().put("sideC", null);
    }

    @Override
    public void calculatePerimeter() {
        BigDecimal sideA = this.getParametersMap().get("sideA");
        BigDecimal sideB = this.getParametersMap().get("sideB");
        BigDecimal sideC = this.getParametersMap().get("sideC");

        this.setPerimeter(sideA.add(sideB).add(sideC));
    }

    @Override
    public void calculateArea() {
        BigDecimal sideA = this.getParametersMap().get("sideA");
        BigDecimal sideB = this.getParametersMap().get("sideB");
        BigDecimal sideC = this.getParametersMap().get("sideC");

        BigDecimal halfPerimeter = (sideA.add(sideB).add(sideC)).divide(BigDecimal.valueOf(2), MathContext.DECIMAL32);

        BigDecimal area = halfPerimeter
                .multiply(halfPerimeter.subtract(sideA))
                .multiply(halfPerimeter.subtract(sideB))
                .multiply(halfPerimeter.subtract(sideC));

        this.setArea(BigDecimal.valueOf(Math.sqrt(area.doubleValue())));
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "area=" + this.getArea() +
                ", perimeter=" + this.getPerimeter() +
                ", sideA=" + this.getParametersMap().get("sideA") +
                ", sideB=" + this.getParametersMap().get("sideB") +
                ", sideC=" + this.getParametersMap().get("sideC") +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Triangle)) return false;
        Triangle triangle = (Triangle) o;
        return Objects.equals(this.getArea(), triangle.getArea()) &&
                Objects.equals(this.getPerimeter(), triangle.getPerimeter());
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getArea(), this.getPerimeter());
    }
   
}
