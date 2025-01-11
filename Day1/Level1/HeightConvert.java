import java.util.Scanner;

public class HeightConvert{
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);

        //Creating a variable centimeter that take input from user
        System.out.print("Enter your height in centimeters: ");
        double centimeter = sc.nextDouble();

        //Convert cm to inches
        double inches = centimeter / 2.54;
		
		//Convert inches to feet
        double feet = inches / 12;

        //Printing the result
        System.out.println("Your height in cm is " + centimeter + "while in feet is " + feet + " and inches is " + inches);

        // Close the scanner
        sc.close();
    }
}

