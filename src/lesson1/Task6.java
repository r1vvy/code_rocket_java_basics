package lesson1;

public class Task6 {
    public static void main(String[] args) {
        Task6 task6 = new Task6();
        task6.calculateSpeed(2500, 5, 56, 23);
    }
    // Perhaps save calculations in an array and use the array in an output function?
    public void calculateSpeed(double meters, double hours, double minutes, double seconds)
    {
        double speedInMetersPerSecond = meters / (hours * 3600 + minutes * 60 + seconds);
        double speedInKilometersPerHour = meters / 1000 / (hours + minutes / 60 + seconds / 3600);
        double speedInMilesPerHour = meters / 1609 / (hours + minutes / 60 + seconds / 3600);
        System.out.printf("Your speed in meters/second is %s \n", speedInMetersPerSecond);
        System.out.printf("Your speed in kilometers/hour is %s \n", speedInKilometersPerHour);
        System.out.printf("Your speed in miles/hour is %s \n", speedInMilesPerHour);
    }
}
