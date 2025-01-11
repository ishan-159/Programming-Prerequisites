import java.util.Scanner;

class SimpleInterestCalculator {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        //Creating a variable principal
        System.out.println("Enter the Principal amount:");
        double principal = input.nextDouble();

        //Creating a variable rate
        System.out.println("Enter the Rate of Interest:");
        double rate = input.nextDouble();

        //Creating a variable time
        System.out.println("Enter the Time period in years:");
        double time = input.nextDouble();

        //Calculate the Simple Interest
        double simpleInterest = (principal * rate * time) / 100;

        //Printing the result
        System.out.println("The Simple Interest is " + simpleInterest +
                           " for Principal " + principal +
                           ", Rate of Interest " + rate +
                           " and Time " + time + " years.");

        input.close();
    }
}
