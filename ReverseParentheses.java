/*
  You have a string s that consists of English letters, punctuation marks, whitespace characters, and brackets.
  It is guaranteed that the parentheses in s form a regular bracket sequence.

  Your task is to reverse the strings contained in each pair of matching parentheses, starting from the innermost pair.
  The results string should not contain any parentheses.

  Example

  For string s = "a(bc)de", the output should be
  reverseParentheses(s) = "acbde".

  Input/Output

  [execution time limit] 3 seconds (java)

  [input] string s

  A string consisting of English letters, punctuation marks, whitespace characters and brackets. It is guaranteed that parentheses form a regular bracket sequence.

  Constraints:
  5 ≤ s.length ≤ 55.
*/

import java.util.Scanner;
public class ReverseParentheses {
	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   String in = sc.nextLine();
	   System.out.println(reverseParentheses(in));
	}
	
	public static String reverseParentheses(String s) {
	    int indexOfStart = s.lastIndexOf('(');
	    while(indexOfStart != -1) {
		int indexOfEnd = s.indexOf(')', indexOfStart);
		StringBuffer reverseString = new StringBuffer(s.substring(indexOfStart+1, indexOfEnd));
		s = s.substring(0, indexOfStart) + reverseString.reverse() + s.substring(indexOfEnd+1, s.length());
		indexOfStart = s.lastIndexOf('(');		
	     }
			
	     return s;
	}
}
