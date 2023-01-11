/**
 * Task 1: Write a Java program that reads a number in inches, converts it to meters.
 * Note: One inch is 0.0254 meter.
 * Test Data
 * Input a value for inch: 1000
 * Expected Output :
 * 1000.0 inch is 25.4 meters
 */
package Lesson_One_HomeWork;

public class Task1 {
    public static void main(String[] args) {
        Task1 task1 = new Task1();
        System.out.println(task1.inchesToMeters(1000));
    }
    public double inchesToMeters(double number) {
        return number * 0.0254;
    }
}
