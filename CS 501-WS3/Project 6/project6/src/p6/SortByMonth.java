//Namra Sanjay Patel
//20011070
// Java program using good programming principles that will read an input file and write data to different output files. 

package p6;

import java.util.Comparator;

class SortByMonthAsc implements Comparator<Storm> {

	// Method
	// Sorting in ascending order of month
	public int compare(Storm a, Storm b) {
		if (a.getMonth() > b.getMonth())
			return 1;
		else if (a.getMonth() < b.getMonth())
			return -1;
		else
			return a.getName().compareTo(b.getName());
	}
}

class SortByMonthDesc implements Comparator<Storm> {

	// Method
	// Sorting in descending order of month
	public int compare(Storm a, Storm b) {
		if (b.getMonth() > a.getMonth())
			return 1;
		else if (b.getMonth() < a.getMonth())
			return -1;
		else
			return b.getName().compareTo(a.getName());
	}
}