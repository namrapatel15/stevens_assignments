//Namra Sanjay Patel

//CWID - 20011070

//2022F CS 501-WS3

//Calculator of the area of different shapes 

import java.util.Scanner;

public class Trapezoid {
	
	private Double base1;
	private Double base2;
	private Double height;
	
	
	//Default constructor  
	public Trapezoid() {
		this.base1 = 0.0;
		this.base2 = 0.0;
		this.height = 0.0;	}
	
	//Constructor overloading
	public Trapezoid (Double base1, Double base2, Double height) {
		this.base1 = base1;
		this.base2 = base2;
		this.height = height;
	}

	//getter method
	public Double getbase1() {
		return base1;
	}

	//Setter method
	public void setbase1(Double base1) {
		this.base1 = base1;
	}
	
	//getter method
	public Double getbase2() {
		return base2;
	}
	
	//Setter method
	public void setbase2(Double base2) {
		this.base2 = base2;
	}
	
	//getter method
		public Double getheight() {
			return height;
		}
		
		//Setter method
		public void setheight(Double height) {
			this.height = height;
		}

		//Method to take input of Bases and Height
	public static Double[] takeinput() {
		Scanner n = new Scanner(System.in);
		Double input[] = new Double[3];
		
		boolean correct = true;
		
		while (true){
			System.out.print("Enter Base 1 in inches: ");
			input[0] = n.nextDouble();
			if(inputvalid(input[0])){
				break;
			}
			else{
				System.out.println("\nWrong input! Enter again!");
			}
		}
		
		while (true){
			System.out.print("Enter Base 2 in inches: ");
			input[1] = n.nextDouble();
			if(inputvalid(input[1])){
				break;
			}
			else{
				System.out.println("\nWrong input! Enter again!");
			}
		}
		
		while (true){
			System.out.print("Enter Height in inches: ");
			input[2] = n.nextDouble();
			if(inputvalid(input[2])){
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
	
	//Calculating the area of the Trapezoid
	public Double a() {
		return (((getbase1() + getbase2())/2) * getheight() );
	}
}
