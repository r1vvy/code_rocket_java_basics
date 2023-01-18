package lesson3.task9;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a year: ");
        int year = sc.nextInt();
        sc.close();

        if(isLeapYear(year)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }

    public static boolean isLeapYear(int year) {
        return ((year % 400 == 0 || year % 4 == 0) && year % 100 != 0);
    }
}
