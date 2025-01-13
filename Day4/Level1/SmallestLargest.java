import java.util.Scanner;

class SmallestLargest {
    // Method to find smallest and largest of three numbers
    public static int[] findSmallestAndLargest(int number1, int number2, int number3) {
        int smallest = Math.min(number1, Math.min(number2, number3));
        int largest = Math.max(number1, Math.max(number2, number3));
        return new int[] {smallest, largest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input for three numbers
        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        System.out.print("Enter third number: ");
        int number3 = sc.nextInt();

        // Finding and displaying smallest and largest numbers
        int[] result = findSmallestAndLargest(number1, number2, number3);
        System.out.println("Smallest: " + result[0] + ", Largest: " + result[1]);

        sc.close(); // Closing scanner
    }
}