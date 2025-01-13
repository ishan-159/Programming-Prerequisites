import java.util.Scanner;
class Table{
public static void main(String[] args){
//Creating a Scanner class for user input
Scanner input = new Scanner(System.in);

int[] arr = new int [10];
//Taking input from user
System.out.println("Enter a number : ");
int number = input.nextInt();

for(int i=0; i<arr.length; i++) {

arr[i] = number * (i + 1);

System.out.println(number + " * " + (i + 1) + " = " + arr[i]);
}
//closing the scanner class
input.close();
}
}
