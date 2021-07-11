package week1;

import java.util.Scanner;

public class WomensPresident {
	public static void main4_4(String[] args) {
		/*
		k층 n호 에는 k-1층의 1~n호에 사는 사람들의 합이 
		아파트는 0층부터 시작 0층의 i호에는 i명이 산다
		
		만약 1층의 3호면
		1+2+3
		
		    1호 2호 3호 
		0층  1  2  3
		1층  1  3  6
		2층  1  4  10
		
		2층의 3호는 0층의 1+2+3 + 1층의 1+3+6
		처음에는 총 반복횟수 입력받기
		그다음에 층 입력받기
		호수 입력받기
			층이랑 호수로 이차원 배열 만들
			만약 호수가 1이면 1 
			호수가 1보다 크면 
				int total
				호수만큼 반복하면서 
					total += ary[층-1][i]
		*/
		Scanner sc = new Scanner(System.in);
		int iter = sc.nextInt();
	
		for(int count=0; count<iter; count++) {
			int floor = sc.nextInt(); // 층 
			int room = sc.nextInt(); // 호수 
			int[][] everyRoom = new int[floor+1][room];
			//int total=0;
			for(int i=0; i<room; i++) {
				everyRoom[0][i] = i+1; // 입력받은 room만큼 0층 호수 인원 채워넣기  ,, 참고 : 1호 index 0 
			}
			for(int i=1; i<floor+1; i++) {
				for(int j=0; j<room; j++) {
					for(int k=-1; k<j; k++) {
						everyRoom[i][j] += everyRoom[i-1][k+1];
					}
				}
			}
			System.out.println(everyRoom[floor][room-1]);		
		}
	}
}
