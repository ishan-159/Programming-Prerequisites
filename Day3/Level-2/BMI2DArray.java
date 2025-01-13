import java.util.Scanner;
class BMI2DArray {
public static void main(String args[]) {

//Creating scanner class for taking user input
Scanner input = new Scanner(System.in);

//Taking input from user for No of persons
System.out.println("Enter no of persons");
int numberPersons = input.nextInt();

//Creating an 2D-array for height, weight and bmi
double[][] personData = new double[numberPersons][3];
//using for loop taking input of height weight and calculate bmi
for (int i = 0; i < numberPersons; i++) {
System.out.println("Enter weight of " + (i + 1) + " person in kg");
personData[i][0] = input.nextDouble();
System.out.println("Enter height of " + (i + 1) + " person in feet");
personData[i][1] = input.nextDouble();
personData[i][2] = personData[i][0] / Math.pow((personData[i][1] * 0.3), 2);
}
//Printing the result
for (int i = 0; i < numberPersons; i++) {
if (personData[i][2] <= 18.5) {
System.out.println("BMI status of person " + (i + 1) + " is Underweight.");
} 
else if (personData[i][2] > 18.5 && personData[i][2] < 24.9) {
System.out.println("BMI status of person " + (i + 1) + " is Normal.");
}
else if (personData[i][2] >= 25 && personData[i][2] < 29.9) {
System.out.println("BMI status of person " + (i + 1) + " is OverWeight.");
}
else {
System.out.println("BMI status of person " + (i + 1) + " is obese.");
}
}
//Closing the scanner class
input.close();
}
}