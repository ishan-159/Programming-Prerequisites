import java.util.Scanner;

public class PriceCalculator {
    public static void main(String[] args) {
       
	   // Create a Scanner object
        Scanner sc = new Scanner(System.in);
        
        // Declare variables for unit price and quantity
        double unitPrice, totalPrice;
        int quantity;
        
        //Take input from user
        System.out.print("Enter the unit price of the item : ");
        unitPrice = sc.nextDouble();
        
        System.out.print("Enter the quantity to be bought: ");
        quantity = sc.nextInt();
        
        //Calculate the total price
        totalPrice = unitPrice * quantity;
        
        //Print the result
        System.out.println("The total purchase price is INR " +totalPrice + " if the quantity is " +quantity + " and unit price is INR " +unitPrice);
        
       
        sc.close();
    }
}