package GoalSheet3;
import java.io.*;
import java.util.Scanner;

public class WordCounter {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner file = new Scanner(new File("src/Support/TextFile.txt"));
		int wrds = 0;
		int lns = 0;
		int chr = 0;
		String ln;
		String word;
		
		while(file.hasNextLine()){
			lns++;
			ln = file.nextLine();
			Scanner linereader = new Scanner(ln);
			
			while(linereader.hasNext()) {
				word = linereader.next();
				wrds++;
				chr += word.length();
			}
			linereader.close();
		}
		file.close();
		System.out.println("lines "+lns+" words "+wrds+" characters "+chr);
	}

}
