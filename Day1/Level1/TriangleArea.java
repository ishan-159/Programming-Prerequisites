import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
      
	   //Create a Scanner object to take input from user 
        Scanner sc = new Scanner(System.in);
        
        //Creating a variable double base height
        double base, height;
        
        // Take input from user
        System.out.print("Enter the base of the triangle inches: ");
        base = sc.nextDouble();
        
       
        System.out.print("Enter the height of the trianglec in inches): ");
        height = sc.nextDouble();
        
        // Calculate the area in inches
        double areaInInches = (1/2) * base * height;
        
        // Convert area to square centimeters
        double areaInCentimeters = areaInInches * 2.54 * 2.54;


        System.out.println("Your Height in cm is "+height*2.54+"  while in feet is "+height*0.08 +" and inches is "+height);
      
        sc.close();
    }
}