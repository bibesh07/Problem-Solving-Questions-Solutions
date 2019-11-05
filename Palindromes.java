import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
public class Palindromes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int startNumber = sc.nextInt();
		int endNumber = sc.nextInt();
		int base = sc.nextInt();
		int tracker = 0;
		boolean shouldIncreaseTracker = true;
		
		while(startNumber <= endNumber) {
			for(int i = 2; i<=base;i++) {
				if(!checkPalindrome(convertToNBase(startNumber, i))) {
					shouldIncreaseTracker = false;
					break;
				}
			}
			if (shouldIncreaseTracker)
				tracker++;
			
			shouldIncreaseTracker = true;
			startNumber++;
		}
		
		System.out.println(tracker);
	}
	
	private static int[] convertToNBase(int num, int base) {
		List<Integer> intList = new ArrayList<Integer>();
		while(num != 0) {
			intList.add(num % base);
			num = num / base;
		}

		int[] arrValue = new int[intList.size()];
		
		for(int i = arrValue.length-1; i >= 0; i--) {
			arrValue[i] = intList.get(i);
		}
		
		return arrValue;
	}
	
	private static boolean checkPalindrome(int[] arr) {
		int arrLength = (arr.length % 2 != 0 ) ? arr.length-1 : arr.length;
		for(int i = 0, j= arr.length-1;i < arrLength/2 ;i++, j--) {
			if (arr[i] != arr[j]) {
				return false;
			}
		}
		
		return true;
	}
}
