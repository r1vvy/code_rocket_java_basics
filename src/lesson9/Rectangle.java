package lesson9;

import java.math.BigDecimal;

public class Rectangle extends Shape {
    public Rectangle() {
        super();
        this.getParametersMap().put("sideA", null);
        this.getParametersMap().put("sideB", null);
    }

    @Override
    public void calculatePerimeter() {
        BigDecimal sideA = this.getParametersMap().get("sideA");
        BigDecimal sideB = this.getParametersMap().get("sideB");

        this.setPerimeter(sideA.add(sideB).multiply(new BigDecimal("2")));
    }

    @Override
    public void calculateArea() {
        BigDecimal sideA = this.getParametersMap().get("sideA");
        BigDecimal sideB = this.getParametersMap().get("sideB");

        this.setArea(sideA.multiply(sideB));
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "area=" + this.getArea() +
                ", perimeter=" + this.getPerimeter() +
                ", sideA=" + this.getParametersMap().get("sideA") +
                ", sideB=" + this.getParametersMap().get("sideB") +
                '}';
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
