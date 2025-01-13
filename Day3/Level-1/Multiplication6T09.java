import java.util.Scanner;
class Multiplication6T09{
public static void main(String[] args){

//Creating a scanner class for taking input from user
Scanner input = new Scanner(System.in);

//Taking input from user
System.out.println("Enter a number : ");
int number = input.nextInt();

//Check range from 6 to 9
if(number < 6 || number > 9){
System.out.println("Wrong Input");
return;
}
//Creating an array 
int[] multiplicationResult = new int[10];
for(int i=1; i<=10; i++) {
multiplicationResult[i - 1] = number * i;
System.out.println(number + " * " + i + " = " + multiplicationResult[i - 1]);
}
//closing the scanner class
input.close();
}
}