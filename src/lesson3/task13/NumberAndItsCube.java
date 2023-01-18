package lesson3.task13;

import java.util.Scanner;

public class NumberAndItsCube {
    public static void main(String[] args) {
        System.out.print("Input number of terms: ");
        Scanner sc = new Scanner(System.in);
        int termsNumber = sc.nextInt();

        for (int i = 1; i <= termsNumber; i++) {
            System.out.println("Number is: " + i + " and cube of " + i + " is : " + Math.pow(i, 3));
        }
    }
}
