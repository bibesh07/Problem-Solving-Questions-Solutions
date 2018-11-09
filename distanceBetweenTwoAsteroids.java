//QUESTION
//The radius of earth is 6440 Kilometer. There are many Satellites
//and Asteroids moving around the earth. If two Satellites
//create an angle with the center of earth, can you find out
//the distance between them? By distance we mean both the
//arc and chord distances. Both satellites are on the same orbit
//(However, please consider that they are revolving on a circular
//path rather than an elliptical path).

//EXAMPLE
//The input file will contain one or more test cases.
//Each test case consists of one line containing two-integer
//s and a, and a string ‘min’ or ‘deg’. Here s is the distance of
//the satellite from the surface of the earth and a is the angle
//that the satellites make with the center of earth. It may be in minutes (′
//) or in degrees (◦
//). Remember
//that the same line will never contain minute and degree at a time.

//SOLUTION

import java.text.DecimalFormat;
import java.util.Scanner;

public class distanceBetweenTwoAsteroids {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat _numberFormat= new DecimalFormat("#0.000000");

		while(sc.hasNext()) {
			double distanceFromSurface = sc.nextInt();
			double angle = sc.nextInt();
			String angleType = sc.next();
			angle = (angleType.matches("min")) ? angle/60 : angle; 
			double chordLength = CalculateThatStuff(distanceFromSurface, angle);
			double arcLength = angle*(Math.PI/180) * (6440+distanceFromSurface);
			
			System.out.println(_numberFormat.format(arcLength)+ " " + _numberFormat.format(chordLength));
		}
	}
	
	public static double CalculateThatStuff(double distanceFromSurface, double angle) {
		return (6440+distanceFromSurface) * Math.sin(angle*(Math.PI/180)/2) * 2;
	}
 }
