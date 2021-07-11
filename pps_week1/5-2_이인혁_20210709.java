package week1;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class MarsMath {
	public static void main5_2(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		int iter= Integer.parseInt(bf.readLine());
		for(int i=0; i<iter; i++) {
			StringTokenizer st = new StringTokenizer(bf.readLine());
			double num = Double.parseDouble(st.nextToken());
			while(st.hasMoreTokens()){
				String operator = st.nextToken();
				if(operator.equals("@"))
					num *= 3;
				else if(operator.equals("%"))
					num += 5;
				else if(operator.equals("#"))
					num -= 7;
			}
			System.out.printf("%.2f\n", num);
		}	
	}
}
