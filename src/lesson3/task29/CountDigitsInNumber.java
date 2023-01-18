package lesson3.task29;

import java.util.Scanner;

public class CountDigitsInNumber {

    // An integer cant be >= 10 billion
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = sc.nextInt();
        sc.close();

        System.out.println(countDigits(125463));
    }

    public static int countDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += 1;
            number /= 10;
        }
        return sum;
    }
}
