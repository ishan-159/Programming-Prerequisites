import java.util.Scanner;

class TemperatureConversion {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        //Creating a variable celsius
		System.out.println("Enter the temperature in celsius : ");
        double celsius = sc.nextDouble();

        //Convert Celsius to Fahrenheit
        double fahrenheitResult = (celsius * 9 / 5) + 32;

        //Printing the result
        System.out.println("The " + celsius + " Celsius is " + fahrenheitResult + " Fahrenheit");

        sc.close();
    }
}


