
public class NumberChecker6 {

    // Method to find factors of a number and return them as an array
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to find the greatest factor of a number using the factors array
    public static int greatestFactor(int number) {
        int[] factors = findFactors(number);
        return factors[factors.length - 1];
    }

    // Method to find the sum of the factors using the factors array
    public static int sumOfFactors(int number) {
        int[] factors = findFactors(number);
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of the factors using the factors array
    public static int productOfFactors(int number) {
        int[] factors = findFactors(number);
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of cubes of the factors using the factors array
    public static double productOfCubesOfFactors(int number) {
        int[] factors = findFactors(number);
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        int sum = sumOfFactors(number) - number; // excluding the number itself
        return sum == number;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        int sum = sumOfFactors(number) - number; // excluding the number itself
        return sum > number;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        int sum = sumOfFactors(number) - number; // excluding the number itself
        return sum < number;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int temp = number;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += factorial(digit);
            temp /= 10;
        }
        return sum == number;
    }

    // Helper method to calculate factorial of a number
    private static int factorial(int num) {
        int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }

    // Main method to test all the methods
    public static void main(String[] args) {
        int number = 6; // Example number for testing

        // Find and display factors of the number
        int[] factors = findFactors(number);
        System.out.println("Factors of " + number + ":");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();

        // Display the greatest factor of the number
        System.out.println("Greatest factor of " + number + ": " + greatestFactor(number));

        // Display the sum of factors
        System.out.println("Sum of factors of " + number + ": " + sumOfFactors(number));

        // Display the product of factors
        System.out.println("Product of factors of " + number + ": " + productOfFactors(number));

        // Display the product of cubes of factors
        System.out.println("Product of cubes of factors of " + number + ": " + productOfCubesOfFactors(number));

        // Check and display if the number is a perfect number
        System.out.println(number + " is perfect number: " + isPerfectNumber(number));

        // Check and display if the number is an abundant number
        System.out.println(number + " is abundant number: " + isAbundantNumber(number));

        // Check and display if the number is a deficient number
        System.out.println(number + " is deficient number: " + isDeficientNumber(number));

        // Check and display if the number is a strong number
        System.out.println(number + " is strong number: " + isStrongNumber(number));
    }
}

