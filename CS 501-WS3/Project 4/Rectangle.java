//Namra Sanjay Patel

//CWID - 20011070

//2022F CS 501-WS3

//Calculator of the area of different shapes 

import java.util.Scanner;

public class Rectangle {
	
	private Double length;
	private Double width;
	
	//Default constructor 
	public Rectangle() {
		this.length = 0.0;
		this.width = 0.0;
	}
	
	//Constructor overloading
	public Rectangle(Double length, Double width) {
		this.length = length;
		this.width = width;
	}

	//getter method
	public Double getLength() {
		return length;
	}

	//Setter method
	public void setLength(Double length) {
		this.length = length;
	}
	
	//getter method
	public Double getWidth() {
		return width;
	}
	
	//Setter method
	public void setWidth(Double width) {
		this.width = width;
	}

	//Method to take input of length and width
	public static Double[] takeinput() {
		Scanner n = new Scanner(System.in);
		Double input[] = new Double[2];
		
		boolean correct = true;
		
		while (true){
			System.out.print("Enter Length in inches: ");
			input[0] = n.nextDouble();
			if(inputvalid(input[0])){
				break;
			}
			else{
				System.out.println("\nWrong input! Enter again!");
			}
		}
		
while (true){
			System.out.print("Enter Width in inches: ");
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
	
	//Calculating the area of the Rectangle
	public Double area() {
		return (getLength() * getWidth());
	}
}
