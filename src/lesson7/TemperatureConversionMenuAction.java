package lesson7;
import java.math.BigDecimal;

public class TemperatureConversionMenuAction implements MenuAction {
    private final TemperatureConversionService temperatureConversionService;
    private final UserInput userInput;

    public TemperatureConversionMenuAction(TemperatureConversionService temperatureConversionService, UserInput userInput) {
        this.temperatureConversionService = temperatureConversionService;
        this.userInput = userInput;
    }

    @Override
    public String getName() {
        return "Convert temperature";
    }

    @Override
    public void doAction() {
        TemperatureConversionRequest request = userInput.getTemperatureConversionRequest();
        BigDecimal response = temperatureConversionService.convertTemperature(request);
        System.out.println("Result: " + response);
    }
}