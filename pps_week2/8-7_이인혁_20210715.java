package week2;


import java.util.Arrays;
import java.util.Scanner;

public class FindNumber {

	public static void main8_7(String[] args) {
		Scanner sc= new Scanner(System.in);
		int iter = sc.nextInt();
		int[] first_arr = new int[iter]; // 횟수 입력받기  
		
		for(int i=0; i<iter; i++) {
			first_arr[i] = sc.nextInt();
		} // 입력받기 
		
		Arrays.sort(first_arr); //  정렬 
		
		int iter2 = sc.nextInt();
		for(int i=0; i<iter2; i++) {
			int target = sc.nextInt();
			int left = 0;
			int right = first_arr.length-1;
			boolean flag = false;
			while(left <= right) {
				int middle = (left+right)/2;
				if(target < first_arr[middle]) {
					right = middle-1;
				}
				else if(target > first_arr[middle]) {
					left = middle+1;
				}
				else {
					flag = true;
					System.out.println(1);
					break;
				}
			}
			if(flag == false)
				System.out.println(0);
		}
	}
}