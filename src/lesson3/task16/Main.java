package lesson3.task16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.print("Input number of terms: ");
        Scanner sc = new Scanner(System.in);
        int termsNumber = sc.nextInt();
        sc.close();

        int[] arr = populateArray(termsNumber);

        String str = new String();
        for (int i = 0; i < arr.length; i++) {
            str += String.valueOf(arr[i]);
            System.out.println(str);
        }
    }

    private static int[] populateArray(int termsNumber) {
        int[] numbers = new int[termsNumber];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i + 1;
        }
        return numbers;
    }
}
