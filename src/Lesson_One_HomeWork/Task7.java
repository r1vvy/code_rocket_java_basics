package Lesson_One_HomeWork;

public class Task7 {
    public static void main(String[] args) {
        Task7 task7 = new Task7();

        System.out.printf
        (
            "Square: %s \n" +
            "Cube: %s \n" +
            "Fourth power: %s \n",
                task7.numberSquarePowOf(3),
                task7.numberCubePowOf(3),
                task7.numberFourthPowOf(3)
        );
    }
    public double numberSquarePowOf(double number)
    {
        return Math.pow(number, 2);
    }
    public double numberCubePowOf(double number)
    {
        return Math.pow(number, 3);
    }
    public double numberFourthPowOf(double number)
    {
        return Math.pow(number, 4);
    }
}
