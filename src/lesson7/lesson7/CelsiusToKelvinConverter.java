package lesson7;

import java.math.BigDecimal;


public class CelsiusToKelvinConverter implements TemperatureConverter {
    
    @Override
    public boolean isSupported(TemperatureConversionRequest request) {
        return request.getUnitFrom().equalsIgnoreCase("C") && request.getUnitTo().equalsIgnoreCase("K");
    }

    @Override
    public BigDecimal convert(TemperatureConversionRequest request) {
        return request.getTemperature().add(TemperatureConversionConstants.CELSIUS_KELVIN_OFFSET);
    }
}
