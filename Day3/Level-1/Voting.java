import java.util.Scanner;

class Voting{
    public static void main(String[] args){
	//Creating a Scanner class for user input
        Scanner input = new Scanner(System.in);
        int[] age = new int[10];
		//Taking input from user
        System.out.println("Enter the age of student : ");
        for(int i=0; i<age.length; i++){
            age[i] = input.nextInt();
			}
			//we use this loop to print age 10 times
            for(int i=0; i<age.length; i++){
            if(age[i] <0){
                System.out.println("Invalid age : " + age[i]);
            }
            else if(age[i] >= 18){
                System.out.println("The students with the age " + age[i] + " can vote.");
            }
            else{
                System.out.println(" The student with the age " + age[i] + " cannot vote.");
            }
            }
			//Closing the scanner class
			input.close();
        }
    }
