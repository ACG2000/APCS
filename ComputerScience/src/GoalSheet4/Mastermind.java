package GoalSheet4;
import java.util.Random;
import java.util.Scanner;

public class Mastermind {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		Random rand = new Random();
		String numberstr = "";
		String inputstr = "";
		char[] numberchr = null;
		char[] inputchr = null;
		int number = rand.nextInt(9999);
		
		if(number < 1000) {
			number += 1000;
		}
		numberstr = number + "";
		
		for(int i=0;i<4;i++) {
		numberchr[i] = numberstr.charAt(i);
		}
		
		System.out.println("input a number:");
		inputstr = scanner.next();
		
		for(int i=0;i<4;i++) {
			inputchr[i] = inputstr.charAt(i);
		}
		
		checkGuess(numberchr, inputchr);
	}
	
	public static void checkGuess(char[] number, char[] input) {
		
	}

}