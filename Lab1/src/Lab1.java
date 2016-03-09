import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

/**
 * This program reads input in from a file "lab1.txt", adds the sum of each
 * line, and outputs it to the console and to the "lab1out.txt" file.
 * 
 * @author Brenden
 *
 */

public class Lab1 {

	/**
	 * Entry point into program
	 * @param args command line args
	 * @throws FileNotFoundException if file is not found
	 */
	
	public static void main(String[] args) throws FileNotFoundException {

		// Create new File, PrintWriter and Scanner objects
		File myFile = new File("lab1.txt");
		Scanner in = new Scanner(myFile);
		File lab1out = new File("lab1out.txt");
		PrintWriter writer = new PrintWriter(lab1out);
		
		
		String hey = "101";
		int totall =0;
		Double.parseDouble(hey);
		System.out.print(hey);

		// Create counter and total variables
		double total = 0.0;
		int i = 0;
		

		// Continue loop until end of file
		while (in.hasNext()) {
			String currentLine = in.nextLine();
			Scanner line = new Scanner(currentLine);

			// nested while loop to add each line item
			while (line.hasNext()) {
				double currentNum = line.nextDouble();
				total += currentNum;

			}
			// Increment counter variable
			i++;

			// Print to console and file
			System.out.println("Line " + i + ": sum = " + total);
			writer.println("Line " + i + ": sum = " + total);

			// Reset total to 0
			total = 0;

			// Close Scanner
			line.close();
		}

		// Close scanners
		in.close();
		writer.close();
	}

}
