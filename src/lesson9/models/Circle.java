package lesson9.models;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Objects;

public class Circle extends Shape {

    public Circle() {
        super();
        this.getParametersMap().put("radius", null);
    }
    
    @Override
    public void calculatePerimeter() {
        BigDecimal radius = this.getParametersMap().get("radius");
        this.setPerimeter(radius.multiply(BigDecimal.valueOf(2)).multiply(BigDecimal.valueOf(Math.PI)).setScale(2, RoundingMode.HALF_UP));
    }

    @Override
    public void calculateArea() {
        BigDecimal radius = this.getParametersMap().get("radius");
        this.setArea(radius.pow(2).multiply(BigDecimal.valueOf(Math.PI)).setScale(2, RoundingMode.HALF_UP));
    }

    @Override
    public String toString() {
        return "Circle{" +
                "area=" + this.getArea() +
                ", perimeter=" + this.getPerimeter() +
                ", radius=" + this.getParametersMap().get("radius") +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Circle)) return false;
        Circle circle = (Circle) o;
        return Objects.equals(this.getArea(), circle.getArea()) &&
                Objects.equals(this.getPerimeter(), circle.getPerimeter()) &&
                Objects.equals(this.getParametersMap().get("radius"), circle.getParametersMap().get("radius"));
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.getArea(), this.getPerimeter(), this.getParametersMap().get("radius"));
    }
}
