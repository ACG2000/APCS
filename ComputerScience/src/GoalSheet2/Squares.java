package GoalSheet2;
import java.util.Scanner;

public class Squares {

	public static void main(String[] args) {
		int input = 0;
		int output = 0;
		int run = 1;
		String runInput;
		Scanner scanner = new Scanner(System.in);
	    
		while(run != 0) {
			System.out.println("Enter the amount of squares you would like: ");
			input = scanner.nextInt();
			System.out.printf("\n\n");
			
			for(int i = 1;i <= input; i++) {
				output = i*i;
				System.out.println(output);
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
