import java.util.Scanner;

public class ArrayIndexOutOfBoundsExample {

public static void generateException(String[] names) {
System.out.println("Accessing invalid index...");
System.out.println("Name at index 5: " + names[5]); // This will throw ArrayIndexOutOfBoundsException
}

public static void handleException(String[] names) {
try {
System.out.println("Accessing invalid index...");
System.out.println("Name at index 5: " + names[5]); // This will throw ArrayIndexOutOfBoundsException
} catch (ArrayIndexOutOfBoundsException e) {
System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
} catch (RuntimeException e) {
System.out.println("Caught RuntimeException: " + e.getMessage());
}
}

public static void main(String[] args) {
Scanner input = new Scanner(System.in);

System.out.print("Enter the number of names: ");
int size = input.nextInt();
input.nextLine(); // Consume the newline

String[] names = new String[size];
System.out.println("Enter " + size + " names:");
for (int i = 0; i < size; i++) {
names[i] = input.nextLine();
}

System.out.println("\nCalling method to generate exception...");
generateException(names);

System.out.println("\nCalling method to handle exception...");
handleException(names);

input.close();
}
}
