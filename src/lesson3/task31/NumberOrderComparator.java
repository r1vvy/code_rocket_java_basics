package lesson3.task31;

import java.util.Scanner;

public class NumberOrderComparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input 1st number: ");
        int numberOne = sc.nextInt();

        System.out.print("Input 2nd number: ");
        int numberTwo = sc.nextInt();

        System.out.print("Input 3rd number: ");
        int numberThree = sc.nextInt();

        sc.close();

        if(areIncreasing(numberOne, numberTwo, numberThree)) {
            System.out.println("increasing");
        }
        else if(!areDecreasing(numberOne, numberTwo, numberThree)) {
            System.out.println("decreasing");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }

    public static boolean areIncreasing(int numberOne, int numberTwo, int numberThree) {
        return (numberOne < numberTwo && numberTwo < numberThree);
    }
    public static boolean areDecreasing(int numberOne, int numberTwo, int numberThree) {
        return (numberOne > numberTwo && numberTwo > numberThree);
    }
}
