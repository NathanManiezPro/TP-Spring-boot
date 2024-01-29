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
    public Temperature getTemperatures(double temperature) {
        double celsius = 0;
        double fahrenheit = celsiusEnFahrenheit(celsius);
        double kelvin = celsiusEnKelvin(celsius);
        return new Temperature(celsius, fahrenheit, kelvin);
    }

    public Temperature getTemperatureTest(String unit, double value){
        Temperature temperature = this.getTemperatures(value);
        if (unit.equals("Fahrenheit")){
            temperature().setFahrenheit(value);
        }
        if (unit.equals("Kelvin")){
            temperature().setKelvin(value);
        }
        return getTemperatures();
    }

    private double celsiusEnFahrenheit(double celsius) {
        return celsius *1.8 + 32;
    }

    private double celsiusEnKelvin(double celsius) {
        return celsius + 273.15;
    }
}