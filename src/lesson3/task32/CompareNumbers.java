package lesson3.task32;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class CompareNumbers {
    public static void main(String[] args) {
        CompareNumbers compareNumbers = new CompareNumbers();

        float numberOne = compareNumbers.userFloatNumberInput();
        float numberTwo = compareNumbers.userFloatNumberInput();

        if(compareNumbers(numberOne, numberTwo)) {
            System.out.println("They are the same");
        } else {
            System.out.println("They are different");
        }
    }
    public float userFloatNumberInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");

        return sc.nextFloat();
    }
    public static boolean compareNumbers(float numberOne, float numberTwo) {
        BigDecimal tempNumberOne = BigDecimal.valueOf(numberOne).setScale(2, RoundingMode.HALF_UP);
        BigDecimal tempNumberTwo = BigDecimal.valueOf(numberTwo).setScale(2, RoundingMode.HALF_UP);

        return tempNumberOne.equals(tempNumberTwo);
    }
}
