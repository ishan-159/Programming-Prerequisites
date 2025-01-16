import java.util.Scanner;

public class TrimSpaces {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter a string with spaces: ");
String inputText = input.nextLine();

String trimmed = trimSpaces(inputText);
System.out.println("Custom Trimmed: '" + trimmed + "'");
System.out.println("Built-in Trimmed: '" + inputText.trim() + "'");

input.close(); // Close the scanner object
}

public static String trimSpaces(String str) {
int start = 0, end = str.length() - 1;
while (start <= end && str.charAt(start) == ' ') start++; // Trim leading spaces
while (end >= start && str.charAt(end) == ' ') end--; // Trim trailing spaces
return str.substring(start, end + 1); // Return trimmed substring
}
}
