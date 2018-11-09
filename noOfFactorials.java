//QUESTION
//The factorial of a positive integer number N, denoted as N!, is defined as the product of all positive
//integer numbers smaller or equal to N. For example 4! = 4 × 3 × 2 × 1 = 24.
//Given a positive integer number N, you have to write a program to determine the smallest number
//k so that N = a1! + a2! + . . . + ak!, where every ai
//, for 1 ≤ i ≤ k, is a positive integer number.

//EXAMPLE
//INPUT -> 10, OUTPUT -> 3 --> 2!+2!+3! = 10

//SOLUTION
import java.util.Scanner;

class noOfFactorials {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while(sc.hasNext()) {
	    int numToTest = sc.nextInt();
	    int sum = 0;
	    int count =0;
	    int[] factorialNums = new int[numToTest+3];
	    int tempNum = numToTest;
	
	    for(int i=1;i<factorialNums.length;i++) {
	      factorialNums[i] = GetFactorial(i); 
	    }
	
	    if(numToTest != 1) {
	      while(sum < numToTest) {
	    	  
	        for(int i=0; i<factorialNums.length;i++) {
	          if(factorialNums[i] <= tempNum && factorialNums[i+1] > tempNum) {
	            tempNum = tempNum - factorialNums[i];
	            sum += factorialNums[i];
	            count++;
	            break;
	          }
	        }
	      }
	    } else {
	      count = 1;
	    }
	
	    System.out.println(count);
    }
  }

  public static int GetFactorial(int val) {
    if (val == 1) {
      return 1;
    }

    return val * GetFactorial(val -1);
  }
}
