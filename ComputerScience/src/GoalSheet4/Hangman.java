package GoalSheet4;

import java.util.Random;
import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) {
		
		boolean run = true;
		while(run) {
		boolean incomplete = true;
		String words[] = {"soccer", "football", "golf", "frisbee", "basketball"};
		String word;
		String guessedWord = "";
		String guessedLetters = "";
		String currentGuess;
		String correctLetters = "";
		int guesses = 0;
		Scanner scanner = new Scanner(System.in);
		
		
			word = randomWord(words);
//			for(int i = 0;i < word.length();i++) {
//				guessedWord += "_";
//			}
			System.out.println(word);
			while(incomplete == true) {
				System.out.println(guessedWord);
				System.out.println("guess:");
				currentGuess = scanner.next();
				guessedLetters += currentGuess;
				//System.out.println("guess: "+guess+"\nguessed letters: "+guessedLetters);
				for(int i = 0;i < word.length();i++) {
					if(currentGuess.charAt(0) == word.charAt(i)) {
						System.out.println("correct: "+i);
						correctLetters += currentGuess;
					}
				}
				incomplete = printWord(word, correctLetters);
				guesses++;
			}
			System.out.println("Correct, you guessed "+guesses+" times");
			incomplete = true;
		}
	}
	
	public static boolean printWord(String word, String correctLetters) {
		boolean correctLetter = false;
		boolean wrong = false;
		for (int j = 0; j < word.length(); j++) {
			correctLetter = false;
			for (int j2 = 0; j2 < correctLetters.length(); j2++) {
				if (correctLetters.charAt(j2) == word.charAt(j)) {
					if(!correctLetter) {
						System.out.print(correctLetters.charAt(j2)+" ");
						correctLetter = true;
					}
				}
			}
			if(!correctLetter) {
				wrong = true;
				System.out.print("_ ");
			}
		}
		System.out.println();
		return wrong;
	}
	
	public static String randomWord(String words[]){
		String word;
		Random rand = new Random();
		
		word = words[rand.nextInt(5)];
		
		return word;
	}
}
