import java.util.Scanner;

class UpperCase{
public static String upperCase(String str){
String str2 = "";
for(int i=0; i<str.length(); i++){
if(Character.isLowerCase(str.charAt(i))){ //Character.isLowerCase is a property
str2 += (char) (str.charAt(i)-32);
}
else{
str2 += str.charAt(i);
}
}
return str2;
}


public static void main(String[] args){

Scanner input = new Scanner(System.in);

//Taking user input for user input
System.out.println("Enter Your Name : ");
String str = input.nextLine();

String methodCode = upperCase(str);

String builtIn = str.toUpperCase();

System.out.println((builtIn.equals(methodCode)));

System.out.println("Result from user defined method is : " + methodCode);
System.out.println("Result from built in method is : " + builtIn);
}
}