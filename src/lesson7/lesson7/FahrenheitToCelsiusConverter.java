package lesson7;
import java.math.BigDecimal;

public class FahrenheitToCelsiusConverter implements TemperatureConverter {
    @Override
    public boolean isSupported(TemperatureConversionRequest request) {
        return request.getUnitFrom().equalsIgnoreCase("F") && request.getUnitTo().equalsIgnoreCase("C");
    }

    @Override
    public BigDecimal convert(TemperatureConversionRequest request) {
        return request.getTemperature().subtract(TemperatureConversionConstants.FAHRENHEIT_CELSIUS_OFFSET)
                .multiply(TemperatureConversionConstants.FAHRENHEIT_CELSIUS_MULTIPLIER);
    }
}
