// Namra Sanjay Patel
//CWID-20011070
// Java program that will read from an input file named inPoem.txt found in the current directory. 

package project5;

import java.util.ArrayList;

public class analysis {

	private ArrayList<String> w = new ArrayList<String>();
	private ArrayList<Integer> wc = new ArrayList<Integer>();
	private ArrayList<Boolean> p = new ArrayList<Boolean>();
	
	
	public ArrayList<String> getWords() {
		return w;
	}
	public void setWords(ArrayList<String> words) {
		this.w = words;
	}
	public ArrayList<Integer> getWordcount() {
		return wc;
	}
	public void setWordcount(ArrayList<Integer> wordcount) {
		this.wc = wordcount;
	}
	public ArrayList<Boolean> getPalindrome() {
		return p;
	}
	public void setPalindrome(ArrayList<Boolean> palindrome) {
		this.p = palindrome;
	}
	
	// Search word if there increase count by 1 
	//if unique add word 
	public void searchAddElement(String element) {
		
		if (getWords().contains(element)) 
		{
			getWordcount().set(getWords().indexOf(element), getWordcount().get(getWords().indexOf(element))+1);
		}
		
		else 
		{
			getWords().add(element);
			getWordcount().add(1);
			getPalindrome().add(checkPalindrome(element));
		}
	}


	// Palindrome Checker
	public Boolean checkPalindrome(String element) {
		
		// funct to Reverse string
		String reverse = new String();
		char ch;
		
		// Reverse the string
		for (int a=element.length()-1; a>=0; a--)
		{
			ch = element.charAt(a);
			reverse = reverse + ch;
		}
		
		
		// Palindrome checker/ output
		if (element.equals(reverse))
			return true;
		else
			return false;
		
	}
}
