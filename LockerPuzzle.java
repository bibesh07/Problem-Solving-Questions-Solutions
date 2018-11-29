/* A school has a user specified number of lockers and the same number of students. All lockers
are closed on the first day of school. As the students enter, the first student, denoted S1, opens
every locker. Then the second student, S2, begins with the second locker, denoted L2, and
closes every other locker. Student S3 begins with the third locker and changes every third locker
(closes it if it was open, and opens it if it was closed). Student S4 begins with locker L4 and
changes every fourth locker. Student S5 starts with L5 and changes every fifth locker, and so on,
until the last student changes the last locker.
After all the students have passed through the building and changed the lockers, which lockers
are open?
 */
import java.util.Scanner;

public class LockerPuzzle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] lockerStatus = new boolean[sc.nextInt()];
		openAllLockers(lockerStatus);
		for(int i=1;i<lockerStatus.length;i++) {
			changeLockerByIndex(lockerStatus, i);
		}
		
		printAllOpenLockers(lockerStatus);
	}
	
	public static void openAllLockers(boolean[] lockers) {
		for(int j =0;j<lockers.length;j++) {
			lockers[j] = true;
		}
	}
	
	public static void changeLockerByIndex(boolean[] lockers, int startLocker) {
		int count = 0;
		for(int j=startLocker;j<lockers.length;j++) {
			if (++count == startLocker) {
				lockers[j] = !lockers[j];
				count = 0;
			}
		}
	}
	
	public static void printAllOpenLockers(boolean[] lockers) {
		for(int i=0;i<lockers.length;i++) {
			if(lockers[i] == true) {
				System.out.println("locker " + (i+1) + " is open");
			}
		}
	}
}
