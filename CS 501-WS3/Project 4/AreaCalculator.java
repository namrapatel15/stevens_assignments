//Namra Sanjay Patel

//CWID - 20011070

//2022F CS 501-WS3

//Calculator of the area of different shapes 

import java.util.Scanner;

public class AreaCalculator {

	public static void main(String[] args) {
		Scanner n = new Scanner(System.in);
		String input;
		Double values[] = new Double[2];
		
		System.out.println("Area calculator\n");
		
		//Asking for the correct input and will convert it into lower case
		do {
			System.out.print("1.Circle\n2.Rectangle\n3.Triangle\n4.Cylinder\n5.Ellipse\n6.Trapezoid\n\nExit\n\nChoose the shape: ");
			input = n.nextLine().toLowerCase();
		
		switch (input) {
		//Calling the Circle class
		case "circle" : 
		
 			//Instance 
			Circle c = new Circle();
			
			//Take input 
			values[0] = Circle.takeinput();
			
			//Calling setter method
			c.setRadius(values[0]);
			
			//Area of the Circle
			System.out.println("\nArea of the circle is " + String.format("%.2f", c.area())+" square inches.");
			break;
			
			//Calling the Rectangle class
		case "rectangle":
			//Instance 
			Rectangle r = new Rectangle();
			
			//Take input 
			values = Rectangle.takeinput();
			
			//Calling setter method
			r.setLength(values[0]);
			r.setWidth(values[1]);
			
			//Area of the Rectangle
			System.out.println("\nArea of the Rectangle is " + String.format("%.2f", r.area())+" square inches.");
			break;
			
			//Calling the Cylinder class	
		case "cylinder":
			//Instance
			Cylinder cy = new Cylinder();
			
			//Take input 
			values = Cylinder.takeinput();
			
			//Calling setter method
			cy.setrad(values[0]);
			cy.setheight(values[1]);
			
			//Area of the Cylinder
			System.out.println("\nArea of the Cylinder is " + String.format("%.2f", cy.area())+" square inches.");
			break;
			
			//Calling the Trapezoid class
		case "trapezoid":
			//Instance 
			Trapezoid tr = new Trapezoid();
			
			//Take input 
			values = Trapezoid.takeinput();
			
			//Calling setter method
			tr.setbase1(values[0]);
			tr.setbase2(values[1]);
			tr.setheight(values[2]);
			
			//Area of the Trapezoid
			System.out.println("\nArea of the Trapezoid is " + String.format("%.2f", tr.a())+" square inches.");
			break;
			
			//Calling the Ellipse class
		case "ellipse":
			//Instance 
			Ellipse ep = new Ellipse();
			
			//Take input 
			values = Ellipse.takeinput();
			
			//Calling setter method
			ep.setrad1(values[0]);
			ep.setrad2(values[1]);
			
			//area of the Ellipse
			System.out.println("\nArea of the Ellipse is " + String.format("%.2f", ep.a())+" square inches.");
			break;
		
			//Calling the Triangle class
		case "triangle":
			//Instance 
			Triangle t = new Triangle();
			
			//Take input 
			values = Triangle.takeinput();
			
			//Calling setter method
			t.setBase(values[0]);
			t.setHeight(values[1]);
			
			//Area of the Triangle 
			System.out.println("\nArea of the Triangle is " + String.format("%.2f", t.area())+" square inches.");
			break;
			
	
		
		case "exit":
			System.out.println("\nExiting!");
			System.exit(0);
			break;
			
		default:
			System.out.println("\n\nWrong input! Enter again!");
			break;
		}

		} while (!input.equals("circle") && !input.equals("rectangle") && !input.equals("triangle") && !input.equals("cylinder") && !input.equals("ellipse") && !input.equals("trapezoid"));
		
		n.close();
		System.out.println("\nEnd of Area Calculation!");
	}
}
