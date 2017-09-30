package GoalSheet3;
import java.util.Scanner;

public class RomanNumerals {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int input = 0;
		
		
		System.out.println("input a number:");
		input = scanner.nextInt();
		
		
		System.out.println(convertToRoman(input));
		scanner.close();
	}
	
	public static String convertToRoman(int input){
		int numbers[] = {1,4,5,9,10,40,50,90,100,400,500,900,1000};
		String letters[] = {"I","IV","V","IX","X","XL","L","XC","C","CD","D","DM","M"};
		String output = "";
		
		while(input > 0) {
			if((input - numbers[12])>0) {
				input -= numbers[12];
				output += letters[12];
			}else if((input - numbers[11])>=0) {
				input -= numbers[11];
				output += letters[11];
			}else if((input - numbers[10])>=0) {
				input -= numbers[10];
				output += letters[10];
			}else if((input - numbers[9])>=0) {
				input -= numbers[9];
				output += letters[9];
			}else if((input - numbers[8])>=0) {
				input -= numbers[8];
				output += letters[8];
			}else if((input - numbers[7])>=0) {
				input -= numbers[7];
				output += letters[7];
			}else if((input - numbers[6])>=0) {
				input -= numbers[6];
				output += letters[6];
			}else if((input - numbers[5])>=0) {
				input -= numbers[5];
				output += letters[5];
			}else if((input - numbers[4])>=0) {
				input -= numbers[4];
				output += letters[4];
			}else if((input - numbers[3])>=0) {
				input -= numbers[3];
				output += letters[3];
			}else if((input - numbers[2])>=0) {
				input -= numbers[2];
				output += letters[2];
			}else if((input - numbers[1])>=0) {
				input -= numbers[1];
				output += letters[1];
			}else if((input - numbers[0])>=0) {
				input -= numbers[0];
				output += letters[0];
			}
		}
		return output;
	}
}
