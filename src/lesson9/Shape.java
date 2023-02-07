package lesson9;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

public abstract class Shape {
    protected BigDecimal perimeter;
    protected BigDecimal area;
    protected HashMap<String, BigDecimal> parametersMap = new HashMap<>();

    abstract void calculateArea();
    abstract void calculatePerimeter();

    public Shape() {
    }

    public BigDecimal getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(BigDecimal perimeter) {
        this.perimeter = perimeter;
    }

    public BigDecimal getArea() {
        return area;
    }

    public void setArea(BigDecimal area) {
        this.area = area;
    }

    public boolean isPerimeterNull() {
        return this.perimeter == null;
    }

    public HashMap<String, BigDecimal> getParametersMap() {
        return parametersMap;
    }

    public void setParametersMap(HashMap<String, BigDecimal> parametersMap) {
        this.parametersMap = parametersMap;
    }


    @Override
    public String toString() {
        return "Shape{" +
                "area=" + area +
                ", perimeter=" + perimeter +
                '}';
    }

}
