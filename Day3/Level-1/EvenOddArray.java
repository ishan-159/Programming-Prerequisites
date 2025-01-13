import java.util.Scanner;
class EvenOddArray {
public static void main(String[] args){

//Creating a scanner class for taking input from user
Scanner input = new Scanner(System.in);

//Taking input from user
System.out.println("Enter the number : ");
int number = input.nextInt();

//Creating an integer array for even numbers
int[] even = new int[number/2+1];

//Creating an integer array for odd numbers
int[] odd = new int[number/2+1];

//Creating index variables for even and odd number
int indexEven = 0;
int indexOdd = 0;

//Using a for loop to iterate from 1 to number
for(int i=1; i<number; i++){
if(i%2 == 0){
even[indexEven] = i;
indexEven++;
}
else{
odd[indexOdd] = i;
indexOdd++;
}
}
//Printitng even number array
for(int i=0; i<indexEven; i++){
System.out.println("Even number array : " + even[i]);
}
//Printing odd number array
for(int i=0; i<indexOdd; i++){
System.out.println("Odd number array : " + odd[i]);
}
//closing the scanner class
input.close();
}
}