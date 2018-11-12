//QUESTION
//Given two sequences of characters, print the length of the longest common subsequence of both sequences.

//EXAMPLE
//the longest common subsequence of the following two sequences ‘abcdgh’ ans ‘aedfhr’ is ‘adh’ of length 3.

//SOLUTION

import java.util.Scanner;

public class longestCommonSequence {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		while(input.hasNext()) {
			String firstString = input.nextLine();
			String secondLine = input.nextLine(); 
			char[] firstArr = firstString.toCharArray();
			char[] secondArr = secondLine.toCharArray();
			
			int[][] lcs = new int[firstArr.length+1][secondArr.length+1];
			storeNumbersInArray(firstArr, secondArr, lcs);
			System.out.println(lcs[lcs.length-1][lcs[0].length-1]);
			printThatArray(lcs);
		}
	}
	
	public static void printThatArray(int[][] arr) {
		for(int i = 0; i<arr.length;i++) {
			
			for(int j =0; j <arr[i].length;j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("\n");
		}
	}
	
	public static void storeNumbersInArray(char[] firstArr, char[] secondArr, int[][] lcs) {
		for(int i = 1; i<lcs.length;i++) {
			for(int j = 1; j <lcs[i].length;j++) {
				if(firstArr[i-1] == secondArr[j-1]) {
					lcs[i][j] = 1 + lcs[i-1][j-1];
				} else {
					lcs[i][j] = Integer.max(lcs[i-1][j-1], Integer.max(lcs[i-1][j], lcs[i][j-1]));
				}
			}
		}
	}
 }
