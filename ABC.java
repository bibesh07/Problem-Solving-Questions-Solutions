/*You will be given three integers A, B and C. The numbers will not be given in that exact order, but we do know that A is less than B and B less than C.
  In order to make for a more pleasant viewing, we want to rearrange them in a given order.

	Input
	The first line contains the three positive integers A, B and C, not necessarily in that order. The three numbers will be less than or equal to 100.
	The second line contains three uppercase letters ’A’, ’B’ and ’C’ (with no spaces between them) representing the desired order.

	Output
	Output A, B and C in the desired order on a single line, separated by single spaces.
	
	EXAMPLE
	INPUT: 1 5 3
		   ABC
	OUTPUT: 1 3 5
*/
import java.util.Arrays;
import java.util.Hashtable;
import java.util.Scanner;
public class Kattis {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];
		for(int i =0;i<3;i++) {
			arr[i] = sc.nextInt();
		}
		Arrays.sort(arr);
		char[] order = {'A' ,'B', 'C'};
		Hashtable<Character, Integer> hashTable = new Hashtable<Character, Integer>();
		for(int i =0;i<3;i++) {
			hashTable.put(order[i], arr[i]);
		}
		char[] userOrder = sc.next().toCharArray();
		for(int i =0;i<3;i++) {
			System.out.print(hashTable.get(userOrder[i]) + " ");
		}
		
		/* Alternatively it can be simply solved using if/else 
		char[] orderArr = sc.next().toCharArray();
		for(int i=0;i<3;i++) {
			if(orderArr[i] == 'A') {
				System.out.print(arr[0] + " ");
				continue;
			} else if (orderArr[i] == 'B') {
				System.out.print(arr[1] + " ");
				continue;
			} else {
				System.out.print(arr[2] + " ");
			}
		}*/
	}

}
