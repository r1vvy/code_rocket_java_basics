package lesson2.task27;

import java.math.BigDecimal;

public class SmallestNumber {
    public static void main(String[] args) {
        BigDecimal numberOne = new BigDecimal("1");
        BigDecimal numberTwo = new BigDecimal("2");
        BigDecimal numberThree = new BigDecimal("3");

        SmallestNumber smallestNumber = new SmallestNumber();
        BigDecimal minNumber = smallestNumber(numberOne, numberTwo, numberThree);
        System.out.println(minNumber.toString());
    }
    public static BigDecimal smallestNumber(BigDecimal numberOne, BigDecimal numberTwo, BigDecimal numberThree) {
        BigDecimal smallestNumber = numberOne.min(numberTwo);
        smallestNumber.min(numberThree);

        return smallestNumber;
    }
}
