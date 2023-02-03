package lesson7;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class FahrenheitToCelsiusConverter implements TemperatureConverter {
    @Override
    public boolean isSupported(TemperatureConversionRequest request) {
        return request.getUnitFrom().equalsIgnoreCase("F") && request.getUnitTo().equalsIgnoreCase("C");
    }

    @Override
    public BigDecimal convert(TemperatureConversionRequest request) {
        return request.getTemperature().subtract(TemperatureConversionConstants.FAHRENHEIT_CELSIUS_OFFSET)
                .divide(TemperatureConversionConstants.FAHRENHEIT_CELSIUS_MULTIPLIER, 2, RoundingMode.HALF_UP);
    }

    
}
