/**
 * Task 4: Write a Java program that prints the current time in GMT.
 * Test Data
 * Input the time zone offset to GMT: 256
 * Expected Output:
 * Current time is 23:40:24
 */
package Lesson_One_HomeWork;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;

public class Task4 {
    public static void main(String[] args) {
        Task4 task4 = new Task4();
        task4.currentTime(256);
    }
    public void currentTime(int timeZoneOffset)
    {
        /* Can be accomplished with:
        * https://docs.oracle.com/javase/7/docs/api/java/lang/System.html#currentTimeMillis()
        * but tried ZonedDateTime class which is something new for me.
        */
        ZonedDateTime zonedDateTime = ZonedDateTime.now(ZoneOffset.UTC);
        zonedDateTime = zonedDateTime.plusHours(timeZoneOffset % 24);

        // For output readability
        int offsetHours = zonedDateTime.getHour();
        int offsetMinutes = zonedDateTime.getMinute();
        int offsetSeconds = zonedDateTime.getSecond();

        System.out.printf("Current time is %d:%d:%d \n",offsetHours,offsetMinutes,offsetSeconds);
    }
}
