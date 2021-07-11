package week1;

import java.util.Arrays;

public class Cookie {
	public static void main1_3(String[] args) {
		// TODO Auto-generated method stu
		int[] g = {1,1,2,3};
		int[] s = {1,2};

		Solved sl  = new Solved();
		int answer = sl.findContentChildren(g, s);
		System.out.print(answer);
	}

}

class Solved {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        
        	
        int index_g = 0;
        int index_s = 0;
        while (index_g < g.length && index_s < s.length) {
            if (g[index_g] <= s[index_s]) {
                index_g++;
            }
            index_s++;
        }
        return index_g;
    }
}