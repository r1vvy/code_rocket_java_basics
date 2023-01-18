package lesson3.task23;

import java.util.Scanner;

public class RightDownTriangle {
    public static void main(String[] args) {
        System.out.print("Input number of terms: ");
        Scanner sc = new Scanner(System.in);
        int termsNumber = sc.nextInt();
        sc.close();

        for (int i = 0; i < termsNumber; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = termsNumber; j > i; j--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
