// Namra Sanjay Patel
//CWID-20011070
// Java program that will read from an input file named inPoem.txt found in the current directory. 

package project5;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class finalprj5 {

	public static void main(String[] args) throws FileNotFoundException {
			
		inputfile inp = new inputfile("inPoem.txt");
			ArrayList<String> w = new ArrayList<String>();
			inp.readfile();
			inp.sortfunct();
		
			//Calling all the functions from input and analysis package
			System.out.println("Poem Word Analysis");
			System.out.println("\n  Opening input file....");
			System.out.println("\nWORD\tFREQUENCY\tPALINDROME");
			for (int i=0; i<inp.getCheck().getWords().size(); i++) {
				System.out.print(inp.getCheck().getWords().get(i));
				System.out.print("\t\t");
				System.out.print(inp.getCheck().getWordcount().get(i));
				System.out.print("\t");
				System.out.print(inp.getCheck().getPalindrome().get(i));
				System.out.println();
			
			}
			System.out.println("\nEnd of result.");
		}
}
