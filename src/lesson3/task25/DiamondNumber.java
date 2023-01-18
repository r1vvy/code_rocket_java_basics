package lesson3.task25;

import java.util.Scanner;
// todo
public class DiamondNumber {
    public static void main(String[] args) {
        System.out.print("Input number of terms: ");
        Scanner sc = new Scanner(System.in);
        int termsNumber = sc.nextInt();
        sc.close();

        printPyramid(termsNumber);
    }
    private static void printPyramid(int rows) {
        int num = 1;
        for (int i = 1; i <= rows; i++) {
            for (int j = 0; j < rows - i; j++) {
                System.out.print(" ");
            }
            // printing number
            for (int j = 0; j < i - 1; j++) {
                System.out.print(" " + num++);
            }
            System.out.println("");
        }
        printReversePyramid(rows, num);
    }
    private static void printReversePyramid(int rows, int num) {
        int tempNum = num;
        for (int i = 1; i <= rows - 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int k = (rows - i) * 2 - 1; k > 0; k--) {
                System.out.print(" " + num--);
            }
            System.out.println();
        }
    }
}
