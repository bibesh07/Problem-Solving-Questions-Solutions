import java.math.BigInteger;
import java.util.Scanner;
public class Ratio {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double decimal = sc.nextDouble();
		int noOfRepeatingDigit = sc.nextInt();
		String decimalToString = decimal + "";
		String[] separatedValue = decimalToString.split("\\.");
		int firstTracker = 1;
		int secondTracker = getTensWithDigit(separatedValue[1].length());
		
		if (separatedValue[1].length() != noOfRepeatingDigit) {
			firstTracker = getTensWithDigit(separatedValue[1].length() - noOfRepeatingDigit);
		}
		
		int numerator = Math.abs((int) (decimal * firstTracker) - (int) (decimal * secondTracker));
		int denominator = Math.abs(firstTracker - secondTracker);
		
		BigInteger num, den, gcd;
		num = new BigInteger(numerator + "");
		den = new BigInteger(denominator + "");
		
		gcd = num.gcd(den);
		
		System.out.println((numerator/gcd.intValue()) + "/" + (denominator/gcd.intValue()));
	}
	
	private static int getTensWithDigit(int i) {
		return (int) Math.pow(10, Math.abs(i));
	}

}
