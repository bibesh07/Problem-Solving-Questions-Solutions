import java.util.Scanner;

public class Moving {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfWolves = sc.nextInt();
		int noOfSheep = sc.nextInt();
		int noOfCabbages = sc.nextInt();
		int noOfAvailableSpots = sc.nextInt();
		
		if (Math.min(noOfSheep, noOfWolves + noOfCabbages) < noOfAvailableSpots) {
			System.out.println("YES");
		} else if (Math.min(noOfSheep, noOfWolves + noOfCabbages) == noOfAvailableSpots) {
			if (Math.max(noOfSheep, noOfWolves + noOfCabbages) <= 2 * noOfAvailableSpots) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		} else {
			System.out.println("NO");
		}
	}

}
