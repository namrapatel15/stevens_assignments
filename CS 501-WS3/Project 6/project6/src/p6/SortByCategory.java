//Namra Sanjay Patel
//20011070
// Java program using good programming principles that will read an input file and write data to different output files. 

package p6;

import java.util.Comparator;

class SortByCategoryAsc implements Comparator<Storm> {

	// Method
	// Sorting in ascending order of category
	public int compare(Storm a, Storm b) {
		if (a.getCategory() == b.getCategory()) {
			return a.getName().compareTo(b.getName());
		} else if (a.getCategory() > b.getCategory())
			return 1;
		else
			return -1;
	}
}

class SortByCategoryDesc implements Comparator<Storm> {

	// Method
	// Sorting in descending order of category
	public int compare(Storm a, Storm b) {
		if (a.getCategory() == b.getCategory()) {
			return b.getName().compareTo(a.getName());
		} else if (b.getCategory() > a.getCategory())
			return 1;
		else
			return -1;
	}
}