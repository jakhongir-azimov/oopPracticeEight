package com.company.convert;

public class BaseConverter implements TemperatureConverter {
    @Override
    public double convertToKelvin(double celsius) {
        return celsius + 273.15;
    }

    @Override
    public double convertToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}
