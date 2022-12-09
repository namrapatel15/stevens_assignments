//Namra Sanjay Patel

//CWID - 20011070

//2022F CS 501-WS3

//Calculator of the area of different shapes 

import java.util.Scanner;

public class Triangle {
	
	private Double base;
	private Double height;
	
	//Default constructor 
	public Triangle() {
		this.base = 0.0;
		this.height = 0.0;
	}
	
	//Constructor overloading
	public Triangle(Double B, Double H) {
		this.base = B;
		this.height = H;
	}

	//getter method
	public Double getBase() {
		return base;
	}

	//Setter method
	public void setBase(Double Base) {
		this.base = Base;
	}
	
	//getter method
	public Double getHeight() {
		return height;
	}
	
	//Setter method
	public void setHeight(Double Height) {
		this.height = Height;
	}

	//Method to take input of Base and Height
	public static Double[] takeinput() {
		Scanner n = new Scanner(System.in);
		Double input[] = new Double[2];
		
		boolean correct = true;
		
		while (true){
			System.out.print("Enter Base in inches: ");
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
	
	//Calculating the Area of the Triangle
	public Double area() {
		return ((getBase() * getHeight())/2);
	}
}


