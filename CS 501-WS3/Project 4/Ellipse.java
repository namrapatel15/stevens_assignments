//Namra Sanjay Patel

//CWID - 20011070

//2022F CS 501-WS3

//Calculator of the area of different shapes 

import java.util.Scanner;

public class Ellipse {
	
	private Double rad1;
	private Double rad2;
	static double Pie = 3.14159;
	
	
	//Default constructor 
	public Ellipse() {
		this.rad1 = 0.0;
		this.rad2 = 0.0;
	}
	
	//Constructor overloading
	public Ellipse(Double rad1, Double rad2) {
		this.rad1 = rad1;
		this.rad2 = rad2;
	}

	//getter method
	public Double getrad1() {
		return rad1;
	}

	//Setter method
	public void setrad1(Double rad1) {
		this.rad1 = rad1;
	}
	
	//getter method
	public Double getrad2() {
		return rad2;
	}
	
	//Setter method
	public void setrad2(Double rad2) {
		this.rad2 = rad2;
	}

	//Method to take input of radiuses
	public static Double[] takeinput() {
		Scanner n = new Scanner(System.in);
		Double input[] = new Double[2];
		
		boolean correct = true;
		
		while (true){
			System.out.print("Enter Radius 1 in inches: ");
			input[0] = n.nextDouble();
			if(inputvalid(input[0])){
				break;
			}
			else{
				System.out.println("\nWrong input! Enter again!");
			}
		}
		
while (true){
			System.out.print("Enter Radius 2 in inches: ");
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
	
	//Calculating the area of the Ellipse
	public Double a() {
		return (Pie * getrad1() * getrad2());
	}
}
