import java.util.Scanner;

class WeightConverter {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        //Creating a variable of weightInPounds
        System.out.println("Enter the weight in pounds:");
        double weightInPounds = input.nextDouble();

        //Convert pounds to kilograms
        double weightInKilograms = weightInPounds / 2.2;

        //Printing the result
        System.out.println("The weight of the person in pounds is " + weightInPounds +
                " and in kilograms is " + weightInKilograms);
        input.close();
    }
}
