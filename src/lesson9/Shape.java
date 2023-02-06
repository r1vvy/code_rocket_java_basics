package lesson9;

import java.math.BigDecimal;

public abstract class Shape {
    private BigDecimal area;
    private BigDecimal perimeter;

    public Shape() {
    }

    public BigDecimal getArea() {
        return area;
    }
    public BigDecimal getPerimeter() {
        return perimeter;
    }

    public void setArea(BigDecimal area) {
        this.area = area;
    }

    public void setPerimeter(BigDecimal perimeter) {
        this.perimeter = perimeter;
    }
    public boolean isPerimeterNull() {
        return this.perimeter == null;
    }
    public void calculatePerimeter() {
    }
    public void calculateArea() {
    }
}
