package week1;

import java.util.Scanner;

public class DivideChocolate {
	public static void main5_1(String[] args) {
		
		/*
		 N-1 번 자르고
		 M-1번을 N번만큼 자르면 완성
		 자르는 횟수 : N-1 + N*(M-1)
		 	= N-1 + NM - N 
		 	= N*M-1
		 */
		
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		int M=sc.nextInt();
		
		System.out.println(N*M-1);
		
	}
}
