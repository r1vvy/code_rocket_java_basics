package lesson7;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class TemperatureConversionConstants {
    public static final BigDecimal CELSIUS_KELVIN_OFFSET = new BigDecimal("273.15");
    public static final BigDecimal FAHRENHEIT_KELVIN_OFFSET = new BigDecimal("459.67");
    public static final BigDecimal FAHRENHEIT_KELVIN_MULTIPLIER = new BigDecimal("0.5555555555555556");
    public static final BigDecimal FAHRENHEIT_CELSIUS_OFFSET = new BigDecimal("32");
    public static final BigDecimal FAHRENHEIT_CELSIUS_MULTIPLIER = new BigDecimal("1.8");
}
