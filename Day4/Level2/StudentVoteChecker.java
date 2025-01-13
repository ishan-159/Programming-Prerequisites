import java.util.Scanner;

public StudentVoteChecker {
   
    // Method to check if a student can vote based on age
    public static boolean canStudentVote(int age) {
        if (age < 0) {
            return false;
        }
        return age >= 18;
    }
public class lv2_problem5_UnitConverter {

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        return yards * 3;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        return feet * 0.333333;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        return meters * 39.3701;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        return inches * 0.0254;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCentimeters(double inches) {
        return inches * 2.54;
    }

    public static void main(String[] args) {
        // Test the methods with sample values
        double yards = 5;
        double feet = 15;
        double meters = 10;
        double inches = 20;

        // Convert yards to feet
        System.out.println(yards + " yards is equal to " + convertYardsToFeet(yards) + " feet.");

        // Convert feet to yards
        System.out.println(feet + " feet is equal to " + convertFeetToYards(feet) + " yards.");

        // Convert meters to inches
        System.out.println(meters + " meters is equal to " + convertMetersToInches(meters) + " inches.");

        // Convert inches to meters
        System.out.println(inches + " inches is equal to " + convertInchesToMeters(inches) + " meters.");

        // Convert inches to centimeters
        System.out.println(inches + " inches is equal to " + convertInchesToCentimeters(inches) + " centimeters.");
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Array to store the ages of 10 students
        int[] ages = new int[10];
        
        // Take input for ages of 10 students
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
        }
        
        // Check if each student can vote
        for (int i = 0; i < ages.length; i++) {
            if (canStudentVote(ages[i])) {
                System.out.println("Student " + (i + 1) + " can vote.");
            } else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }
        
        sc.close();
    }
}
