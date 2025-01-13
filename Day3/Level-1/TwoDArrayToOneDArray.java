import java.util.Scanner;
class TwoDArrayToOneDArray{
public static void main(String[] args){
//Creating a scanner class for taking user input
Scanner input = new Scanner(System.in);

//Taking input for rows
System.out.println("Number of rows : ");
int rows = input.nextInt();
//Taking input for columns
System.out.println("Number of columns : ");
int columns = input.nextInt();

//Creating a 2D array
int[][] matrix = new int [rows][columns];

System.out.println("Enter the element of matrix : ");
for(int i=0; i<rows; i++){
for(int j=0; j<columns; j++){
System.out.println("Number " + i + " " + j + " : ");
matrix[i][j] = input.nextInt();
}
}
//Creating a 1D array
int[] array = new int [rows*columns];
int index =0;

for(int i=0; i<rows; i++){
for(int j=0; j<columns; j++){
array[index++] = matrix[i][j];
}
}
System.out.println("Numbers in 1D array are : ");
for(int i=0; i<array.length; i++){
System.out.print(array[i]+" , ");
}
//Closing the scanner class
input.close();
}
}
