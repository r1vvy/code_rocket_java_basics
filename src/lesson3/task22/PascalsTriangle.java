package lesson3.task22;

import java.util.Scanner;

public class PascalsTriangle {
    public static void main(String[] args) {
        System.out.print("Input number of terms: ");
        Scanner sc = new Scanner(System.in);
        int termsNumber = sc.nextInt();
        sc.close();

        printPascalsTriangle(termsNumber);
    }

    public static void printPascalsTriangle(int rows) {
        /*
            Take a number of rows to be printed, assume it to be n
            Make outer iteration i from 0 to n times to print the rows.
            Make inner iteration for j from 0 to (N – 1).
            Print single blank space ” “
            Close inner loop (j loop) //it’s needed for left spacing
            Make inner iteration for j from 0 to i.
            Print nCr of i and j. NOTE: nCr = n ! / ( n – r ) ! r !
            Close inner loop.
            Print newline character (\n) after each inner iteration.
         */
        int n = rows;
        PascalsTriangle calcFactorial = new PascalsTriangle();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i; j++) {
                // for left spacing
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                int nCr = calcFactorial.factorial(i) / (calcFactorial.factorial(i - j) * calcFactorial.factorial(j));
                System.out.print(" " + nCr);
            }
            System.out.println();
        }
    }

    public int factorial(int i)
    {
        if (i == 0)
            return 1;
        return i * factorial(i - 1);
    }
}
