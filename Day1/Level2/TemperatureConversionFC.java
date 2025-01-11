import java.util.Scanner;

class TemperatureConversionFC {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        //Creating a variable fahrenheit
        System.out.println("Enter the temperature in Fahrenheit:");
        double fahrenheit = sc.nextDouble();

        //Convert Fahrenheit into Celsius
        double celsiusResult = (fahrenheit - 32) * 5 / 9;

        //Printing the result
        System.out.println("The " + fahrenheit + " Fahrenheit is " + celsiusResult + " Celsius");

        sc.close();
    }
}
