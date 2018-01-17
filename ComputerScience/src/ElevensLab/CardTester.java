package ElevensLab;

/**
 * This is a class that tests the Card class.
 */
public class CardTester {

	/**
	 * The main method in this class checks the Card operations for consistency.
	 *	@param args is not used.
	 */
	public static void main(String[] args) {
		/* *** TO BE IMPLEMENTED IN ACTIVITY 1 *** */
		Card c1 = new Card("Ace",  "Spades",  1);
		Card c2 = new Card("Jack", "Clubs", 11);
		Card c3 = new Card("Ace", "Hearts", 1);
		
		System.out.println("Card 1 = "+c1.toString());
		System.out.println("Card 2 = "+c2.toString());
		System.out.println("Card 3 = "+c3.toString());
		
		if (c1.matches(c3)) {
			System.out.println("match");
		}else {
			System.out.println("not a match");
		}
	}
}