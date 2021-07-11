package week1;

import java.util.Scanner;

public class StudentAttendance {

	public static void main3_1(String[] args) {
		/*
		 배열에 문자를 하나씩 넣
		 문자열이 주어지면  A가 2개 이상이면 false
		 	A가 나오면 count++ 
		 	count 가 2면 false
		 L이 3번 연속으로 나오면 false
		 	i,i+1,i+2 index의 값이 같으면 flag = false
		 */
		Scanner sc = new Scanner(System.in);
		Solution2 result = new Solution2();
		boolean f = result.checkRecord("LLPPPLL");
		System.out.println(f);
	}
}
class Solution2 {
    public boolean checkRecord(String s) {
    	int count=0;
    	boolean flag = true;
    	char[] sentence = s.toCharArray();
    	for(int i=0; i<sentence.length; i++) {
    		if(sentence[i] == 'A')
    			count++;
    		if(count == 2)
    			flag = false;
    		
    		if(i+2 < sentence.length && sentence[i] == 'L' &&(sentence[i] == sentence[i+1] && sentence[i+1] == sentence[i+2]))
    			flag = false;
    	}
    	return flag;
    }
}
