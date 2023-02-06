package lesson9;

import java.math.BigDecimal;
import java.util.List;

public class ShapeDemo {
    public static void main(String[] args) {
        List<Shape> shapes = List.of(
                new Triangle(List.of
                        (
                                new BigDecimal("3"),
                                new BigDecimal("4"),
                                new BigDecimal("5")
                        )
                )
        );
        shapes.forEach(shape -> System.out.println(shape.getClass().getSimpleName()));
    }
}
