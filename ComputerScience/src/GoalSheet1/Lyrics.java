package GoalSheet1;

public class Lyrics {

	public static void main(String[] args) {
			String day = "bug";
			
			for(int i = 1;i<13;i++) {
				day = getDay(day,  i);
				
				System.out.printf("On the %s day of christmas my true love sent to me\n", day);
				if(i==1) {
					firstVerse(i);
				}
				if(i==2) {
					secondVerse();
					firstVerse(i);
				}
				if(i==3) {
					thirdVerse();
					secondVerse();
					firstVerse(i);
				}
				if(i==4) {
					fourthVerse();
					thirdVerse();
					secondVerse();
					firstVerse(i);
				}
				if(i==5) {
					fithVerse();
					fourthVerse();
					thirdVerse();
					secondVerse();
					firstVerse(i);
				}
				if(i==6) {
					sixthVerse();
					fithVerse();
					fourthVerse();
					thirdVerse();
					secondVerse();
					firstVerse(i);
				}
				if(i==7) {
					seventhVerse();
					sixthVerse();
					fithVerse();
					fourthVerse();
					thirdVerse();
					secondVerse();
					firstVerse(i);
				}
				if(i==8) {
					eigthVerse();
					seventhVerse();
					sixthVerse();
					fithVerse();
					fourthVerse();
					thirdVerse();
					secondVerse();
					firstVerse(i);
				}
				if(i==9) {
					ninthVerse();
					eigthVerse();
					seventhVerse();
					sixthVerse();
					fithVerse();
					fourthVerse();
					thirdVerse();
					secondVerse();
					firstVerse(i);
				}
				if(i==10) {
					tenthVerse();
					ninthVerse();
					eigthVerse();
					seventhVerse();
					sixthVerse();
					fithVerse();
					fourthVerse();
					thirdVerse();
					secondVerse();
					firstVerse(i);
				}
				if(i==11) {
					eleventhVerse();
					tenthVerse();
					ninthVerse();
					eigthVerse();
					seventhVerse();
					sixthVerse();
					fithVerse();
					fourthVerse();
					thirdVerse();
					secondVerse();
					firstVerse(i);
				}
				if(i==12) {
					twelfthVerse();
					eleventhVerse();
					tenthVerse();
					ninthVerse();
					eigthVerse();
					seventhVerse();
					sixthVerse();
					fithVerse();
					fourthVerse();
					thirdVerse();
					secondVerse();
					firstVerse(i);
				}
				System.out.printf("\n\n");
			}
	}
		
		public static String getDay(String Day, int count) {
			switch(count){
			case 1:
				Day = "first";
				break;
			case 2:
				Day = "second";
				break;
			case 3:
				Day = "third";
				break;
			case 4:
				Day = "fourth";
				break;
			case 5:
				Day = "fith";
				break;
			case 6:
				Day = "sixth";
				break;
			case 7:
				Day = "seventh";
				break;
			case 8:
				Day = "eigth";
				break;
			case 9:
				Day = "ninth";
				break;
			case 10:
				Day = "tenth";
				break;
			case 11:
				Day = "eleventh";
				break;
			case 12:
				Day = "twelfth";
				break;
			default:
				Day = "you got a bug!!";
				break;
				
			}
			return Day;
		}
		
	public static void firstVerse(int day) {
	if(day != 1) {
		System.out.printf("and ");
	}
	System.out.printf("a Partridge in a Pear Tree\n");
	}
	
	public static void secondVerse() {
		System.out.printf("2 Turtle Doves\n");
	}
	
	public static void thirdVerse() {
		System.out.printf("3 French Hens\n");
	}
	
	public static void fourthVerse() {
		System.out.printf("4 Calling Birds\n");
	}
	
	public static void fithVerse() {
		System.out.printf("5 Golden Rings\n");
	}
	
	public static void sixthVerse() {
		System.out.printf("6 Geese a Laying\n");
	}
	
	public static void seventhVerse() {
		System.out.printf("7 Swans a Swimming\n");
	}
	
	public static void eigthVerse() {
		System.out.printf("8 Maids a Milking\n");
	}
	
	public static void ninthVerse() {
		System.out.printf("9 Ladies Dancing\n");
	}
	
	public static void tenthVerse() {
		System.out.printf("10 Lords a Leaping\n");
	}
	
	public static void eleventhVerse() {
		System.out.printf("11 Pipers Piping\n");
	}
	
	public static void twelfthVerse() {
		System.out.printf("12 Drummers Drumming\n");
	}
}