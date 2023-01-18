package lesson3.task6;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class compareNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a number: ");
        float numberOne = sc.nextFloat();

        System.out.print("Input a number: ");
        float numberTwo = sc.nextFloat();
        sc.close();

        if(compareNumbers(numberOne, numberTwo)) {
            System.out.println("They are the same");
        } else {
            System.out.println("They are different");
        }
    }
    public static boolean compareNumbers(float numberOne, float numberTwo) {
        BigDecimal tempNumberOne = BigDecimal.valueOf(numberOne).setScale(3, RoundingMode.HALF_UP);
        BigDecimal tempNumberTwo = BigDecimal.valueOf(numberTwo).setScale(3, RoundingMode.HALF_UP);

        return tempNumberOne.equals(tempNumberTwo);
    }
}
