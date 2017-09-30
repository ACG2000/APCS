package GoalSheet2;
import java.util.Scanner;

public class QuadraticRoots {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		double x;
		double root1;
		double root2;
		int run = 1;
		String runInput;
		Scanner scanner = new Scanner(System.in);
	    
		while(run != 0) {
			System.out.printf("Input Polynomial\nax^2+bx+c\na:");
			a = scanner.nextInt();
			System.out.printf("\nb:");
			b = scanner.nextInt();
			System.out.printf("\nc:");
			c = scanner.nextInt();
			
			if (a == 0) {
				x = -c/b;
				System.out.println("linear equation"+x);
			}else {
				x = Math.sqrt((b*b) - (4*a*c));
				root1 = (-b-x) / (2*a);
				root2 = (-b+x) / (2*a);
				
				System.out.printf("\nroots: %f and %f\n", root1, root2);
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