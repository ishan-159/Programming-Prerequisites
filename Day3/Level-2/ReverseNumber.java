import java.util.Scanner;

class ReverseNumber {
public static void main(String[] args) {

// Create a scanner class
Scanner input = new Scanner(System.in);

//Taking input from user
System.out.print("Enter the Number : ");
int number = input.nextInt();

//Creating an array
int[] digit = new int [10];   
//Take input from user     
int temp;   
int count =0;
int i =0;
while(number!=0){
temp = number % 10;
digit[i] = temp;
number = number / 10;
count++;
i++;
}
//Printing the array in reverse order
System.out.print("Reverse Number is : ");
for(int j = 0; j<=count-1  ;j++) {
System.out.print(digit[j]);
}
//Closing the scanner class       
input.close();
}
}