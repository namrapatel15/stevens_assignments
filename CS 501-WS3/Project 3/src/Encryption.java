
// Namra Sanjay Patel
// CWID - 20011070
// 2022F CS 501-WS3
//a Java program that will go through the first step of encrypting an input file and writing the encrypted contents to an output file.

import java.io.File;

import java.io.*;
import java.util.Scanner;

public class Encryption 
{
	public static void main (String[] args) throws FileNotFoundException
	{	
		System.out.println("Encryption Level 1\n");
		
		System.out.println("Opening input file....\n");
		
		File myFile = new File("Oct1.txt");// opening the file
		Scanner inputFile = new Scanner(myFile);
		
		PrintWriter outputFile = new PrintWriter("EncryptedOct1.txt");
		//opening file for writing
		System.out.println("Encrypting....\n");
		
		while (inputFile.hasNext()) {
			
			String text = inputFile.nextLine();
		
		//String text = "Live long and prosper.";
		
		char [] chars = text.toCharArray();
		
		for(char c : chars)
		{
			if(c=='x')
			{c='a';}
			else if(c=='y' )
			{c='b';}
			else if(c=='z')
			{c='c';}
			else if(c=='X')
			{c='A';
			}else if(c=='Y')
			{c='B';}
			else if(c=='Z')
			{c='C';}
			else if(c==' ')
			{c=' ';}
			else if(c=='.')
			{c='.';}
			
			
				
			else
				c +=3; 
			
			String s=String.valueOf(c);
			if(Character.isUpperCase(c))
			{
				// converting uppercharcter to lowercharacter and writing output in file
				outputFile.print(s.toLowerCase());
				
			}
			else
				
			{
				// converting lowercharcter to uppercharacter and writing output in file
				
				outputFile.print(s.toUpperCase());
			}
			
			
			
		}
			
		
		}	inputFile.close();
		
		outputFile.close();
		System.out.println("Encryption complete.\n\nEnd of program.");
		
	}
}


