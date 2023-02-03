package lesson7;

import java.math.BigDecimal;

public class KelvinToCelsiusConverter implements TemperatureConverter {
    @Override
    public boolean isSupported(TemperatureConversionRequest request) {
        return request.getUnitFrom().equalsIgnoreCase("K") && request.getUnitTo().equalsIgnoreCase("C");
    }

    @Override
    public BigDecimal convert(TemperatureConversionRequest request) {
        return request.getTemperature().subtract(TemperatureConversionConstants.CELSIUS_KELVIN_OFFSET);
    }
}
