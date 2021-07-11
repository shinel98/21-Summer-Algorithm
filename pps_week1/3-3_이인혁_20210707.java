package week1;

import java.util.Scanner;

public class CaesarPw {
	public static void main3_3(String[] args) {
		/*
		 문자열에서 한단어씩 접근하여 -3을 해주면 카이사르 단어 해독가능 
		 만약 A보다 작으면 + 26-3 
		 */
		Scanner sc = new Scanner(System.in);
		String sentence = sc.next();
		char[] array = new char[sentence.length()]; // 해독완료된 문자들을 담을 배
		
		for(int i=0; i<sentence.length(); i++) {
			if(sentence.charAt(i)-3 < 'A')
				array[i] = (char) (sentence.charAt(i)+23);
			else
				array[i] = (char) (sentence.charAt(i)-3);
		}
		for(int i=0; i<sentence.length(); i++)
			System.out.print(array[i]);
	}
}