import java.util.Scanner;
class Convert{
public static void main(String[] args){
Scanner sc = new Scanner(Syatem.in);

double kilometers = sc.nextDouble();

double miles = kilometers*0.621371;

System.out.println("The distance in miles is : " + miles);
}
}