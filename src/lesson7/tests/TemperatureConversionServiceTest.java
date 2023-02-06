package lesson7.tests;

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
    public static void main(String[] args) {
        TemperatureConversionServiceTest test = new TemperatureConversionServiceTest();
        System.out.println("Celsius to Fahrenheit");
        test.shouldReturn212CelsiusToFahrenheit();
        test.shouldReturnNegative688CelsiusToFahrenheit();
        System.out.println(); 

        System.out.println("Celsius to Kelvin");
        test.shouldReturn373Point15CelsiusToKelvin();
        test.shouldReturnNegative126Point85CelsiusToKelvin();
        System.out.println(); 

        System.out.println("Fahrenheit to Celsius");
        test.shouldReturn37Point78FahrenheitToCelsius();
        test.shouldReturnNegative240FahrenheitToCelsius();
        System.out.println(); 

        System.out.println("Fahrenheit to Kelvin");
        test.shouldReturn33Point15FahrenheitToKelvin();
        test.shouldReturn255Point37FahrenheitToKelvin();
        System.out.println();

        System.out.println("Kelvin to Celsius");
        test.shouldReturn173Point15KelvinToCelsius();
        System.out.println();

        System.out.println("Kelvin to Fahrenheit");
        test.shouldReturnNegative279Point67KelvinToFahrenheit();
        System.out.println();

        System.out.println("Fahrenheit to Fahrenheit");
        test.shouldThrowIllegalArgumentExceptionFahrenheitToFahrenheit();


    }
    
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
        TemperatureConversionRequest request = new TemperatureConversionRequest(temperature, "C", "F");
        BigDecimal result = service.convertTemperature(request);
        if(result.equals(new BigDecimal("212.0"))) {
            System.out.println("shouldReturn212CelsiusToFahrenheit: SUCCESS");
        } else {
            System.err.println("shouldReturn212CelsiusToFahrenheit: FAILED, expected: SUCCESS, actual: " + result.toString());
        }
    }
    public void shouldReturnNegative688CelsiusToFahrenheit() {
        BigDecimal temperature = new BigDecimal("-400");
        TemperatureConversionRequest request = new TemperatureConversionRequest(temperature, "C", "F");
        BigDecimal result = service.convertTemperature(request);
        if(result.equals(new BigDecimal("-688.0"))) {
            System.out.println("shouldReturnNegative688CelsiusToFahrenheit: SUCCESS");
        } else {
            System.err.println("shouldReturnNegative688CelsiusToFahrenheit: FAILED, expected: SUCCESS, actual: " + result.toString());
        }
    }

    public void shouldReturnNegative126Point85CelsiusToKelvin() {
        BigDecimal temperature = new BigDecimal("-400");
        TemperatureConversionRequest request = new TemperatureConversionRequest(temperature, "C", "K");
        BigDecimal result = service.convertTemperature(request);
        if(result.equals(new BigDecimal("-126.85"))) {
            System.out.println("shouldReturnNegative126Point85CelsiusToKelvin: SUCCESS");
        } else {
            System.err.println("shouldReturnNegative126Point85CelsiusToKelvin: FAILED, expected: SUCCESS, actual: " + result.toString());
        }
    }
    public void shouldReturn373Point15CelsiusToKelvin() {
        BigDecimal temperature = new BigDecimal("100");
        TemperatureConversionRequest request = new TemperatureConversionRequest(temperature, "C", "K");
        BigDecimal result = service.convertTemperature(request);
        if(result.equals(new BigDecimal("373.15"))) {
            System.out.println("shouldReturn373Point15CelsiusToKelvin: SUCCESS");
        } else {
            System.err.println("shouldReturn373Point15CelsiusToKelvin: FAILED, expected: SUCCESS, actual: " + result.toString());
        }
    }
    public void shouldReturn33Point15FahrenheitToKelvin() {
        BigDecimal temperature = new BigDecimal("-400");
        TemperatureConversionRequest request = new TemperatureConversionRequest(temperature, "F", "K");
        BigDecimal result = service.convertTemperature(request);
        if(result.equals(new BigDecimal("33.15"))) {
            System.out.println("shouldReturn33Point15FahrenheitToKelvin: SUCCESS");
        } else {
            System.err.println("shouldReturn33Point15FahrenheitToKelvin: FAILED, expected: SUCCESS, actual: " + result.toString());
        }
    }
    public void shouldReturn255Point37FahrenheitToKelvin() {
        BigDecimal temperature = new BigDecimal("-0.004");
        TemperatureConversionRequest request = new TemperatureConversionRequest(temperature, "F", "K");
        BigDecimal result = service.convertTemperature(request);
        if(result.equals(new BigDecimal("255.37"))) {
            System.out.println("shouldReturn255Point37FahrenheitToKelvin: SUCCESS");
        } else {
            System.err.println("shouldReturn255Point37FahrenheitToKelvin: FAILED, expected: SUCCESS, actual: " + result.toString());
        }
    }
    public void shouldReturnNegative240FahrenheitToCelsius() {
        BigDecimal temperature = new BigDecimal("-400");
        TemperatureConversionRequest request = new TemperatureConversionRequest(temperature, "F", "C");
        BigDecimal result = service.convertTemperature(request);
        if(result.equals(new BigDecimal("-240.00"))) {
            System.out.println("shouldReturnNegative240FahrenheitToCelsius: SUCCESS");
        } else {
            System.err.println("shouldReturnNegative240FahrenheitToCelsius: FAILED, expected: SUCCESS, actual: " + result.toString());
        }
    }
    public void shouldReturn37Point78FahrenheitToCelsius() {
        BigDecimal temperature = new BigDecimal("100");
        TemperatureConversionRequest request = new TemperatureConversionRequest(temperature, "F", "C");
        BigDecimal result = service.convertTemperature(request);
        if(result.equals(new BigDecimal("37.78"))) {
            System.out.println("shouldReturn37Point78FahrenheitToCelsius: SUCCESS");
        } else {
            System.err.println("shouldReturn37Point78FahrenheitToCelsius: FAILED, expected: SUCCESS, actual: " + result.toString());
        }
    }

    public void shouldReturn173Point15KelvinToCelsius() {
        BigDecimal temperature = new BigDecimal("100");
        TemperatureConversionRequest request = new TemperatureConversionRequest(temperature, "K", "C");
        BigDecimal result = service.convertTemperature(request);
        if(result.equals(new BigDecimal("-173.15"))) {
            System.out.println("shouldReturn173Point15KelvinToCelsius: SUCCESS");
        } else {
            System.err.println("shouldReturn173Point15KelvinToCelsius: FAILED, expected: SUCCESS, actual: " + result.toString());
        }
    }

    public void shouldReturnNegative279Point67KelvinToFahrenheit() {
        BigDecimal temperature = new BigDecimal("100");
        TemperatureConversionRequest request = new TemperatureConversionRequest(temperature, "K", "F");
        BigDecimal result = service.convertTemperature(request);
        if(result.equals(new BigDecimal("-279.67"))) {
            System.out.println("shouldReturnNegative279Point67KelvinToFahrenheit: SUCCESS");
        } else {
            System.err.println("shouldReturnNegative279Point67KelvinToFahrenheit: FAILED, expected: SUCCESS, actual: " + result.toString());
        }
    }

    public void shouldThrowIllegalArgumentExceptionFahrenheitToFahrenheit() {
        BigDecimal temperature = new BigDecimal("100");
        TemperatureConversionRequest request = new TemperatureConversionRequest(temperature, "F", "F");
        try {
            service.convertTemperature(request);
            System.err.println("shouldThrowIllegalArgumentExceptionFahrenheitToFahrenheit: FAILED, expected: IllegalArgumentException, actual: SUCCESS");
        } catch (IllegalArgumentException e) {
            System.out.println("shouldThrowIllegalArgumentExceptionFahrenheitToFahrenheit: SUCCESS");
        }
    }
}
