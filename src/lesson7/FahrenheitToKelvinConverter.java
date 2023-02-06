package lesson7;
import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class FahrenheitToKelvinConverter implements TemperatureConverter{
    @Override
    public boolean isSupported(TemperatureConversionRequest request) {
        return request.getUnitFrom().equalsIgnoreCase("F") && request.getUnitTo().equalsIgnoreCase("K");
    }

    @Override
    public BigDecimal convert(TemperatureConversionRequest request) {
        return request.getTemperature().add(TemperatureConversionConstants.FAHRENHEIT_KELVIN_OFFSET)
                .multiply(TemperatureConversionConstants.FAHRENHEIT_KELVIN_MULTIPLIER).setScale(2, RoundingMode.HALF_UP);
    }
}
