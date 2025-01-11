public class FeeCalculation {
public static void main(String[] args) {

//Create a variable for fee
double fee = 125000;
double discountPercent = 10;

//Calculate the discount amount
double discount = (fee * discountPercent) / 100;

//Calculate the final fee after discount
double finalFee = fee - discount;

//Printing the result
System.out.println("Discount Amount: " + discount);
System.out.println("Fee to Pay After Discount: " + finalFee);
}
}
