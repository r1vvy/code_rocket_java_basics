package lesson3.task28;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        float number = sc.nextFloat();
        sc.close();

        checkNumber(number);
    }
    private static void checkNumber(float numberOne) {
        if(numberOne == 0) {
            System.out.println("Zero");
        }
        else if(numberOne > 0) {
            if(numberOne < 1) {
                System.out.println("Small positive number");
            }
            if(numberOne > 1000000) {
                System.out.println("Large positive number");
            }
            System.out.println("Positive number");
        }
        else {
            System.out.println("Negative number");
        }
    }
}
