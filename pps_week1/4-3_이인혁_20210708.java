package week1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Remainder {
	public static void main4_3(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean[] ary = new boolean[42];
		int count = 0;
		
		for(int i=0; i<10; i++) {
			ary[Integer.parseInt(br.readLine())%42] = true;
		}
		for(boolean check : ary) {
			if(check)
				count++;
		}
		System.out.println(count);
	}
}
