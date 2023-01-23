package lesson3.task20;

import java.util.Scanner;

// same as task 17?
public class FloydTriangle {
    public static void main(String[] args) {
        System.out.print("Input number of terms: ");
        Scanner sc = new Scanner(System.in);
        int termsNumber = sc.nextInt();
        sc.close();

        int currNumber = 0;
        for (int i = 0; i <= termsNumber; i++) {
            currNumber = printCurrNumber(currNumber, i);
            System.out.println();
        }
    }

    private static int printCurrNumber(int currNumber, int i) {
        for (int j = 0; j < i; j++) {
            currNumber += 1;
            System.out.print(currNumber + " ");
        }
        return currNumber;
    }
}
