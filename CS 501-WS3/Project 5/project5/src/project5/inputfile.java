// Namra Sanjay Patel
//CWID-20011070
// Java program that will read from an input file named inPoem.txt found in the current directory. 

package project5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class inputfile {

	String file = new String();
	private analysis c = new analysis();
	ArrayList<String> w = new ArrayList<String>();
	
	
	// Default constr.
	public inputfile (){
		file = "inPoem.txt";
	}
	
	// Constructor based on specific number
	public inputfile (String f) {
		super();
		this.file = f;
	}
	
	
	// Getters and setters
	public String getFilename() {
		return file;
	}
	public void setFilename(String filename) {
		this.file = filename;
	}
	public analysis getCheck() {
		return c;
	}
	public void setCheck(analysis check) {
		this.c = check;
	}

	// reading file word to word
	public void readfile() throws FileNotFoundException {
	
	// Open the file 
	File myFile = new File(file);
	Scanner inputFile = new Scanner(myFile);
	
	while (inputFile.hasNext()) {
	
		// next word - string
		String str = inputFile.next();
		String res = new String();
		
		for (Character c : str.toCharArray()) 
		{
			if(Character.isLetterOrDigit(c))
				res += c;
		}
			w.add(res);
		}
	
	//Close file
	inputFile.close();
	}
	public void sortfunct() {
		Collections.sort(w);
		for (String w: w) {
			c.searchAddElement(w);
		}
	}
}
