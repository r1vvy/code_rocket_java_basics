package lesson3.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Test data
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a: ");
        int a = sc.nextInt();

        System.out.print("Input b: ");
        int b = sc.nextInt();

        System.out.print("Input c: ");
        int c = sc.nextInt();
        sc.close();

        QuadraticEquationCalc(a, b, c);
    }

    public static void QuadraticEquationCalc(int a, int b, int c) {
        if(a != 0) {
            double D = b * b - 4 * a * c;
            if(D == 0) {
                double root = (-b + Math.sqrt(D)) / (2 * a);
                System.out.println("The root is" + root);
            }
            else if(D > 0) {
                double rootOne = (-b + Math.sqrt(D)) / (2 * a);
                double rootTwo = (-b - Math.sqrt(D)) / (2 * a);
                System.out.println("The roots are " + rootOne + " and " + rootTwo);
            } else {
                System.out.println("There are no roots that are real numbers.");
            }
        }
    }
}
