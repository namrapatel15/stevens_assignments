
// Namra Sanjay Patel
// CWID - 20011070
// 2022F CS 501-WS3
//Calculator that performs the basic functions of a calculator:  add, subtract, multiply, divide, and clear.

import java.util.Scanner; //importing scanner

public class Calculator1 {  //created class named calculator


	public static void main(String[] args)  
	{
		System.out.println("The Calculator Program\n"); 
		
		System.out.print("Enter the first number: ");  //Asking to enter the first number
		Scanner input1 = new Scanner(System.in);
		double num1 = input1.nextDouble();
		
		System.out.print("Enter the second number: ");  //Asking to enter the second number
		Scanner input2 = new Scanner(System.in);
		double num2 = input2.nextDouble();
		
		System.out.println("\nOutput:\n"); 
		
		Calculator one = new Calculator();  //Creating instance & calling default constructor
		
		System.out.println(one.getvalue()); //calling the get value function for displaying member field value
		
		one.setvalue(num1); //calling set value function
		System.out.println(one.getvalue()); //calling the get value function for displaying member field value
	
		one.multiply(3.00); //calling multiply function
		System.out.println(one.getvalue()); //calling the get value function for displaying member field value
	
		one.subtract(num2);  //calling subtraction function
		System.out.println(one.getvalue()); //calling the get value function for displaying member field value
		
		one.divide();  //calling division function
		System.out.println(one.getvalue()); //calling the get value function for displaying member field value
		
		one.clear();  // calling clear function
		System.out.println(one.getvalue()); //calling the get value function for displaying member field value
		
		System.out.println("\nEnd of results.\n"); //to print the last ending line
	}
	
	

}
