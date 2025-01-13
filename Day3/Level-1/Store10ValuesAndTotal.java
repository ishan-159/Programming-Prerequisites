import java.util.Scanner;
class Store10ValuesAndTotal{
public static void main(String[] args){

//Creating a scanner class for taking user input
Scanner input = new Scanner(System.in);

//Creating an array
double[] numbers = new double[10];
double total = 0.0;
int index = 0;

//Infinite loop
while(true){
System.out.println("Enter a number : ");
double num = input.nextDouble();

//Check input 
if(num <= 0) {
break;
}
if(index >= 10) {
break;
}
numbers[index] = num;
index++;
}
for(int i=0; i<index; i++){
total += numbers[i];
}
//Display the total
System.out.println("Total : " + total);
//Closing the scanner class
input.close();
}
}