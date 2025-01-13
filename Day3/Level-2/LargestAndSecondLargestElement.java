import java.util.Scanner;

class LargestAndSecondLargestElement {
public static void main(String args[]) {

//Creating scaner class for taking input from user
Scanner input = new Scanner(System.in);

//Taking input from user
System.out.print("Enter the number :");
int number = input.nextInt();

int maxDigit = 10;
int digits[] = new int[maxDigit];
int index = 0;

//Storing the digits
while (number != 0) {
int temp = number % 10;
digits[index++] = temp;

//If the index count equals maxDigit then update the digits array
if (index == maxDigit) {
int temporaryArray[] = new int[maxDigit];
for (int i = 0; i < maxDigit; i++) {
temporaryArray[i] = digits[i];
}
digits = temporaryArray;
}
number /= 10;
}

//Sort the array
Arrays.sort(digits);

System.out.println("The largest digit is" + digits[digits.length - 1] + " and second largest number is : " + digits[digits.length - 2]);
//Closing the scanner class
input.close();
}
}
