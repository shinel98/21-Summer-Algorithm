package week1;

import java.util.Scanner;

public class Print10words {

	public static void main3_2(String[] args) {
		/*
		 문자열 입력받기
		 문자열의 길이만큼 반복하면서 하나씩 출력하되
		 인덱스가 10의 배수면 개행 
		 */
		Scanner keyboard = new Scanner(System.in);
		String sentence = keyboard.next();
		
		for(int i=0; i<sentence.length(); i++) {
			if(i != 0 && i%10 == 0)
				System.out.println();
			System.out.print(sentence.charAt(i));
		}
	}
}
