
// Namra Sanjay Patel
// CWID - 20011070
// 2022F CS 501-WS3
//Calculator that performs the basic functions of a calculator:  add, subtract, multiply, divide, and clear.


public class Calculator
{
	private Double value; // Creating Private Variable.
	
	public Calculator()  // Creating Constructor.
	{
		value = 0.0;	
	}
	
	public void setvalue(double val) // Creating Set Value method.
	{
		
		value = val;
	}
	
	public void add(double val) // Creating Add method.
	{
		value = value + val;
	}

	public void multiply(double val) // Creating multiply method.
	{
		value = value * val;
	}
	
	public void subtract(double val)  // Creating Subtract method.
	{
		value = value - val;
	}
	
	public void divide () // Creating Divide method.
	{
		value = value/2;
	}

	public void clear() // Creating clear method.
	{
		value = 0.0;
	}
	
	public double getvalue() // Creating get Value method.
	{
		return value;
	}

	








}
