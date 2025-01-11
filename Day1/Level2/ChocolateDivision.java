import java.util.Scanner;

class ChocolateDivision {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);

        //Creating a variable of numberofchocolates
        System.out.println("Enter the total number of chocolates:");
        int numberOfChocolates = input.nextInt();

        //Creating a variable of numberofchocolates
        System.out.println("Enter the number of children:");
        int numberOfChildren = input.nextInt();

        // Calculate how many chocolates each child gets
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;

        // Calculate the remaining chocolates
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        // Display the results
        System.out.println("The number of chocolates each child gets is " + chocolatesPerChild +
                           " and the number of remaining chocolates are " + remainingChocolates);

        input.close();
    }
}
