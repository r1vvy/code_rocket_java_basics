package lesson7;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CelsiusToFahrenheitConverter implements TemperatureConverter{
    @Override
    public boolean isSupported(TemperatureConversionRequest request) {
        return request.getUnitFrom().equalsIgnoreCase("C") && request.getUnitTo().equalsIgnoreCase("F");
    }

    @Override
    public BigDecimal convert(TemperatureConversionRequest request) {
        return request.getTemperature().multiply(TemperatureConversionConstants.FAHRENHEIT_CELSIUS_MULTIPLIER)
                .add(TemperatureConversionConstants.FAHRENHEIT_CELSIUS_OFFSET);
    }
}
