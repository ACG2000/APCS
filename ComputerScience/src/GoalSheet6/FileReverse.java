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
		String checkLine;
		
		Scanner scanner = new Scanner(new File("src/Support/TextFile.txt"));
		scanner.useDelimiter(" ");
				
		ArrayList<String> words = new ArrayList<String>();
		
		while(scanner.hasNext()) {
			checkLine = scanner.next();
			
			if(checkLine.contains("\n")) {
				int nateSnake = checkLine.indexOf('\n');
				
				words.add(0, checkLine.substring(0, nateSnake-1));
				words.add(0, "\n");
				words.add(0, checkLine.substring(nateSnake+1, checkLine.length()));
				
			}else{
				words.add(0, checkLine);
			}
		}
		System.out.println(words);
	}
}