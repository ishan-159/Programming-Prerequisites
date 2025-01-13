import java.util.Scanner;
class MeanHeight{
public static void main(String[] args){

//Creating a scanner class for taking user input
Scanner input = new Scanner(System.in);

//Creating an array
double[] height = new double[11];

//Taking input of height from user
System.out.println("Enter heights of player : ");
for(int i=0; i<11; i++){
height[i] = input.nextDouble();
}
double sum = 0.0;

for(int i=0; i<11; i++){
sum += height[i];
}
double divide = sum/11;
System.out.println("The mean height of players present in a football team are : " + divide);

//Closing the scanner class
input.close();
}
}