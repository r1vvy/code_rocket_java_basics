package lesson3.task14;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Input number of terms: ");
        Scanner sc = new Scanner(System.in);
        int termsNumber = sc.nextInt();

        for (int i = 0; i <= termsNumber; i++) {
            System.out.println(termsNumber + " X " + i + " = " + termsNumber * i);
        }
    }
}
