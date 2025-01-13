import java.util.*;

class YoungestTallestFriend {
public static void main(String args[]) {

//Creating scanner object for taking user input
Scanner input = new Scanner(System.in);

//Taking input from user
int[] age = new int[3];
double height[] = new double[3];

System.out.println("The three friends in the sequence of Amar, Akbar, Anthony:");
String name[] = {"Amar", "Akbar", "Anthony"};

System.out.print("Enter the age:");
for (int i = 0; i < 3; i++) {
age[i] = input.nextInt();
}

System.out.print("Enter the height:");
for (int i = 0; i < 3; i++) {
height[i] = input.nextDouble();
}

int youngestAge = Integer.MAX_VALUE;
int youngestName = 0;
double tallestHeight = Double.MIN_VALUE;
int tallestName = 0;

// Find the youngest and tallest person
for (int i = 0; i < 3; i++) {
if (youngestAge > age[i]) {
youngestAge = age[i];
youngestName = i;
}
if (tallestHeight < height[i]) {
tallestHeight = height[i];
tallestName = i;
}
}

System.out.println("The youngest of the 3 friends is " + name[youngestName] + " and the tallest of the 3 friends is " + name[tallestName]);
//Closing the scanner class
input.close();
}
}
