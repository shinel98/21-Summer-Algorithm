package week1;

import java.math.BigInteger;
import java.util.Scanner;

public class APlusB {

	public static void main4_2(String[] args) {
		Scanner sc = new Scanner(System.in);
		BigInteger A = new BigInteger(sc.next());
		BigInteger B = new BigInteger(sc.next());
		
		A=A.add(B);
		System.out.println(A);
	}
}
