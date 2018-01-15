package GoalSheet6;

import java.util.ArrayList;
import java.util.Scanner;

/*
Program WindowManager.java by Adam Grant on Dec 6, 2017
*/
public class WindowManager {

	static ArrayList<Windows> windows = new ArrayList<Windows>();

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int currentWindow; 
		Windows temp;
		
		Windows w1 = new Window(1, 1, "w1", 2, 2);
		Windows w2 = new Window(2, 2, "w2", 2, 2);
		Windows w3 = new Window(3, 3, "w3", 2, 2);
		Windows w4 = new Window(0, 0, "w4", 10, 10);
		
		windows.add(w1);
		windows.add(w2);
		windows.add(w3);
		windows.add(w4);
		
		boolean run = true;
		while (run  == true) {
			System.out.println("click x: ");
			int x = scanner.nextInt();
			System.out.println("click y: ");
			int y = scanner.nextInt();
			currentWindow = Click(x, y);
			
			if (currentWindow > windows.size()) {
				System.out.println("invalid click");
			} else {
				windows.add(0, windows.remove(currentWindow));
			}
			for (int i = 0; i < windows.size(); i++) {
				temp = windows.get(i);
				System.out.println(temp.GetName());
			} 
			
			System.out.println("Stop?");
			if(scanner.next() == "y") {
				run = false;
			}
		}
		
	}

	private static int Click(int x, int y) {
		Windows current;
		int i;
		int currentX, currentY;
		for(i = 0; i < windows.size() ; i++) {
			current = windows.get(i);
			currentX = current.GetXpos();
			currentY = current.GetYpos();
			if(currentX == x && currentY == y) {
				return i;
			}
			for(int n = currentX; n < currentX+current.GetLength(); n++) {
				for(int j = currentY; j < currentY+current.GetWidth(); j++) {
					if(n == x && j == y) {
						return i;
					}
				}
			}
		}
		
		return i;
	}	
}
