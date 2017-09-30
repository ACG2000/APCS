package GoalSheet3;
import java.util.Scanner;

public class StringReplicator {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input;
		String output;
		int repetitions;
	
		System.out.println("Input String: ");
		input = scanner.nextLine();
		System.out.println("Enter how many repetitions you would like: ");
		repetitions = scanner.nextInt();
		
		output = repl(input, repetitions);
		
		System.out.println(output);
	}
	
	public static String repl(String input, int repetitions) {
		String output  = "";
		
		for(int i = 0;i < repetitions;i++) {
			output += input;
		}
		
		return output;
	}

}
