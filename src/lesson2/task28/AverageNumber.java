package lesson2.task28;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class AverageNumber {
    public static void main(String[] args) {
        BigDecimal numOne = new BigDecimal("10.5");
        BigDecimal numTwo = new BigDecimal("20.5");
        BigDecimal numThree = new BigDecimal("30.5");

        BigDecimal sum = numOne.add(numTwo).add(numThree);
        BigDecimal average = sum.divide(new BigDecimal(3), RoundingMode.HALF_UP);

        System.out.println(average);
    }

}
