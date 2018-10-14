//Checks whether two words are anagram or not

import java.util.Arrays;
import java.util.Scanner;

class AnagramChecker {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(true) {
      String name1 = sc.nextLine();
      String name2 = sc.nextLine();
      System.out.println(anagramToCheck(name1.toCharArray(), name2.toCharArray()));
    }
  }

  public static boolean anagramToCheck(char[] n1, char[] n2) {
    if (n1.length != n2.length) {
      return false;
    }

    Arrays.sort(n1);
    Arrays.sort(n2);
    for(int i =0; i<n1.length;i ++) {
      if (n1[i] != n2[i]) 
        return false;
    }
    return true;
  }
}
