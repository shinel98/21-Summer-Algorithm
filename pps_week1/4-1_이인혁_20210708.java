package week1;

import java.util.Scanner;

public class Cooker {

	public static void main4_1(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] sum = new int[5];
		int max=0;
		int max_index = 0;
		int[][] array = new int[5][4];
		for(int i=0; i<5; i++) {
			for(int j=0; j<4; j++) {
				array[i][j] = sc.nextInt();
				sum[i] += array[i][j];
			}
			if(sum[i]>max) {
				max = sum[i];
				max_index = i;
			}
		}
		System.out.println(max_index+1 + " " + max);
	}
}
