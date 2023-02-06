package lesson7;
import java.math.BigDecimal;
import java.util.List;

public class TemperatureConversionService {
    
    private final List<TemperatureConverter> converters;

    public TemperatureConversionService(List<TemperatureConverter> converters) {
        this.converters = converters;
    }

    public BigDecimal convertTemperature(TemperatureConversionRequest temperatureConversionRequest) {
        for (TemperatureConverter converter : converters) {
            if (converter.isSupported(temperatureConversionRequest)) {
                return converter.convert(temperatureConversionRequest);
            }
        }
        throw new IllegalArgumentException("No converter found for request: " + temperatureConversionRequest);
    }
}