package lesson3.task12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        int sum = 0;
        double avg = 0;

        System.out.println("Input the 5 numbers: ");
        for (int i = 0; i < 5; i++) {
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            sum += number;
            numbers[i] = number;

            if(i == 4)
                sc.close();
        }
        avg = sum / numbers.length;

        System.out.println("The sum of 5 no is: " + sum);
        System.out.println("The Average is: " + avg);
    }
}
