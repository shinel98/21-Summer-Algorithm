package week1;

import java.util.Scanner;

public class DialCall {

	public static void main2_4(String[] args) {
		/*
	     문자열 입력받기
	     문자열의 단어별로 접
	     문자열의 단어의 조건에 따라 해당하는 숫자를 sum에 더하기 
	     ABC = 2
	     DEF = 3
	     GHI = 4
	     JKL = 5
	     MNO = 6
	     PQRS = 7
	     TUV = 8
	     WXYZ = 9
	     OPERATOR = 10
		 */
		Scanner sc = new Scanner(System.in);
		String word = sc.next();
		int sum=0;
//		System.out.println(word);
		for(int i=0; i<word.length(); i++) {
			if(word.equals(""))
				sum+=2;
			else if(word.charAt(i) == 'A' || word.charAt(i) == 'B' || word.charAt(i) == 'C')
				sum+=3;
			else if(word.charAt(i) == 'D' || word.charAt(i) == 'E' || word.charAt(i) == 'F')
				sum+=4;
			else if(word.charAt(i) == 'G' || word.charAt(i) == 'H' || word.charAt(i) == 'I')
				sum+=5;
			else if(word.charAt(i) == 'J' || word.charAt(i) == 'K' || word.charAt(i) == 'L')
				sum+=6;
			else if(word.charAt(i) == 'M' || word.charAt(i) == 'N' || word.charAt(i) == 'O')
				sum+=7;
			else if(word.charAt(i) == 'P' || word.charAt(i) == 'Q' || word.charAt(i) == 'R' || word.charAt(i) == 'S')
				sum+=8;
			else if(word.charAt(i) == 'T' || word.charAt(i) == 'U' || word.charAt(i) == 'V')
				sum+=9;
			else if(word.charAt(i) == 'W' || word.charAt(i) == 'X' || word.charAt(i) == 'Y' || word.charAt(i) == 'Z')
				sum+=10;
			else if(word.equals("OPERATOR"))
				sum+=11;
		}
		System.out.println(sum);
	}
}
