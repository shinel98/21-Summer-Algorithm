package week2;

import java.util.Arrays;
import java.util.Scanner;

public class Suffix {

	public static void main7_4(String[] args) {
		Scanner sc = new Scanner(System.in);
		//ArrayList<String> list = new ArrayList<>();
	
		String sentence = sc.next();
		String[] arr = new String[sentence.length()];
		for(int i=0; i<sentence.length(); i++) {
			arr[i] = sentence.substring(i);  
		}
		Arrays.sort(arr);
		for(int i=0; i<sentence.length(); i++)
			System.out.println(arr[i]);
	}
}
