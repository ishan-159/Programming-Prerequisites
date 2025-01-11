import java.util.Scanner;

class SwapNumbers {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Creating variable number1 and taking user input
        System.out.println("Enter the first number:");
        int number1 = sc.nextInt();

        // Creating variable number2 and taking user input
        System.out.println("Enter the second number:");
        int number2 = sc.nextInt();

        // Swapping number1 and number2
        int temp = number1;
        number1 = number2;
        number2 = temp;

        // Printing the swapped result
        System.out.println("The swapped numbers are " + number1 + " and " + number2);

        sc.close();
    }
}
