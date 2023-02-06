package lesson7;
import java.math.BigDecimal;

public interface TemperatureConverter {
    boolean isSupported(TemperatureConversionRequest request);
    BigDecimal convert(TemperatureConversionRequest request);
}
