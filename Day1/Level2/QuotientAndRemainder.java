import java.util.Scanner;

class QuotientAndRemainder {
    public static void main(String[] args) {
        // Create a Scanner object to take user input
        Scanner sc = new Scanner(System.in);

        //Creating a variable number1
        System.out.print("Enter the first number (dividend): ");
        int number1 = sc.nextInt();

        //Creating a variable number2
        System.out.print("Enter the second number (divisor): ");
        int number2 = sc.nextInt();

        //Calculate the quotient using the division operator (/)
        int quotient = number1 / number2;

        //Calculate the remainder using the modulus operator (%)
        int remainder = number1 % number2;

        //Printing the result
        System.out.println("The Quotient is " + quotient + " and Remainder is " + remainder + 
                           " of two numbers " + number1 + " and " + number2);

        // Close the scanner
        sc.close();
    }
}
