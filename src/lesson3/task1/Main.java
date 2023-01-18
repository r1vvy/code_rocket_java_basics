package lesson3.task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number:");
        int number = sc.nextInt();
        sc.close();

        if(isPositive(number)) {
            System.out.println("Number is positive");
        } else {
            System.out.println("Number is negative");
        }

    }

    public static boolean isPositive(int number) {
        return number >= 0 ? true : false;
    }
}
