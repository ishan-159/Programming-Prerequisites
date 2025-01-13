
public class UnitConverter6 {
    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    // Method to convert Pounds to Kilograms
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;
    }

    // Method to convert Kilograms to Pounds
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    // Method to convert Gallons to Liters
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    // Method to convert Liters to Gallons
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
        // Sample input values for testing the methods
        double fahrenheit = 98.6, celsius = 37, pounds = 150, kilograms = 68, gallons = 5, liters = 18.927;

        // Display conversion results
        System.out.println(fahrenheit + " Fahrenheit is " + convertFahrenheitToCelsius(fahrenheit) + " Celsius.");
        System.out.println(celsius + " Celsius is " + convertCelsiusToFahrenheit(celsius) + " Fahrenheit.");
        System.out.println(pounds + " pounds is " + convertPoundsToKilograms(pounds) + " kilograms.");
        System.out.println(kilograms + " kilograms is " + convertKilogramsToPounds(kilograms) + " pounds.");
        System.out.println(gallons + " gallons is " + convertGallonsToLiters(gallons) + " liters.");
        System.out.println(liters + " liters is " + convertLitersToGallons(liters) + " gallons.");
    }
}

