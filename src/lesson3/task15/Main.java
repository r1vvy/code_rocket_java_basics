package lesson3.task15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Input number of terms: ");
        Scanner sc = new Scanner(System.in);
        int termsNumber = sc.nextInt();

        System.out.println("The odd numbers are: ");
        int[] oddNumbers = getOdds(termsNumber);
        int sum = 0;

        for (int oddNumber : oddNumbers) {
            System.out.println(oddNumber);
            sum += oddNumber;
        }


        System.out.println("The Sum of odd Natural Number upto " + termsNumber + " terms is: " + sum);
    }
    private static int[] getOdds(int termsNumber) {
        int[] oddNumbers = new int[termsNumber];
        oddNumbers[0] = 1;

        for (int i = 1; i < termsNumber; i++) {
            oddNumbers[i] = oddNumbers[i - 1] + 2;
        }
        return oddNumbers;
    }
}
