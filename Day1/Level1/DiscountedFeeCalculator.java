import java.util.Scanner;

public class DiscountFeeCalculator {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Declare variables for fee, discount percent, and discount amount
        double fee, discountPercent, discount;

        // Prompt the user to enter the total fee
        System.out.print("Enter the total fee (INR): ");
        fee = input.nextDouble();

        // Prompt the user to enter the discount percentage
        System.out.print("Enter the university discount percentage: ");
        discountPercent = input.nextDouble();

        // Calculate the discount amount
        discount = (fee * discountPercent) / 100;

        // Calculate the final fee after applying the discount
        double finalFee = fee - discount;

        // Display the discount amount and the final discounted fee
        System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);

        // Close the Scanner object
        input.close();
    }
}
