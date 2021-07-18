package week2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class SortInside {

	public static void main7_5(String[] args) {
		Scanner sc = new Scanner(System.in);
		String sentence = sc.next(); //문자열 입력받기 
		char[] temp = sentence.toCharArray(); //  문자열을 char배열에 넣기 
		char[] arr = new char[sentence.length()]; // 역순으로 넣을 배열 선언 
		
		Arrays.sort(temp); //  char배열을 오름차순으로 정렬 
		
		for(int i=0; i<sentence.length(); i++) {
			arr[temp.length-1-i] = temp[i]; //  역순으로 새로운 배열에 넣기 
		}
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]); // 새로운 배열 출력  
		}
	}

}
