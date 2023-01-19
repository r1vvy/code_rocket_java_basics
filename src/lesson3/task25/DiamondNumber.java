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
        printReversePyramid(termsNumber);
    }
    private static void printPyramid(int rows) {
        for (int i = 1 ; i <= rows; i++ )
        {
            for (int j = 1 ; j <= rows - i; j++ )
            {
                System.out.print(" ");
            }
            for (int k = i ; k >= 1; k-- )
            {
                System.out.print(k);
            }
            for (int l = 2 ; l <= i; l++)
            {
                System.out.print(l);
            }
            System.out.println();
        }
    }

    private static void printReversePyramid(int rows) {
        for (int i = rows - 1; i > 0; i-- )
        {
            for (int j = 1; j <= rows - i; j++ )
            {
                System.out.print(" ");
            }
            for (int k = i ; k >= 1; k-- )
            {
                System.out.print(k);
            }
            for (int l = 2 ; l <= i; l++)
            {
                System.out.print(l);
            }
            System.out.println();
        }
    }
}
