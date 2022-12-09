//Namra Sanjay Patel

//CWID - 20011070

//2022F CS 501-WS3

//Calculator of the area of different shapes 

import java.util.Scanner;

public class Cylinder {
	
	private Double rad;
	static double Pie = 3.14159;
	private Double height;
	
	//Default constructor 
	public Cylinder() {
		this.rad = 0.0;
		this.height = 0.0;
	}
	
	//Constructor Overloading
	public Cylinder(Double rad, Double height) {
		this.rad = rad;
		this.height = height;
	}

	//getter method
	public Double getrad() {
		return rad;
	}

	//Setter method
	public void setrad(Double rad) {
		this.rad = rad;
	}
	
	//getter method
	public Double getheight() {
		return height;
	}
	
	//Setter method
	public void setheight(Double height) {
		this.height = height;
	}

	//Method to take input of radius and height
	public static Double[] takeinput() {
		Scanner n = new Scanner(System.in);
		Double input[] = new Double[2];
		
		boolean correct = true;
		
		while (true){
			System.out.print("Enter Radius in inches: ");
			input[0] = n.nextDouble();
			if(inputvalid(input[0])){
				break;
			}
			else{
				System.out.println("\nWrong input! Enter again!");
			}
		}
		
while (true){
			System.out.print("Enter Height in inches: ");
			input[1] = n.nextDouble();
			if(inputvalid(input[1])){
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
	
	//Calculating the area of the Cylinder
	public Double area() {
		return (2 * Pie * getrad()*(getrad() + getheight()));
	}
}
