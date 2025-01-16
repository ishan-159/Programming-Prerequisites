import java.util.Scanner;

class Characters{

public static char[] charArray(String str){

char[] result = new char[str.length()];

for(int i=0; i<str.length(); i++){
result[i] = str.charAt(i);
}
return result;
}

public static void main(String[] args){

Scanner input = new Scanner(System.in);
System.out.println("Enter characters : ");
String str = input.nextLine();

char[] methodCode = charArray(str);
char[] builtIn = str.toCharArray();

System.out.println("Result from user defined method is : ");
for(int i=0; i<methodCode.length(); i++){
System.out.println(methodCode[i] + ",");
}
System.out.println("Result from built in method is : ");
for(int i=0; i<builtIn.length(); i++){
System.out.println(builtIn[i] + ",");
}
//Closing the scanner object
input.close();
}
}
