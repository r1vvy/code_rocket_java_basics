public class UserMenu {
    private final UserInput userInput;
    private final TemperatureConversionRequest temperatureConversionRequest;

    private UserMenu(UserInput userInput, TemperatureConversionRequest temperatureConversionRequest) {
        this.userInput = userInput;
        this.temperatureConversionRequest = userInput.getTemperatureConversionRequest();
    }

    public void startMenu() {
        TemperatureConversionRequest temperatureConversionRequest = userInput.getTemperatureConversionRequest();
        // TODO response and print out result
    }
}
