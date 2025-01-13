import java.util.Scanner;

class MaxHandshakes {
    // Method to calculate maximum number of handshakes using combination formula
    public static int calculateHandshakes(int numberOfStudents) {
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input for the number of students
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        // Calculating and displaying the maximum number of handshakes
        int handshakes = calculateHandshakes(numberOfStudents);
        System.out.println("The maximum number of handshakes is: " + handshakes);

        input.close(); // Closing scanner
    }
}
