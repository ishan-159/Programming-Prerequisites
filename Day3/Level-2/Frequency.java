import java.util.Scanner;

class Frequency{
public static void main(String[] args) {
//Creating a Scanner object for user input
Scanner input = new Scanner(System.in);

//Taking input for the number
System.out.println("Enter a number: ");
int number = input.nextInt();

//Frequency array to count occurrences of each digit
int[] frequency = new int[10];

while (number > 0) {
int digit = number % 10;
number /= 10;
frequency[digit]++;
}

//Display the frequency of each digit
System.out.println("Frequency of each digit: ");
for (int i = 0; i < 10; i++) {
if (frequency[i] > 0) {
System.out.println("Digit " + i + " = " + frequency[i]);
}
}
//Closing the scanner object
input.close();
}
}
