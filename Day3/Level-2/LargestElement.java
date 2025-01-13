import java.util.*;
class LargestElement{
public static void main(String args[]) {

//Creating scanner class for taking user input
Scanner input = new Scanner(System.in);
//Taking input from user
System.out.print("Enter the number :");
int number = input.nextInt();
int maxDigit = 10;
int digits[] = new int[maxDigit];
//Integer variable index with the value 0 to reflect the array index.
int index = 0;
//Storing the digits
while (number != 0) {
int temp = number % 10;
digits[index++] = temp;
//If index count equals maxDigit then break out of the loop
if (index == maxDigit) {
break;
}
number /= 10;
}
//Sort the array
Arrays.sort(digits);
System.out.println("The largest digit is " + digits[digits.length - 1] + " and second largest number is : " + digits[digits.length - 2]);
//Closing scanner class
input.close();
}
}
