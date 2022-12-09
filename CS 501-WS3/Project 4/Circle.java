//Namra Sanjay Patel

//CWID - 20011070

//2022F CS 501-WS3

//Calculator of the area of different shapes 

import java.util.Scanner;

public class Circle {
	
	private Double rad;
	static double Pie = 3.14159;
	
	//Default constructor 
	public Circle() {
		this.rad = 0.0;
	}
	
	//Constructor Overloading
	public Circle(Double radius) {
		this.rad = radius;
	}

	//getter method
	public Double getRadius() {
		return rad;
	}
	
	//Setter method
	public void setRadius(Double radius) {
		this.rad = radius;
	}
	
	//Method to take input of radius
	public static Double takeinput() {
		Scanner n = new Scanner(System.in);
		Double input;
		
		boolean correct = true;
		
		while (true){
			System.out.print("Enter Radius in inches: ");
			input = n.nextDouble();
			if(inputvalid(input)){
				break;
			}
			else{
				System.out.println("\nWrong input! Enter again!");
			}
		}
		n.close();
		return input ;
	}

	//Check if the given input is valid or not
	public static boolean inputvalid(Double input) {
		if (input > 0.0)
			return true;
		else
			return false;
	}
	
	//Calculating the area of the Circle
	public Double area() {
		return (Pie * getRadius() * getRadius());
	}
}
