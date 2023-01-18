package lesson3.task24;

import java.util.Scanner;

public class LeftUpTriangle {
    public static void main(String[] args) {
        System.out.print("Input number of terms: ");
        Scanner sc = new Scanner(System.in);
        int termsNumber = sc.nextInt();
        sc.close();

        for (int i = 0; i < termsNumber; i++) {
            for (int j = 1; j < termsNumber - i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print("@");
            }
            System.out.println();
        }
    }
}
