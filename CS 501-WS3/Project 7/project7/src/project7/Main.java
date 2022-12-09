// Namra Patel
// CS 501-WS3
// Project 7

package project7;

import java.awt.FlowLayout;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Main {

	// driver
	public static void driver() {

		String director = new String();
		String composer = new String();
		String title;
		String year;
		String genre;
		String rating;

		ArrayList<Superclass> SciFi = new ArrayList<Superclass>();
		ArrayList<Superclass> Adventure = new ArrayList<Superclass>();
		ArrayList<Superclass> Drama = new ArrayList<Superclass>();
		ArrayList<Superclass> War = new ArrayList<Superclass>();
		ArrayList<Superclass> Romance = new ArrayList<Superclass>();
		ArrayList<Superclass> Thriller = new ArrayList<Superclass>();
		ArrayList<Superclass> Fantasy = new ArrayList<Superclass>();

		// reading file and tokenizing
		Scanner scanner;
		try {
			scanner = new Scanner(new File("MovieListing.txt"));

			director = scanner.nextLine();
			composer = scanner.nextLine();

			while (scanner.hasNextLine()) {
				StringTokenizer st = new StringTokenizer(scanner.nextLine(), ",");
				while (st.hasMoreTokens()) {
					title = st.nextToken();
					year = st.nextToken();
					genre = st.nextToken().trim();
					rating = st.nextToken();
					Superclass sup = new Superclass(director, composer, title, year, genre, rating);

					// add to genre arraylist
					switch (genre) {
					case "Sci Fi":
						SciFi.add(sup);
						break;
					case "Adventure":
						Adventure.add(sup);
						break;
					case "Drama":
						Drama.add(sup);
						break;
					case "War":
						War.add(sup);
						break;
					case "Romance":
						Romance.add(sup);
						break;
					case "Thriller":
						Thriller.add(sup);
						break;
					case "Fantasy":
						Fantasy.add(sup);
						break;
					}
				}
			}

			// close file
			scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		String text = "Director/Composer Movies\n\n" + "Director:  " + director + "\nComposer:  " + composer + "\n\n"
				+ "Which genre would you like:\n\n" + "1. Adventure\n" + "2. Drama\n" + "3. Fantasy\n" + "4. Romance\n"
				+ "5. Sci Fi\n" + "6. Thriller\n" + "7. War\n\n" + "Your choice: ";

		// prompt
		String inp = JOptionPane.showInputDialog(null, text);
		try {

			String text2 = "Director:\t" + director + "\nComposer:\t" + composer + "\n\nGenre:\t";

			switch (Integer.parseInt(inp)) {
			case 1:
				Collections.sort(Adventure, Superclass.YearAndTitleComparator);
				text2 += "Adventure" + "\n\nMovie Title\t\t\tYear Released\tRating\n";
				for (Superclass items : Adventure)
					text2 += items.getTitle() + "\t\t\t" + items.getYear() + "\t" + items.getRating() + "\n";
				break;
			case 2:
				Collections.sort(Drama, Superclass.YearAndTitleComparator);
				text2 += "Drama" + "\n\nMovie Title\t\t\tYear Released\tRating\n";
				for (Superclass items : Drama)
					text2 += items.getTitle() + "\t\t\t" + items.getYear() + "\t" + items.getRating() + "\n";
				break;
			case 3:
				Collections.sort(Fantasy, Superclass.YearAndTitleComparator);
				text2 += "Fantasy" + "\n\nMovie Title\t\t\tYear Released\tRating\n";
				for (Superclass items : Fantasy)
					text2 += items.getTitle() + "\t\t\t" + items.getYear() + "\t" + items.getRating() + "\n";
				break;
			case 4:
				Collections.sort(Romance, Superclass.YearAndTitleComparator);
				text2 += "Romance" + "\n\nMovie Title\t\t\tYear Released\tRating\n";
				for (Superclass items : Romance)
					text2 += items.getTitle() + "\t\t\t" + items.getYear() + "\t" + items.getRating() + "\n";
				break;
			case 5:
				Collections.sort(SciFi, Superclass.YearAndTitleComparator);
				text2 += "Sci Fi" + "\n\nMovie Title\t\t\tYear Released\tRating\n";
				for (Superclass items : SciFi)
					text2 += items.getTitle() + "\t\t\t" + items.getYear() + "\t" + items.getRating() + "\n";
				break;
			case 6:
				Collections.sort(Thriller, Superclass.YearAndTitleComparator);
				text2 += "Thriller" + "\n\nMovie Title\t\t\tYear Released\tRating\n";
				for (Superclass items : Thriller)
					text2 += items.getTitle() + "\t\t\t" + items.getYear() + "\t" + items.getRating() + "\n";
				break;
			case 7:
				Collections.sort(War, Superclass.YearAndTitleComparator);
				text2 += "War" + "\n\nMovie Title\t\t\tYear Released\tRating\n";
				for (Superclass items : War)
					text2 += items.getTitle() + "\t\t\t" + items.getYear() + "\t" + items.getRating() + "\n";
				break;
			default:
				JOptionPane.showMessageDialog(null, "Incorrect input!");
				System.exit(0);
				break;
			}
			
			// frame
			JFrame frame = new JFrame();
			JTextArea textarea = new JTextArea(20, 60);
			JScrollPane scrollpane = new JScrollPane(textarea);
			textarea.setEditable(false);
			textarea.setText(text2);
			frame.setLayout(new FlowLayout());
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.setSize(700, 400);
			frame.getContentPane().add(scrollpane);
			frame.setVisible(true);

		} catch (NumberFormatException nfe) {
			JOptionPane.showMessageDialog(null, "Incorrect input!");
			System.exit(0);
		}

	}

	// main
	public static void main(String[] args) {
		driver();
	}
}
