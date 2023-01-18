package lesson3.task27;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number:");
        int number = sc.nextInt();
        sc.close();

        if(isPositive(number)) {
            System.out.println("Number is positive");
        }
        else if(isNegative(number)){
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is a zero");
        }

    }

    public static boolean isPositive(int number) {
        return number > 0;
    }
    public static boolean isNegative(int number) { return  number < 0; }
}
