//Namra Sanjay Patel
//20011070
// Java program using good programming principles that will read an input file and write data to different output files. 

package p6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import static java.lang.System.exit;

import java.awt.FlowLayout;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Main {

	//creating main class
	public static void main(String[] args) throws FileNotFoundException {
	//creating array list
		ArrayList<Storm> storms = new ArrayList<Storm>();
	//try block
		try {
			File myObj = new File("NamedFloridaHurricanes.txt");
			Scanner myReader = new Scanner(myObj);
			String name;
			int category, day, month, year;
			while (myReader.hasNextLine()) {
				String data[] = myReader.nextLine().split(",");
				name = data[0];
				data = data[1].split(":");
				category = Integer.parseInt(data[0]);
				data = data[1].split("/");
				Storm s = new Storm(name, category, Integer.parseInt(data[0]), Integer.parseInt(data[1]),
						Integer.parseInt(data[2]));
				storms.add(s);
				
			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		//creating object "f" nad "f2" for jframe
		JFrame f = new JFrame();
		JFrame f2 = new JFrame();
		String filename = new String();
		//formating the output
		String s = "Press 1 to sort by Storm name \n";
		s += "Press 2 to sort by Storm Category \n";
		s += "Press 3 to sort by Storm Year \n";
		s += "Press 4 to sort by Storm Month \n";
		s += "Press 5 to Exit";
		String s1 = JOptionPane.showInputDialog(f, s);
		String input2 = new String();
		
		s = "Florida Named Hurricanes 1950 - 2022\n\n";
		
		String s2 = new String();
		s2 += "Press 1 to sort by Ascending \n";
		s2 += "Press 2 to sort by Descending";
		switch (Integer.parseInt(s1)) {
		case 1:
			input2 = JOptionPane.showInputDialog(f2, s2);
			s += "Sort by Hurricane Name ";
			switch (input2) {
			
			
			case "1":
			//creating subcase for output 1 (ascending)
				storms.sort(new SortByNameAsc());
				s += "in Ascending Order\n\n";
				break;
			case "2":
				//creating subcase for output 1 (descending)
				storms.sort(new SortByNameDesc());
				s += "in Descending Order\n\n";
				break;
			default:
				System.exit(0);
			}
			filename = "SortByNamePatel.txt";
			break;
			
		case 2:
			input2 = JOptionPane.showInputDialog(f2, s2);
			s += "Sort by Hurricane Category ";
			switch (input2) {
			case "1":
				//creating subcase for output 2 (ascending)
				storms.sort(new SortByCategoryAsc());
				s += "in Ascending Order\n\n";
				break;
			case "2":
				//creating case for output 2 (descending)
				storms.sort(new SortByCategoryDesc());
				s += "in Descending Order\n\n";
				break;
			default:
				System.exit(0);
			}
			filename = "SortByCategoryPatel.txt";
			break;
			
		case 3:
			input2 = JOptionPane.showInputDialog(f2, s2);
			s += "Sort by Hurricane Year ";
			switch (input2) {
			case "1":
				//creating subcase for output 3 (ascending)
				storms.sort(new SortByYearAsc());
				s += "in Ascending Order\n\n";
				break;
			case "2":
				//creating subcase for output 3 (descending)
				storms.sort(new SortByYearDesc());
				s += "in Descending Order\n\n";
				break;
			default:
				System.exit(0);
			}
			
			filename = "SortByYearPatel.txt";
			break;
			
		case 4:
			input2 = JOptionPane.showInputDialog(f2, s2);
			s += "Sort by Hurricane Month ";
			switch (input2) {
			case "1":
				//creating subcase for output 4 (ascending)
				storms.sort(new SortByMonthAsc());
				s += "in Ascending Order\n\n";
				break;
			case "2":
				//creating subcase for output 4 (descending)
				storms.sort(new SortByMonthDesc());
				s += "in Descending Order\n\n";
				break;
			default:
				System.exit(0);
			}
			filename = "SortByMonthPatel.txt";
			break;
			
		case 5:
			//exit case
			exit(0);
		}		
		
		s += "Name\tCategory\tDate\n";
		
		for (Storm st : storms) {
			s += st.getName() + "\t" + st.getCategory() + "\t" + st.getMonth() + "-" + st.getDay() + "-" + st.getYear()
					+ "\n";
		}

		PrintWriter opFile = new PrintWriter(filename);
		opFile.print(s);
		opFile.close();
		
		//initiating object for the JButton, JFrame, JScrollPane, JTextArea
		JFrame frame = new JFrame();
		JTextArea textarea = new JTextArea(45, 30);
		JScrollPane scroller = new JScrollPane(textarea);
		JButton button = new JButton("OK");
		textarea.setEditable(false);
		textarea.setText(s);

		button.addActionListener(e -> {
			frame.dispose();
		});
		
		//setting the layout of the jframe
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 800);
		frame.getContentPane().add(scroller);
		frame.add(button);
		frame.setVisible(true);

	}
}