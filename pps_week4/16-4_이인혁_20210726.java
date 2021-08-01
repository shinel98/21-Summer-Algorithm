package week4;


//16-4
/*
public class LongJump {
	public static void main(String[] args) {
		Solution sl = new Solution();
		long answer = sl.solution(1);
		System.out.print(answer);
	}
}

class Solution {
	  public long solution(int n) {
	      int[] dp = new int[2000];
	      
	      dp[0] = 1;
	      dp[1] = 2;
	      
	      for(int i=2; i<2000; i++){
	          dp[i] = (dp[i-2] + dp[i-1]) % 1234567;
	      }
	      return dp[n-1];
	  }
}


*/