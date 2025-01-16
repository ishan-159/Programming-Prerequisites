import java.util.Scanner;

public class CharacterFrequency {

public static String[][] findCharacterFrequencies(String text) {
int[] charFrequency = new int[256]; // Array to store character frequencies

// Calculate frequency of each character
for (int i = 0; i < text.length(); i++) {
charFrequency[text.charAt(i)]++;
}

// Count unique characters
int uniqueCount = 0;
for (int i = 0; i < 256; i++) {
if (charFrequency[i] > 0) {
uniqueCount++;
}
}

// Create a 2D array to store characters and their frequencies
String[][] result = new String[uniqueCount][2];
int index = 0;

// Store characters and their frequencies in the result array
for (int i = 0; i < 256; i++) {
if (charFrequency[i] > 0) {
result[index][0] = String.valueOf((char) i); // Store character as string
result[index][1] = String.valueOf(charFrequency[i]); // Store frequency as string
index++;
}
}

return result;
}

public static void main(String[] args) {
Scanner input = new Scanner(System.in);

// Taking input from the user
System.out.print("Enter a string: ");
String userInput = input.nextLine();

// Calling the method and getting the result
String[][] frequencies = findCharacterFrequencies(userInput);

// Displaying the result
System.out.println("Character Frequencies:");
for (String[] freq : frequencies) {
System.out.println(freq[0] + ": " + freq[1]);
}

input.close(); // Close the scanner object
}
}
