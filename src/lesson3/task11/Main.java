package lesson3.task11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input the number: ");
        int number = sc.nextInt();
        sc.close();

        int sum = getNaturalNumberSum(number);
        System.out.println("The Sum of Natural Number upto n terms: " + sum);
    }

    private static int getNaturalNumberSum(int maxNumber) {
        int sum = 0;
        System.out.println("The first n natural numbers are:");
        for (int i = 1; i <= maxNumber; i++) {
            System.out.println(i);
            sum += i;
        }
        return sum;
    }
}
