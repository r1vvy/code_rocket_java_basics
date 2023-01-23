package lesson3.task31;

import java.util.Scanner;

public class NumberOrderComparator {
    public static void main(String[] args) {
        NumberOrderComparator numberOrderComparator = new NumberOrderComparator();

        int numberOne = numberOrderComparator.userIntNumberInput();
        int numberTwo = numberOrderComparator.userIntNumberInput();
        int numberThree = numberOrderComparator.userIntNumberInput();

        if(areIncreasing(numberOne, numberTwo, numberThree)) {
            System.out.println("increasing");
        }
        else if(areDecreasing(numberOne, numberTwo, numberThree)) {
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }

    public int userIntNumberInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");

        return sc.nextInt();
    }

    public static boolean areIncreasing(int numberOne, int numberTwo, int numberThree) {
        return (numberOne < numberTwo && numberTwo < numberThree);
    }
    public static boolean areDecreasing(int numberOne, int numberTwo, int numberThree) {
        return (numberOne > numberTwo && numberTwo > numberThree);
    }
}
