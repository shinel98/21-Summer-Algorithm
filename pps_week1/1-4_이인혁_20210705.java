package week1;
import java.util.Scanner;

public class Average {
	public static void main1_4(String[] args) {
		/*
		 * get the number of test cases at first
		 * and then, get the number of students with the scores followed (the scores must be bigger than or equal to 0 smaller than or equal to 100)
		 * get the average, and get the students number bigger than average, get the ratio(rounds until the third)
		 */
		int i=0 , j;
		int total=0;
		double average;
		int[] scores;
		int count=0;
		double ratio;
		
		Scanner sc = new Scanner(System.in);
		int total_iter = sc.nextInt();
		while(i < total_iter) {
			
			int inner_iter = sc.nextInt();
			scores = new int[inner_iter]; // 내부 배열 선언
			
			for(j=0; j<inner_iter; j++) {
				scores[j] = sc.nextInt();
				total += scores[j];
				//System.out.println(total);
			}
			
			average = total*(1.0) / inner_iter;
			//System.out.println(average);
			for(j=0; j<inner_iter; j++) {
				if(average < scores[j]) {
					count++;
				}
			}
			ratio = count*(1.0) / inner_iter * 100;
			System.out.printf("%.3f%%\n", ratio);
			i++;
			total=0;
			count=0;
		}
	}
}
