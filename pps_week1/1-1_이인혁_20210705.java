package week1;

import java.util.Scanner;

public class Scale {
	public static void main1_1(String[] args) {
		/*
		 * c,d,e,f,g,a,b,C 
		 * 1 2 3 4 5 6 7 8
		 
		 * 1부터 8까지 8가지의 숫자 입력받는다(배열)
		 * 만약 1부터 8까지의 숫자 차례대로 연주하면 acsending
		 * 	check = 0
		 *  7번 반복하면서 
		 *   하나씩 읽어오면서 만약 다음 숫자가 그 전 숫자의 +1 이 아니면 check = 1 
		 *   하나씩 읽어오면서 만약 다음 숫자가 그 전 숫자의 -1 이 아니면 check = 2	
		 *  check == 0 이면 ascending
		 *  check == 1 이면 descending
		 *  check == 2 이면 mixed
		 */
		int check = 0;
		int[] ary = new int[8];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<8; i++) {
			ary[i] = sc.nextInt();
		}	
		for(int i=0; i<ary.length-1; i++) {
			int num = ary[i];
			int nextnum = ary[i+1];
			int result = nextnum - num;
			if(result != 1) { 
				if(result != -1) {
					check = 2;
					break;
				}
				else 
					check = 1;
			}
		}
		if(check  == 0)
			System.out.print("ascending");
		else if(check == 1)
			System.out.print("descending");
		else 
			System.out.print("mixed");
	}
}