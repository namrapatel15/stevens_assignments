

// Namra Sanjay Patel
// CWID - 20011070
// 2022F CS 501-WS3
// Java program that will calculate and display what it would cost to have a meal delivered by your company.

import javax.swing.JOptionPane;

public class Invoice {                 //Class named invoice

	public static void main(String[] args) {
		
	 String name;
	 name = JOptionPane.showInputDialog("Welcome to the Delivery Calculator! \n \nEnter your Name:");
	 //First input Dialog Box
	 //Asking for name as input
	 
	 String str;
	 str = JOptionPane.showInputDialog(null, "Hello " + name + "\n \nEnter the Subtotal amount:$");
	 //Second input dialog box 
	 //Asking for Subtotal Amount 
	 
	 double subtotal; //Creating variable for subtotal
	 subtotal = Double.parseDouble(str); //converting subtotal amount from string to double
	 
	 
	 double tip_15;
	 double tip_20;
	 double tip_25;
	 //Created variables for tip suggestions
	 
	 tip_15 = (subtotal * 15)/100;
	 tip_20 = (subtotal * 20)/100;
	 tip_25 = (subtotal * 25)/100;
	 //Formula for calculating tip amount (suggestions) based on the input of subtotal amount
	 
	 String str1;
	 str1 = JOptionPane.showInputDialog(null, "Suggested Tip Amounts:\n\n15% = " + tip_15 + "\n20% = "+ tip_20 + "\n25% = "+ tip_25 + "\n\nEnter the Tip %:");
	 //Created third input dialog box
	 //Asking for Tip amount
	 
	 double tip_pr;
	 tip_pr = Double.parseDouble(str1);
	 //Converting string percentage from string to double
	
	
	 double tip;
	 double tax;
	 double delivery; 
	 double grand_total;
	 //Created necessary variables
	 
	 tax = (subtotal * 6.5)/100;
	 delivery = (subtotal * 10)/100;
	 tip = (subtotal * tip_pr)/100;
	 grand_total = subtotal + tax + delivery + tip;
	 //Formula for calculating Tax, Tip, Delivery & Grand total
	 
	 JOptionPane.showMessageDialog(null,String.format ("Your Delivery Cost\n\nSubtotal = $ %15.2f" + "\nTax =  %27.2f" + "\nDelivery Fee = %11.2f" +  "\nTip Amount = %13.2f" + "\n-----------------\nTotal Due = $ %12.2f" , subtotal, tax, delivery, tip, grand_total) );
	 //Created message dialog box for showing grand total with addition of tip, subtotal, delivery fee & tax.
	}

}
