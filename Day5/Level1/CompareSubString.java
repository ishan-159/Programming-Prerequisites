import java.util.Scanner;
class CompareSubString{
public static String subString(String str, int start, int end){
String str2 = "";
for(int i = start; i<end; i++){
str2 += str.charAt(i);
}
return str2;
}

public static void main(String[] args){
Scanner input = new Scanner(System.in);
System.out.print("Enter String : ");
String str = input.nextLine();

System.out.print("Enter Start Index : ");
int start = input.nextInt();

System.out.print("Enter Ending Index : ");
int end = input.nextInt();

String methodCode = subString(str, start, end);

String usingSubString = str.substring(start, end);

System.out.println("Result using method code : " + methodCode);
System.out.println("Result using substring builtin method : " + usingSubString);

if(methodCode == usingSubString){
System.out.println("Both give the same result.");
}
else{
System.out.println("The methods give different results.");
}
}
}