
//Namra Sanjay Patel
//20011070
// Java program using good programming principles that will read an input file and write data to different output files. 
package p6;

import java.util.Comparator;

class SortByNameAsc implements Comparator<Storm> {

	// Sorting in ascending order of name
	public int compare(Storm a, Storm b) {
		return a.getName().compareTo(b.getName());
	}
}

class SortByNameDesc implements Comparator<Storm> {

	// Sorting in ascending order of name
	public int compare(Storm a, Storm b) {
		return b.getName().compareTo(a.getName());
	}
}