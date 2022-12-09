// Namra Patel
// CS 501-WS3
// Project 7

package project7;

import java.util.Comparator;

public class Superclass extends Subclass {

	String directorinfo;
	String composerinfo;

	// constructor
	public Superclass(String directorinfo, String composerinfo, String title, String year, String genre,
			String rating) {
		super(title, year, genre, rating);
		this.directorinfo = directorinfo;
		this.composerinfo = composerinfo;
	}

	// getters and setters
	public String getDirectorinfo() {
		return directorinfo;
	}

	public void setDirectorinfo(String directorinfo) {
		this.directorinfo = directorinfo;
	}

	public String getComposerinfo() {
		return composerinfo;
	}

	public void setComposerinfo(String composerinfo) {
		this.composerinfo = composerinfo;
	}

	// comparator
	public static Comparator<Superclass> YearAndTitleComparator = new Comparator<Superclass>() {
		public int compare(Superclass y1, Superclass y2) {
			
			// if same year sort by title
			if (y1.getYear().compareTo(y2.getYear()) == 0) {
				return y1.getTitle().compareTo(y2.getTitle());
			} else
				return y1.getYear().compareTo(y2.getYear());
		}
	};
}
