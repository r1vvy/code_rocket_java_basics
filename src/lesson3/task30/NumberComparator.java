package lesson3.task30;

import java.util.Scanner;

public class NumberComparator {
    public static void main(String[] args) {
        NumberComparator numberComparator = new NumberComparator();

        int numberOne = numberComparator.userIntNumberInput();
        int numberTwo = numberComparator.userIntNumberInput();
        int numberThree = numberComparator.userIntNumberInput();

        if(areEqual(numberOne, numberTwo, numberThree)) {
            System.out.println("All numbers are equal");
        }
        else if(neitherEqualOrDifferent(numberOne, numberTwo, numberThree)) {
            System.out.println("Neither all are equal or different");
        } else {
            System.out.println("All numbers are different");
        }
    }
    public int userIntNumberInput() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");

        return sc.nextInt();
    }
    public static boolean areEqual(int numberOne, int numberTwo, int numberThree) {
        return (numberOne == numberTwo && numberOne == numberThree);
    }
    public static boolean neitherEqualOrDifferent(int numberOne, int numberTwo, int numberThree) {
        return (numberOne == numberTwo || numberOne == numberThree || numberTwo == numberThree);
    }
}
