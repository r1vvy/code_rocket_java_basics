package lesson9;

import java.math.BigDecimal;
import java.util.HashMap;

public class ShapeCreationRequest {
    private Shape shape;
    HashMap<String, BigDecimal> parameters;
    
    public ShapeCreationRequest(Shape shape, HashMap<String, BigDecimal> parameters) {
        this.shape = shape;
        this.parameters = parameters;
    }

    public Shape getShape() {
        return shape;
    }

    public HashMap<String, BigDecimal> getParameters() {
        return parameters;
    }

    public void setShape(Shape shape) {
        this.shape = shape;
    }

    public void setParameters(HashMap<String, BigDecimal> parameters) {
        this.parameters = parameters;
    }
}
