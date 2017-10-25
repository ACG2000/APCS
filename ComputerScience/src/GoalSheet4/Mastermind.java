package GoalSheet4;
import java.util.Random;
import java.util.Scanner;


public class Mastermind {
	public static int cdigits = 0;
	public static int cnumbers = 0;
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		Random rand = new Random();
		String numberstr = "";
		String inputstr = "";
		char numberchr[] = new char[4];
		char inputchr[] = new char[4];
		boolean run = true;
		
		int number = rand.nextInt(9999);

		number = 6614;
		
		numberstr = ""+number;
		
		for(int i=0;i<4;i++) {
			if(number<10 && i < 3) {
				numberchr[0] ='0';
				numberchr[1] ='0';
				numberchr[2] ='0';
				numberstr = "000"+number;
				i = 3;
			}
			if(number<100 && i < 2) {
				numberchr[0] ='0';
				numberchr[1] ='0';
				numberstr = "00"+number;
				i = 2;
			}
			if(number<1000 && i < 1) {
				numberchr[0] ='0';
				numberstr = "0"+number;
				i = 1;
			}
			numberchr[i] = numberstr.charAt(i);
		}
		
		System.out.println(numberstr);
		
		while(run) {
			System.out.println("input a number:");
			inputstr = scanner.next();
			
			for(int i=0;i<4;i++) {
				inputchr[i] = inputstr.charAt(i);
			}
			
			checkGuess(numberchr, inputchr);
			System.out.println("correct numbers in correct place = "+cdigits);
			System.out.println("correct numbers in wrong places = "+cnumbers);
		}
	}
	
	public static void checkGuess(char[] number, char[] input) {
		cnumbers = 0;
		cdigits = 0;
		boolean repeat = false;
		for(int i = 0;i < 4; i++) {
			for(int i2 = 0;i2 < 4;i2++) {
				repeat = false;
				for(int i3 = 0;i3 < i2; i3++) {
					if(input[i3]==input[i2]) {
						repeat = true;
					}else if(number[i3] == number[i2]) {

						//repeat = true;
					}
				}
				if(number[i] == input[i2] && repeat == false) {
					cnumbers++;
				}
			}
		}
		
		for(int i = 0;i < 4; i++) {
			if(number[i] == input[i]) {
				cdigits++;
			}
		}
		if(cdigits>=cnumbers) {

			cnumbers -= cdigits;
		} else if(cdigits<cnumbers) {
			cnumbers -= cdigits;
		}
	}

}