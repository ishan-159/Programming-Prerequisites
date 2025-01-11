class PenDistribution{
public static void main(String[] args){

//Create a variable for totalPens
int totalPens = 14;

//Create a variable for totalStudents
int totalStudents = 3;

//Calculate pens per student
int pensPerStudent = totalPens / totalStudents;

//Calculate remaining pens
int remainingPens = totalPens % totalStudents;

//Printing the result
System.out.println("The Pen Per Student is " + pensPerStudent + " and the remaining pen not distributed is " + remainingPens);
}
}