import java.util.Scanner;
class BasicCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
		//Creating a variable number1
        double number1 = sc.nextDouble();

        System.out.print("Enter the second number: ");
		//Creating a variable number2
        double number2 = sc.nextDouble();

        //Perform arithmetic operations
        double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
        double division = 0;

        //Check to prevent division by zero
        if (number2 != 0) {
            division = number1 / number2;
        } else {
            System.out.println("Division by zero is not allowed.");
        }

        //Printing the results
        System.out.println("The addition, subtraction, multiplication, and division values of the numbers "
                + number1 + " and " + number2 + " are:");
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);
        if (number2 != 0) {
            System.out.println("Division: " + division);
        }

        // Close the scanner
        sc.close();
    }
}
