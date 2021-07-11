package week1;

import java.util.Scanner;

public class GroupWordCheck {

	public static void main2_6(String[] args) {
		/*
	    	ccazzzbb (o) 
	    	cazba (x)
	    	
	    	
	    	반복횟수 입력받고 횟수만큼 전체 반
	        
	        int[] answer = new int[26]
	        문자열의 한문자씩 읽어오면서 다음 문자와 같으면 index만 이동,  다음문자는 문자열.length보다 작아야함 
	    	다르면 answer[해당 알파벳-'a'] 이 1인지 확인  
	    	1이면 flag = 1
	   		1이 아니면 answer[해당 알파벳-'a'] = 1
	    	
	    	flag == 0 이면 count++
	    	
		 */
		Scanner sc = new Scanner(System.in);
		int iter = sc.nextInt();
		int count = 0;
		for(int i=0; i<iter; i++) {
			String sentence = sc.next();
			char[] arr = sentence.toCharArray();
			int[] answer = new int[26];
			int flag = 0;
			for(int j=0; j<arr.length; j++) {
				if(j+1 < sentence.length() && arr[j] == arr[j+1] )
					continue;
				else {
					if(answer[arr[j]-'a'] == 1) {
						flag = 1;
						break;
					}
					else answer[arr[j]-'a'] = 1;
				}
			}
			if(flag == 0)
				count++;
		}
		System.out.println(count);
	}
}
