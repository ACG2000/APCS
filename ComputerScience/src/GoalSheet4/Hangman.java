package GoalSheet4;

import java.util.Random;
import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) {
		boolean run = true;
		boolean won = false;
		String words[] = {"soccer", "football", "golf", "frisbee", "basketball"};
		String word;
		String guessedWord = "";
		String guessedLetters = "";
		String currentGuess;
		String correctLetters = "";
		int guesses = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			word = randomWord(words);
//			for(int i = 0;i < word.length();i++) {
//				guessedWord += "_";
//			}
			System.out.println(word);
			while(won == false) {
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
				printWord(word, correctLetters);
				guesses++;
			}
		}
	}
	
	public static void printWord(String word, String correctLetters) {
		for (int j = 0; j < word.length(); j++) {
			for (int j2 = 0; j2 < correctLetters.length(); j2++) {
				if (correctLetters.charAt(j2) == word.charAt(j)) {
					System.out.print(correctLetters.charAt(j2)+" ");
				}
			}
			System.out.print("_ "); 
		}
		System.out.println();
	}
	
	public static String randomWord(String words[]){
		String word;
		Random rand = new Random();
		
		word = words[rand.nextInt(5)];
		
		return word;
	}
}
