package fr.nathan.demos.tp1;
import org.springframework.stereotype.Service;

@Service
public class TemperatureService {

    public Temperature getTemperatures() {
        double celsius = 0;
        double fahrenheit = celsiusEnFahrenheit(celsius);
        double kelvin = celsiusEnKelvin(celsius);
        return new Temperature(celsius, fahrenheit, kelvin);
    }

    private double celsiusEnFahrenheit(double celsius) {
        return celsius *1.8 + 32;
    }

    private double celsiusEnKelvin(double celsius) {
        return celsius + 273.15;
    }
}