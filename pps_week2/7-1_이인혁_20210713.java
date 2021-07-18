package week2;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class ArrangeMember {

	public static void main7_1(String[] args) {
		/*
		 횟수를 입력받는다
		 나이와 이름을 횟수만큼 입력받는다
		 나이순대로 정렬 
		 나이가 같다면 먼저 가입한 사람대로 정렬해서 출력
		 
		 linkedlist 로 객체들(node)을 잇고 나이들만 비교해서 나이순대로 정
		 */
	
		Scanner sc = new Scanner(System.in);
		ArrayList<Id> list = new ArrayList<>(); // Id의 객체를 담을  ArrayList 생성 
		int iter = sc.nextInt();  // 횟수 입력받기 
		for(int i=0; i<iter; i++) {
			int age = sc.nextInt(); // 나이 입력받고 
			String name = sc.next(); // 이름 입력받기 
			list.add(new Id(age, name)); // 입력받은 나이와 이름으로 Id 객체 생성하고 ArrayList에 담는다 
		}
		Collections.sort(list); 
		for(Id id : list) {
			System.out.println(id);
		}
		
	}
}

class Id implements Comparable<Id> { 
	private int age;
	private String name;
	
	public Id(int age, String name) {
		this.age = age;
		this.name = name;
	}
	
	@Override
	public int compareTo(Id id) {
		// TODO Auto-generated method stub
		return Integer.compare(this.age, id.age);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(this.age + " ");
		sb.append(this.name + " ");
		return sb.toString();
	}
}
