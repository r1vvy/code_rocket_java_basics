package lesson9;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

public abstract class Shape {
    private BigDecimal perimeter;
    private BigDecimal area;
    private HashMap<String, BigDecimal> parametersMap = new HashMap<>();

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
