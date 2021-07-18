package week2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;

public class SortingWOverlap {

	public static void main6_5(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int iter = sc.nextInt();  // 횟수 입력받기    
		HashSet<Integer> hs = new HashSet<Integer>(); // 중복 체크를 위함 
		for(int i=0; i<iter; i++) {
			int num = sc.nextInt();   // 처음 입력한 횟수만큼 반복하여 숫자를 해쉬셋에 담는다 
			hs.add(num);
		}
		
		ArrayList<Integer> list = new ArrayList<>(hs); // arraylist에 해쉬셋들을 담아서 
		Collections.sort(list); // arraylist를 sort한다 
		for(Integer i : list) {
			System.out.print(i + " "); // sort완료한 것들을 출력 
		}
	}
}
