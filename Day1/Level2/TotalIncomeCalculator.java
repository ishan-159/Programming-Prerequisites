import java.util.Scanner;

class TotalIncomeCalculator {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Creating a variable salary
        System.out.println("Enter your salary:");
        double salary = sc.nextDouble();

        // Creating a variable bonus
        System.out.println("Enter your bonus:");
        double bonus = sc.nextDouble();

        // Calculate total income
        double totalIncome = salary + bonus;

        // Printing the result
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + 
                           ". Hence, Total Income is INR " + totalIncome);

        sc.close();
    }
}
