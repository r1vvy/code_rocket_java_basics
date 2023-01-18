package lesson3.task7;

import java.time.YearMonth;
import java.util.Scanner;

public class DaysInMonth {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Input a month: ");
        int monthNumber = sc.nextInt();

        System.out.println("Input a year: ");
        int yearNumber = sc.nextInt();

        sc.close();

        YearMonth yearMonthObject = YearMonth.of(yearNumber, monthNumber);
        int daysInMonth = yearMonthObject.lengthOfMonth();

        System.out.println(yearMonthObject.getMonth() + " " + yearMonthObject.getYear() + " has " + daysInMonth + " days");
    }
}

