package lesson2.task40;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CurrentDateAndTime {
    public static void main(String[] args) {
        System.out.println("Current date and time: " + getCurrentDateAndTime());
    }


    public static String getCurrentDateAndTime() {
        // Get current date and time
        LocalDateTime current = LocalDateTime.now();
        // Format date and time based on the pattern
        return current.format(DateTimeFormatter.ofPattern("EEEE MMMM dd, yyyy HH:mm:ss"));
    }
}
