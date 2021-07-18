package week2;

//import java.util.Arrays;
import java.util.Scanner;
import java.util.Queue;
import java.util.LinkedList;

public class FlipCard {

	public static void main6_1(String[] args) {
		 
		/*Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();  //카드 개수 입력 
		int[] arr = new int[num];  //카드 개수만큼의 길이 배열 생성  
		
		if(num == 1) {// 만약 1을 입력했으면 1 출력  
			System.out.println(1);
			return;
		}
	
	
		for(int i=1; i<=num; i++) 
			arr[i-1] = i; // 입력한 카드의 갯수만큼 1부터 해당 숫자까지 배열에 담는다  
		
		String cards = Arrays.toString(arr).replaceAll("[^0-9]",""); // 배열을 문자열로 변환  
		while(true) {
			cards = cards.substring(1); // 제일 위에 있는 카드 삭제   
			cards += cards.charAt(0); //  두번째 카드를 맨 밑으로 복사해 보내기
			cards = cards.substring(1); // 두번째 카드 삭제
			if(cards.length() < 3) { // 만약 남은 카드 갯수가 3장 미만이면 맨 뒤에 있는 카드 숫자 출력 
				System.out.println(cards.charAt(cards.length()-1));
				break;
			}
		}
		*/
		// 위와 같은 방법으로는 메모리 초과 발생
		Scanner sc = new Scanner(System.in); 		
		Queue<Integer> q = new LinkedList<>(); // 큐 만들기  
		
		int num = sc.nextInt(); // 카드 갯수 입력받기  
		for(int i=1; i<=num; i++)
			q.offer(i); // 큐에  입력한 카드갯수만큼  1부터 넣어주기 
		while(q.size() > 1) { //카드가 1장 남을 때까지  
			q.poll(); //  제일 위에 있는 카드 꺼내기 
			q.offer(q.poll()); // 그 다음 위에 있는 카드를 꺼내어 맨 뒤에 다시 넣어주기 
		}
		System.out.println(q.poll()); // 1장 남은 카드 출력  
	}
}
