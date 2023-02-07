package lesson9;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;

public abstract class Shape {
    private BigDecimal perimeter;
    private BigDecimal area;
    private HashMap<String, BigDecimal> parametersMap = new HashMap<>();

    abstract void calculateArea();
    abstract void calculatePerimeter();

    public Shape() {
    }

    public BigDecimal getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(BigDecimal perimeter) {
        if(perimeter.compareTo(BigDecimal.ZERO) == 1)
            throw new ShapeValidationException("Perimeter cannot be less than ZERO");
        this.perimeter = perimeter;
    }

    public BigDecimal getArea() {
        return area;
    }

    public void setArea(BigDecimal area) {
        if(area.compareTo(BigDecimal.ZERO) == 1)
            throw new ShapeValidationException("Area cannot be less than ZERO");
        this.area = area;
    }

    public HashMap<String, BigDecimal> getParametersMap() {
        return parametersMap;
    }

    public void setParametersMap(HashMap<String, BigDecimal> parametersMap) {
        for (BigDecimal value : parametersMap.values()) {
            if (value.compareTo(BigDecimal.ZERO) <= 0) {
                throw new ShapeValidationException("Shape argument values cannot be less than or equal to ZERO");
            }
        }
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
