import java.util.Scanner;
class PositiveEvenOdd{
    public static void main(String[] args){
		//Creating a Scanner class for taking user input
        Scanner input = new Scanner(System.in);
        int[] arr = new int[5];
		//Taking input from user
        System.out.println("Enter the number : ");
        for(int i=0; i<arr.length; i++){
            arr[i] = input.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] > 0){
                if(arr[i] % 2 == 0) {
                    System.out.println("Number is positive and even : " + arr[i]);
                }
                else if(arr[i] % 2 == 1) {
                    System.out.println("Number is positive and odd : " + arr[i]);
                }
            }
            else if(arr[i] < 0 ) {
                System.out.println("Number is negative : " + arr[i]);
            }
            else if(arr[i] == 0 ) {
                System.out.println("Number is zero : " + arr[i]);
            }
        }
		//close the scanner class
		input.close();
    }
}
