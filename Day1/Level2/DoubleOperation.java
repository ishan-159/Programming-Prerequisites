import java.util.Scanner;


class DoubleOperation {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        //Creating input variables a,b,c
		System.out.println("Ënter value of a : ");
        double a = sc.nextDouble();
		System.out.println("Ënter value of b : ");
        double b = sc.nextDouble();
		System.out.println("Ënter value of c : ");
        double c = sc.nextDouble();

        //Creating result1 result2 result3 and result4 to perform operation
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        //Printing the results
        System.out.println("The results of Int Operations are:");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);

        sc.close();
    }
}