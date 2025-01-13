import java.util.Scanner;

class TriangleRun {
    // Method to calculate the number of rounds needed to complete 5 km
    public static int calculateRounds(int side1, int side2, int side3, double totalDistance) {
        int perimeter = side1 + side2 + side3; // Calculate perimeter of the triangle
        return (int) Math.ceil(totalDistance * 1000 / perimeter); // Convert km to meters
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input for the three sides of the triangular park
        System.out.print("Enter side 1 (meters): ");
        int side1 = input.nextInt();

        System.out.print("Enter side 2 (meters): ");
        int side2 = input.nextInt();

        System.out.print("Enter side 3 (meters): ");
        int side3 = input.nextInt();

        // Calculate and display the number of rounds required
        int rounds = calculateRounds(side1, side2, side3, 5.0);
        System.out.println("The athlete needs to complete " + rounds + " rounds to cover 5 km.");

        input.close(); // Closing scanner
    }
}
