package week2;

import java.io.*;
import java.util.StringTokenizer;

public class FastAPlusB {

	public static void main8_8(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int iter = Integer.parseInt(br.readLine());
		
		for(int i=0; i<iter; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());
			int B = Integer.parseInt(st.nextToken());
//			int result = A+B;
			bw.write(String.valueOf(A+B));
			bw.newLine();
			
		}
		bw.flush();
		bw.close();
	}	

}
