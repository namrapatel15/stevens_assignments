//Namra Sanjay Patel
//20011070
// Java program using good programming principles that will read an input file and write data to different output files. 

package p6;

class Storm {
	String name;
	int category;
	int month, day, year;

	public Storm(String name, int category, int month, int day, int year) {
		this.name = name;
		this.category = category;
		this.month = month;
		this.day = day;
		this.year = year;
	}

	public String getName()

	{
		return this.name;
	}

	public int getCategory() {
		return this.category;
	}

	public int getDay() {
		return this.day;
	}

	public int getMonth() {
		return this.month;
	}

	public int getYear() {
		return this.year;
	}

}
