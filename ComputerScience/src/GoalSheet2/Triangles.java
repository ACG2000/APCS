package GoalSheet2;
import java.util.Scanner;

public class Triangles {

	public static void main(String[] args) {
		int sidea = 0;
		int sideb = 0;
		int sidec = 0;
		double anglea = 0;
		double angleb = 0;
		double anglec = 0;
		int run = 1;
		String runInput;
		Scanner scanner = new Scanner(System.in);
	    
		while(run != 0) {
			System.out.printf("Input sides of a triangle\nside a:");
			sidea = scanner.nextInt();
			System.out.printf("\nside b:");
			sideb = scanner.nextInt();
			System.out.printf("\nside c:");
			sidec = scanner.nextInt();
			
			anglea = findAngle(anglea, sidea, sideb, sidec);
			angleb = findAngle(angleb, sideb, sidea, sidec);
			anglec = 180 - (anglea + angleb);
			
			System.out.printf("\nangle a = %f\nangle b = %f\nangle c = %f",  anglea, angleb, anglec);
			
			System.out.println("Would you like to repeat?(y or n)");
			runInput = scanner.next();
			
			if(runInput.equals("n")) {
				run = 0;
			}
		}
		scanner.close();
	}
	
	public static double findAngle(double angle, int sidea, int sideb, int sidec) {
		angle = sidea*sidea;
		angle -= (sideb*sideb)+(sidec*sidec);
		angle = angle / (2*sideb*sidec);
		angle = Math.acos(angle);
		angle = Math.toDegrees(angle);
		return angle;
	}

}
