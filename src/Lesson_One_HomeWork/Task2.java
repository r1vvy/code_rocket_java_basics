/**
 * Task 2: Write a Java program that reads an integer between 0 and 1000 and adds all the digits in the
 * integer.
 * Test Data
 * Input an integer between 0 and 1000: 565
 * Expected Output :
 * The sum of all digits in 565 is 16
 */

package Lesson_One_HomeWork;

public class Task2 {
    public static void main(String[] args) throws Exception{
        Task2 task2 = new Task2();
        System.out.println(task2.sumDigits(565));
    }
    public String readInteger(int number) throws Exception{
        if(0 <= number && number <= 1000)
        {
            return Integer.toString(number);
        }
        else {
            Exception e = new Exception();
            throw new Exception("Input number must be between 0 AND 1000");
        }
    }
    public int sumDigits(int number) throws Exception
    {
        String digits = readInteger(number);
        int sum = 0;
        for(int i = 0; i < digits.length(); i++)
        {
            sum += Character.getNumericValue(digits.charAt(i));
        }
        return sum;
    }
}
