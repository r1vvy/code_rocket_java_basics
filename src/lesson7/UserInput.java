import java.math.BigDecimal;
import java.util.Scanner;

public class UserInput {
    public TemperatureConversionRequest getTemperatureConversionRequest() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Temperature:");
        BigDecimal temperature = scanner.nextBigDecimal();
        System.out.println("Unit from:");
        String unitFrom = scanner.nextLine();
        System.out.println("Unit to:");
        String unitTo = scanner.nextLine();
        scanner.close();
        return new TemperatureConversionRequest(temperature, unitFrom, unitTo);
    }
}
