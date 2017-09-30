package GoalSheet2;
import java.io.IOException;
import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) throws IOException {
		int current = 1;
		int previous = 0;
		int next = 1;
		int input = 0;
		int run = 1;
		String runInput;
		Scanner scanner = new Scanner(System.in);
	    
		while(run != 0) {
			System.out.println("Enter the amount of fibanacci series itereations you would like: ");
			input = scanner.nextInt();
			System.out.printf("\n\n");
			
			for(int i = 0;i < input;i++) {
				next = previous + current;
				previous = current;
				current = next;
				System.out.println(current);
			}
			
			System.out.println("Would you like to repeat?(y or n)");
			runInput = scanner.next();
			
			if(runInput.equals("n")) {
				run = 0;
			}
		}
		scanner.close();
	}

}
