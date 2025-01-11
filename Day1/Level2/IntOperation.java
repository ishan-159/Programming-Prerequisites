import java.util.Scanner;


class IntOperation {
    public static void main(String[] args) {
        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        //Creating input variables a,b,c
		System.out.println("Ënter value of a : ");
        int a = sc.nextInt();
		System.out.println("Ënter value of b : ");
        int b = sc.nextInt();
		System.out.println("Ënter value of c : ");
        int c = sc.nextInt();

        //Creating result1 result2 result3 and result4 to perform operation
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;

        //Printing the results
        System.out.println("The results of Int Operations are:");
        System.out.println("a + b * c = " + result1);
        System.out.println("a * b + c = " + result2);
        System.out.println("c + a / b = " + result3);
        System.out.println("a % b + c = " + result4);

        sc.close();
    }
}
