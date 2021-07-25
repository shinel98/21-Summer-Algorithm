package week3;

import java.util.Arrays;
import java.util.Collections;




// 11-4
/*
public class LargetPerimeter {

	public static void main(String[] args) {
		
	}

}
class Solution {
    public int largestPerimeter(int[] nums) {
    	
    	Integer[] conv = Arrays.stream(nums).boxed().toArray(Integer[]::new);
    	Arrays.sort(conv, Collections.reverseOrder());
    	for(int i=0; i<conv.length-2; i++) {
    		if(conv[i] < conv[i+1] + conv[i+2])
    			return conv[i] + conv[i+1] + conv[i+2];
    	}
    	return 0;
}
*/