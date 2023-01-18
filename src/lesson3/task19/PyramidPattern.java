package lesson3.task19;

import java.util.Scanner;

public class PyramidPattern {

    public static void main(String[] args) {
        System.out.print("Input number of terms: ");
        Scanner sc = new Scanner(System.in);
        int termsNumber = sc.nextInt();
        sc.close();

        printPyramid(termsNumber);
    }

    private static void printPyramid(int rows) {
        for (int i = 1; i <= rows; i++) {
            // get whitespace to form a pyramid
            int whiteSpaceLength = rows - i;
            // display the whitespace
            printCopiesOfString(" ", whiteSpaceLength);
            // display numbers as in previous tasks
            printCopiesOfString(i + " ", i);
            System.out.println("");
        }
    }

    private static void printCopiesOfString(String s, int times) {
        for (int j = 0; j < times; j++) {
            System.out.print(s);
        }
    }
}
