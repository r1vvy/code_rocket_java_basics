package lesson7.Tests;

import java.math.BigDecimal;
import java.util.List;

import lesson7.CelsiusToFahrenheitConverter;
import lesson7.CelsiusToKelvinConverter;
import lesson7.FahrenheitToCelsiusConverter;
import lesson7.FahrenheitToKelvinConverter;
import lesson7.KelvinToCelsiusConverter;
import lesson7.KelvinToFahrenheitConverter;
import lesson7.TemperatureConversionRequest;
import lesson7.TemperatureConversionService;

public class TemperatureConversionServiceTest {
    
    TemperatureConversionService service = new TemperatureConversionService(List.of(
        new CelsiusToFahrenheitConverter(),
        new CelsiusToKelvinConverter(),
        new FahrenheitToCelsiusConverter(),
        new FahrenheitToKelvinConverter(),
        new KelvinToFahrenheitConverter(),
        new KelvinToCelsiusConverter()
    ));

    public void shouldReturn212CelsiusToFahrenheit() {
        BigDecimal temperature = new BigDecimal("100");
        TemperatureConversionRequest request = new TemperatureConversionRequest(temperature, "F", "C");
        BigDecimal result = service.convertTemperature(request);
        if(result.equals(new BigDecimal(212))) {
            System.out.println("shouldReturn212CelsiusToFahrenheit: SUCCESS");
        } else {
            System.err.println("shouldReturn212CelsiusToFahrenheit: FAILED, expected: SUCCESS, actual: " + result.toString());
        }
    }
    public void shouldReturn373Point15CelsiusToKelvin() {
        BigDecimal temperature = new BigDecimal("100");
        TemperatureConversionRequest request = new TemperatureConversionRequest(temperature, "C", "K");
        BigDecimal result = service.convertTemperature(request);
        if(result.equals(new BigDecimal(373.15))) {
            System.out.println("shouldReturn373Point15CelsiusToKelvin: SUCCESS");
        } else {
            System.err.println("shouldReturn373Point15CelsiusToKelvin: FAILED, expected: SUCCESS, actual: " + result.toString());
        }
    }

}
