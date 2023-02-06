package lesson7;
import java.math.BigDecimal;
import java.util.Scanner;

public class UserInput {
    
    public TemperatureConversionRequest getTemperatureConversionRequest() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Temperature:");
        BigDecimal temperature = scanner.nextBigDecimal();
        System.out.println("Unit from:");
        String unitFrom = scanner.next();
        System.out.println("Unit to:");
        String unitTo = scanner.next();

        return new TemperatureConversionRequest(temperature, unitFrom, unitTo);
    }
    public Integer getNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number: ");
        Integer number = scanner.nextInt();
        
        return number;
    }
}
