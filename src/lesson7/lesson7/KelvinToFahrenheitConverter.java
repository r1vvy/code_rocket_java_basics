package lesson7;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class KelvinToFahrenheitConverter implements TemperatureConverter{
    @Override
    public boolean isSupported(TemperatureConversionRequest request) {
        return request.getUnitFrom().equalsIgnoreCase("K") && request.getUnitTo().equalsIgnoreCase("F");
    }
    
    @Override
    public BigDecimal convert(TemperatureConversionRequest request) {
        return request.getTemperature().subtract(TemperatureConversionConstants.CELSIUS_KELVIN_OFFSET)
                .multiply(TemperatureConversionConstants.FAHRENHEIT_CELSIUS_MULTIPLIER)
                .add(TemperatureConversionConstants.FAHRENHEIT_CELSIUS_OFFSET).setScale(2, RoundingMode.HALF_UP);
    }
}
