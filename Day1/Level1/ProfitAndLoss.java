class ProfitAndLoss{
public static void main(String[] args){

//Create a variable for cost price 
double costPrice = 129;

//Create a variable for selling price
double sellingPrice = 191;

// Calculate the profit (Selling Price - Cost Price)
double profit = sellingPrice - costPrice;

// Calculate the profit percentage
double profitPercentage = (profit / costPrice) * 100;

//Printing the result
System.out.println("The Cost Price is INR "+ costPrice + "and Selling Price is INR "+ sellingPrice + "\n" + "The Profit is INR "+ profit + "and the Profit Percentage is "+ profitPercentage );
}
}