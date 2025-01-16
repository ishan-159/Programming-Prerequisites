import java.util.Scanner;
class CompareTwoStrings{
//Creating a method stringEqual to check string a
public static boolean stringEqual(String one , String two){
if(one.length() != two.length()){
return false;
}
for(int i=0; i<one.length(); i++){
if(one.charAt(i) != two.charAt(i)){
return false;
}
}
return true;
}

public static void main(String[] args){
//Creating scanner object for taking user input
Scanner input = new Scanner(System.in);
//Taking user from input for String one
System.out.print("Enter String One : ");
String one = input.nextLine();
//Taking user from input for String two
System.out.print("Enter String Two : ");
String two = input.nextLine();

//Store method code to a variable name methodCode 
boolean methodCode = stringEqual(one , two);
//Compare string one and two using  .equal() method
boolean usingEqual = one.equals(two);

System.out.println("Result using method code : " + methodCode);
System.out.println("Result using equal builtin method : " + usingEqual);

//Comparing methodcode and .equal() method code
if (methodCode == usingEqual) {
System.out.println("Both methods give the same result.");
} else {
System.out.println("The methods give different results.");
}
//closing the scanner object
input.close();
}
}