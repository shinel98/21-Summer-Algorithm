package week2;

import java.util.Scanner;

public class JosephusGame {

	public static void main6_2(String[] args) {
		/*
		K와 N 이 주어지면 K인원이 원을 만들어 N 번째 사람을 계속해서 죽이는 게임 
		
	 	1부터 K 만큼의 숫자를 배열에 넣어준다 arr[]
	 	i=0
	 	int flag = 0;
	    while(1){
	    	if(check == 0)
	    		j++
	    		if(j % N == 0)
	    			check = 1
	    			print(arr[i/N])
	    			j=0;
	    	i++
	    	for(int i=0; i<arr.length; i++)
	    		if(check[i] == 0)
	    		flag =1;
	    		
	    	if(flag == 0)
	    	break;
	   	}
		*/
		Scanner sc = new Scanner(System.in);
	
		int K = sc.nextInt();
		int N = sc.nextInt();
		int[] arr = new int[K]; //  게임에 참여한 사람들 
		int[] check = new int[K]; // 죽었는지 살았는지 체크하는 배열 
		for(int i=0; i<K; i++) // 1부터 입력받은 숫자까지의 숫자들을 배열에 넣어준다 
			arr[i] = i+1;
		
		int flag = 0; // 전부 죽었는지 확인해주는 변수 
		
		int i=0;
		int j=0;
		int count=0; //출력 양식을 맞춰주기 위한 변수  
		System.out.print("<"); 
		while(true) {
			flag = 0;
			if(check[i%K] == 0) { // 만약 살아있는 사람이라면  
				j++;
				if(j%N == 0) { //  살아있는 사람 중 입력받은 숫자에 해당하는 사람 (죽을 사람)
					if(count== K-1) {// 만약 K-1까지의 숫자를 출력했으면 서식을 바꿔서 출력  
						System.out.print(arr[i%K]);
					}
					else {
						System.out.print(arr[i%K] +", ");
						count++;
					}
					check[i%K] = 1;
					j=0;
					
				}
			}
			i++;
			for(int k=0; k<arr.length; k++) // 아직 살아있는 사람이 있는지 체크 
				if(check[k] == 0) // 만약 살아있는 사람이 있으면 
					flag = 1;
			if(flag == 0)
				break;
		}
		System.out.println(">");
	}

}