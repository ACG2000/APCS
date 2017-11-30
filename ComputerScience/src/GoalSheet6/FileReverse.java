package GoalSheet6;
/*
Program FileReverse.java by Adam Grant on Nov 29, 2017
*/

import java.util.*;
import java.io.*;

public class FileReverse {

	public static void main(String[] args) throws FileNotFoundException {
		int linesRead = 0;
		int counter = 0;
		Scanner scanner = new Scanner(new File("src/Support/TextFile.txt"));
		scanner.useDelimiter("\n");
				
		ArrayList<String> input = new ArrayList<String>();
		
		while(scanner.hasNextLine()) {
			while(scanner.hasNext()) {
				if(linesRead <= counter) {
					input.add(scanner.next());
				}
				if(scanner.next() == "\n") {
					counter++;
					scanner.next();
					if(linesRead < counter) {
						break;
					}
				}
			}
			
			
			for(int i = input.size() -1;i >= 0;i--) {
				System.out.print(input.get(i) + " ");
			}
			System.out.println();
			linesRead++;
		}
	}
}
