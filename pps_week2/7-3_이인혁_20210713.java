package week2;

import java.util.Arrays;

/*7-3*/

class Solution {
    public int majorityElement(int[] nums) {
    /*  
     	Arrays.sort(nums);// 정렬하고 
    	return nums[nums.length/2];
    */
    	int count=0;
    	int max=0;
    	int element=0;
    	
    	Arrays.sort(nums);
    	if(nums.length == 1)
    		return nums[0];
    	
    	for(int i=0; i<nums.length-1; i++) { 
    		if(nums[i] == nums[i+1]) {
    			count++;
    			if(count >= nums.length/2)
    				return nums[i];
    		}
    		else {
    			if(count > max) {
    				max = count;
    				count = 1;
    				element = nums[i];
    			}
    		}
    	}
    	return element;
    }
}