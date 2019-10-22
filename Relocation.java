/*
  In the faraway country of Lineland, tech companies are starting to take over! Every week, it seems that tech companies sprout from the ground, merge, get acquired, or go under. For software engineers looking for new jobs in Lineland, it can be difficult to even find the companies where they’re interviewing.

To solve this issue, you’re going to make a new tech company! The product is simple: using deep neural blockchains in the cloud, your app finds the distance between any two tech companies in Lineland. This is supremely useful, as companies change offices all the time and it’s difficult to stay completely up to date. By centralizing this information, your company is going to make the world a better place.

Since Lineland is organized around a single line, the location of a company can be given by a single coordinate. The distance between any two companies is equal to the distance between their two coordinates.

Your job is to handle two kinds of user requests to the company’s flagship app. One kind of request updates the address of a company, the other requests the shortest distance between two companies.

Input
The first line has two positive space-separated integers N and Q: the number of companies the app tracks (2≤N≤100000), and the number of requests to process (1≤Q≤100000). The next line has N space-separated integers 1≤Xi≤109, which are the initial locations of the N companies, given in order from i=1 to i=N.

Each of the next Q lines has 3 space-separated integers, taking one of the following forms:

1 C X, which means that company C moves its location to X, or

2 A B, which is a query for the distance between companies A and B.

It is guaranteed that 1≤A,B,C≤N and 1≤X≤109. It is possible two companies can share the same location. It is also guaranteed there is at least one query of type 2.

Output
For each query of type 2, print the distance between companies A and B.
*/

import java.util.Scanner;

public class Relocation {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int noOfCompanies = sc.nextInt();
		int noOfRequests = sc.nextInt();
		
		int[] originalDistance = new int[noOfCompanies];
		
		for (int i = 0;i <noOfCompanies; i++) {
			originalDistance[i] = sc.nextInt();
		}
		
		for (int i = 0;i <noOfRequests; i++) {
			int whatToDo = sc.nextInt();
			if (whatToDo == 1) {
				int companyToMove = sc.nextInt();
				originalDistance[companyToMove - 1] = sc.nextInt();
			} else {
				int firstCompany = sc.nextInt();
				int secondCompany = sc.nextInt();
				System.out.println(Math.abs(originalDistance[firstCompany-1] - originalDistance[secondCompany-1]));
			}
		}


	}

}
