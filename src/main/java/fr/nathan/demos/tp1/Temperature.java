package fr.nathan.demos.tp1;

import lombok.Data;

@Data
public class Temperature {
    private double celsius =0;
    private double fahrenheit = 32;
    private double kelvin = 273.15;

    public Temperature(double celsius, double fahrenheit, double kelvin) {
        this.celsius = celsius;
        this.fahrenheit = fahrenheit;
        this.kelvin = kelvin;
    }
}
