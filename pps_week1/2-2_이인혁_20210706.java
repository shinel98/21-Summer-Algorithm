package week1;

import java.util.Scanner;




public class OXquiz {
	
	public static void main2_2(String[] args) {
		/*
	     입력값을 문자형 배열에 넣고 
	     
	     이하 반
	     배열의 현재값이 'O'면 sum에 1 더하기 
	     그 다음값으로 이동해서 현재 값이 'O'이고 이전 배열의 값이 'O'이면 index * 1 을 sum저장 
	     				   현재 값이 'X'이면 index = 0
	    */
		int sum, index;
		Scanner sc = new Scanner(System.in);
		int iter = sc.nextInt();
		
			
		for(int i=0; i<iter; i++) {
			String asw = sc.next();
			char[] answer= asw.toCharArray();
			sum =0;
			index = 1;
			for(int j=0; j<asw.length(); j++) {
				if(answer[j] == 'O') {
					sum+=index*1;
					index++;
				}
				else if(answer[j] == 'X') {
					index=1;
				}
			}
			System.out.println(sum);
		} 	
	}
}

