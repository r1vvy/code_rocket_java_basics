/**
 * Task 3: Write a Java program to convert minutes into a number of years and days.
 * Test Data
 * Input the number of minutes: 3456789
 * Expected Output :
 * 3456789 minutes is approximately 6 years and 210 days
 */

package Lesson_One_HomeWork;

public class Task3 {
    public static void main(String[] args) {
        Task3 task3 = new Task3();
        task3.minutesToYearsAndDays(3456789);

    }
    public void minutesToYearsAndDays(int minutes)
    {
        int years = 0, days = 0;
        years = minutes / 525600;
        int remainingMinutes = minutes % 525600;
        days = (remainingMinutes / 1440);

        System.out.printf("%d is approximately %d years and %d days \n", minutes, years, days);
    }
}
