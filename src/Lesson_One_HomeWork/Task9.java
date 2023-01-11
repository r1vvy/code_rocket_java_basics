package Lesson_One_HomeWork;

import java.util.ArrayList;

public class Task9 {
    public static void main(String[] args) throws Exception
    {
        Task9 task9 = new Task9();
        ArrayList<Integer> digits = integerBreakToDigits(12346);
        for(int i = digits.size() - 1; i >= 0; i--)
        {
            System.out.printf(digits.get(i).toString() + " ");
        }
    }
    public static ArrayList<Integer> integerBreakToDigits(int number)
    {
        ArrayList<Integer> digits = new ArrayList<>();
        int digit = 0;
        while (number > 0)
        {
            //
            digit = number % 10;
            digits.add(digit);
            number = number / 10;
        }
        return digits;
    }
}
