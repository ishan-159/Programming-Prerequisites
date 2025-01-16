import java.util.Scanner;

class LowerCase{

public static String lowerCase(String str){
String str2 = "";
for(int i=0; i<str.length(); i++){
if(Character.isUpperCase(str.charAt(i))){
str2 += (char) (str.charAt(i) + 32);
}
else {
str2 += str.charAt(i);
}
}
return str2;
}

public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.println("Enter your name : ");
String str = input.nextLine();

String methodCode = lowerCase(str);

String builtIn = str.toLowerCase();

System.out.println(builtIn.equals(methodCode));

System.out.println("Result from user defined method is : " + methodCode);
System.out.println("Result from builtIn method is : " + builtIn);
}
}