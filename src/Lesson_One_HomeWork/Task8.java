package Lesson_One_HomeWork;

public class Task8 {
    public static void main(String[] args) {
        Task8 task8 = new Task8();
        task8.calculationOutput(25, 5);
    }
    public int sumOfIntegers(int a, int b)
    {
        return a + b;
    }
    public int difOfIntegers(int a, int b)
    {
        return Math.abs(a - b);
    }
    public int productOfIntegers(int a, int b)
    {
        return a * b;
    }
    public double avgOfIntegers(int a, int b)
    {
        return sumOfIntegers(a, b) / 2;
    }
    public int distOfIntegers(int a, int b)
    {
        return Math.abs(a - b);
    }
    public int maxOfIntegers(int a, int b)
    {
        return (a > b) ? a : b;
    }
    public int minOfIntegers(int a, int b)
    {
        return (a < b) ? a : b;
    }

    public void calculationOutput(int a, int b)
    {
        System.out.printf
        (
            "Sum of two integers: %d \n" +
            "Difference of two integers: %d \n" +
            "Product of two integers: %d \n" +
            "Average of two integers: %s \n" +
            "Distance of two integers: %d \n" +
            "Max integer: %d \n" +
            "Min integer: %d \n",
                sumOfIntegers(a, b),
                difOfIntegers(a, b),
                productOfIntegers(a, b),
                avgOfIntegers(a, b),
                distOfIntegers(a, b),
                maxOfIntegers(a, b),
                minOfIntegers(a, b)
        );
    }
}
