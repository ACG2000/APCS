package GoalSheet3;
import java.util.Scanner;

public class PrintRange {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int fInt;
		int sInt;
		
		System.out.println("First Int: ");
		fInt = scanner.nextInt();
		System.out.println("Second Int: ");
		sInt = scanner.nextInt();
		
		printRange(fInt, sInt);
	}
	
	public static void printRange(int up, int down) {
		if(up == down) {
			System.out.printf("[%d]",up);
		}
		
		if(up > down) {
			System.out.printf("[");
			for(int i= down;i < up;up--) {
				System.out.printf("%d,", up);
			}
			System.out.printf("%d]", up);
		}
		
		if(up < down) {
			System.out.printf("[");
			for(int i= down;i > up;up++) {
				System.out.printf("%d,", up);
			}
			System.out.printf("%d]", up);
		}
	}

}
