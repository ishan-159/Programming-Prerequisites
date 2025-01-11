import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
       
	   // Create a Scanner object for user input
        Scanner sc = new Scanner(System.in);
        
        // take input from user
        System.out.print("Enter the distance in feet: ");
		//Creating a variable distanceInFeet
        double distanceInFeet = sc.nextDouble();
        
        // Convert feet to yards
        double distanceInYards = distanceInFeet / 3;
        
        // Convert feet to miles
        double distanceInMiles = distanceInYards / 1760;
		
		// Convert feet to centimeter
        double distanceInCentimeter = distanceInFeet * 30.48;
        
		// Convert feet to inches
        double distanceInInches = distanceInFeet * 12;
		
        // Display the results
        System.out.println("Your Height in cm is "+distanceInCentimeter+"  while in feet is "+distanceInFeet+" and inches is "+distanceInInches);
       
        
        
        sc.close();
    }
}

