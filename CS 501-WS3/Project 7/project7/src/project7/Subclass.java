// Namra Patel
// CS 501-WS3
// Project 7

package project7;

public class Subclass {
	
	String title;
	String year;
	String genre;
	String rating;
	
	// constructor
	public Subclass(String title, String year, String genre, String rating) {
		super();
		this.title = title;
		this.year = year;
		this.genre = genre;
		this.rating = rating;
	}

	// getters and setters
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}
}
