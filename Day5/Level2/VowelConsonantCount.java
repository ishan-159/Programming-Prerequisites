import java.util.Scanner;

public class VowelConsonantCount {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Enter a string: ");
String str = input.nextLine();

int[] result = countVowelsConsonants(str);
System.out.println("Vowels: " + result[0]);
System.out.println("Consonants: " + result[1]);

input.close(); // Close the scanner object
}

// Method to count vowels and consonants in a string
public static int[] countVowelsConsonants(String str) {
int vowels = 0, consonants = 0;
for (int i = 0; i < str.length(); i++) {
char ch = str.charAt(i);
if (isVowel(ch)) vowels++;
else if (Character.isLetter(ch)) consonants++;
}
return new int[]{vowels, consonants}; // Return count array
}

// Method to check if a character is a vowel
public static boolean isVowel(char ch) {
ch = Character.toLowerCase(ch); // Convert to lowercase
return "aeiou".indexOf(ch) != -1; // Check for vowels
}
}
