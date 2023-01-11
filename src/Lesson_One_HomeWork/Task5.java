package Lesson_One_HomeWork;

public class Task5 {
    public static void main(String[] args) {
        Task5 task5 = new Task5();
        double d = task5.calculateBodyMassIndex(452, 72);
        System.out.printf("Body Mass Index is %s \n", Double.toString(d));
    }

    public double calculateBodyMassIndex(double weightInPounds, double heightInInches)
    {
        return (703 * (weightInPounds / Math.pow(heightInInches, 2)));
    }
}
