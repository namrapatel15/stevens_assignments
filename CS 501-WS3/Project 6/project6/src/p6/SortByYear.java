//Namra Sanjay Patel
//20011070
// Java program using good programming principles that will read an input file and write data to different output files. 

package p6;

import java.util.Comparator;

class SortByYearAsc implements Comparator<Storm> {

	// Method
	// Sorting in ascending order of year
	public int compare(Storm a, Storm b) {
		if (a.getYear() > b.getYear())
			return 1;
		else if (a.getYear() < b.getYear())
			return -1;
		else
			return a.getName().compareTo(b.getName());
	}
}

class SortByYearDesc implements Comparator<Storm> {

	// Method
	// Sorting in descending order of year
	public int compare(Storm a, Storm b) {
		if (b.getYear() > a.getYear())
			return 1;
		else if (b.getYear() < a.getYear())
			return -1;
		else
			return b.getName().compareTo(a.getName());
	}
}