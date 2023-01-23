package lesson3.task17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Input number of terms: ");
        Scanner sc = new Scanner(System.in);
        int termsNumber = sc.nextInt();
        sc.close();

        for (int i = 0; i <= termsNumber; i++) {
            printLineNumbers(i);
            System.out.println();
        }
    }

    private static void printLineNumbers(int i) {
        for (int j = 0; j < i; j++) {
            System.out.print(i);
        }
    }
}
