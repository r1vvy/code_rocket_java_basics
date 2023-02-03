package lesson7;
import java.util.List;

public class TemperatureConversionDemo {
    
    public static void main(String[] args) {
        TemperatureConversionService temperatureConversionService = new TemperatureConversionService(List.of(
                new CelsiusToFahrenheitConverter(),
                new CelsiusToKelvinConverter(),
                new KelvinToFahrenheitConverter(),
                new KelvinToCelsiusConverter(),
                new FahrenheitToKelvinConverter(),
                new FahrenheitToCelsiusConverter()
        ));
        UserInput userInput = new UserInput();

        UserMenu userMenu = new UserMenu(userInput, List.of(
                new TemperatureConversionMenuAction(temperatureConversionService, userInput),
                new ExitMenuAction()
        ));

        userMenu.startMenu();
    }
}
