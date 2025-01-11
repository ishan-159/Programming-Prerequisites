import java.util.Scanner;

class RoundsCalculator {
    public static void main(String[] args) {
        //Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        //Create variables for the sides of the triangle and take user input
        System.out.println("Enter the length of side 1 in meters:");
        double side1 = input.nextDouble();

        System.out.println("Enter the length of side 2 in meters:");
        double side2 = input.nextDouble();

        System.out.println("Enter the length of side 3 in meters:");
        double side3 = input.nextDouble();

        //Calculate the perimeter of the triangle
        double perimeter = side1 + side2 + side3;

        //Total distance to be run in meters (5 km = 5000 meters)
        double totalDistance = 5000;

        //Calculate the number of rounds required
        double rounds = totalDistance / perimeter;

        // Print the result
        System.out.println("The total number of rounds the athlete will run is " + rounds);

        input.close();
    }
}
