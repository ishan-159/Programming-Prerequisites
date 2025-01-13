import java.util.*;

class FizzBuzz {
public static void main(String args[]) {

//Creating a scanner class for taking input
Scanner input = new Scanner(System.in);

//Taking input from user
System.out.print("Enter the number :");
int number = input.nextInt();
      
String results[] = new String[number+1];
      
      
for (int i = 1; i <= number; i++) {
if(i%3 == 0 && i%5 ==0 ) results[i] = "FizzBuzz";
else if(i % 3 == 0)  results[i] = "Fizz";  
else if (i % 5 == 0)   results[i] = "Buzz";
else results[i] = Integer.toString(i); 
}
       
// print the result
for (int i = 1; i <= number; i++) {
System.out.println("Position of index " + i + " = " + results[i]);
}
input.close();
}
}