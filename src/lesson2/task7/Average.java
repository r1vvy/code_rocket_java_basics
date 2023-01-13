package lesson2.task7;

import java.util.Scanner;

public class Average {
    private double numberOne, numberTwo, numberThree;

    public void setNumbers()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st number: ");
        numberOne = sc.nextDouble();
        System.out.print("Enter 2nd number: ");
        numberTwo = sc.nextDouble();
        System.out.print("Enter 3rd number: ");
        numberThree = sc.nextDouble();
        sc.close();
    }
    public double calcAverage()
    {
        return (numberOne + numberTwo + numberThree) / 3;
    }
    public void printAverage()
    {
        System.out.println("Average of numbers: " + calcAverage());
    }
}
