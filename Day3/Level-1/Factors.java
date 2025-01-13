import java.util.Scanner;
class Factors{
public static void main(String[] args){

//Creating a scanner class for taking user input
Scanner input = new Scanner(System.in);

//Taking input for user
System.out.println("Enter the number : ");
int number = input.nextInt();
//Creating an array
int[] maxFactor = new int[number];

int index = 0;
int maxIndex = 10;

for(int i=1; i<number; i++){
if(index == maxIndex){
int[] temp = new int[maxIndex*2];

for(int j=0; j<maxIndex; j++){
temp[j] = maxFactor[j];
}
maxFactor = temp;
}
if(number%i == 0){
maxFactor[index] = i;
index++;
}
} 
System.out.println("Factors of : " + number);
for(int i=0; i<index; i++){
System.out.println(maxFactor[i]);
}
//close the scanner class
input.close();
}
}