import java.util.Scanner;

public class KmToMilesConverter {
    public static void main(String[] args) {
        //Creating a Scanner object to take input from the user
        Scanner sc = new Scanner(System.in);

        //Creating a variable to store kilometers
        double km =  sc.nextDouble();

        // Convert kilometers to miles using the formula
        double miles = km / 1.6;

        //Printing the result
        System.out.println("The total miles is " + miles + "mile for the given " + km + " km");

        // Close the Scanner object
        sc.close();
    }
}
