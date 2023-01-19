package lesson3.task30;

import java.util.Scanner;

public class NumberComparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input 1st number: ");
        int numberOne = sc.nextInt();

        System.out.print("Input 2nd number: ");
        int numberTwo = sc.nextInt();

        System.out.print("Input 3rd number: ");
        int numberThree = sc.nextInt();

        sc.close();

        if(areEqual(numberOne, numberTwo, numberThree)) {
            System.out.println("All numbers are equal");
        }
        else if(neitherEqualOrDifferent(numberOne, numberTwo, numberThree)) {
            System.out.println("Neither all are equal or different");
        } else {
            System.out.println("All numbers are different");
        }
    }

    public static boolean areEqual(int numberOne, int numberTwo, int numberThree) {
        return (numberOne == numberTwo && numberOne == numberThree);
    }
    public static boolean neitherEqualOrDifferent(int numberOne, int numberTwo, int numberThree) {
        return (numberOne == numberTwo || numberOne == numberThree || numberTwo == numberThree);
    }
}
