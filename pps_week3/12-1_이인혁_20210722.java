
package week3;

//12-1
/*
class Solution {
    public int[] sortArrayByParityII(int[] nums) {
    	int check = 0;
    	int pre_index = 0;
    	for(int i=0; i<nums.length; i++) {
    		if(nums[i]%2==0&&i%2==1) {
    			check = 1;
    			pre_index = i;
    			if(check == 1)
    				for(int j=i; j<nums.length; j++) {
    					if(nums[j]%2==1&&j%2==0)  {
    						int temp = nums[pre_index];
    						nums[pre_index] = nums[j];
    						nums[j] = temp;
    						check = 0;
    					}
    				}
    		}
    	}
    	for(int i=0; i<nums.length; i++) {
    		if(nums[i]%2==1&&i%2==0) {
    			check = 1;
    			pre_index = i;
    			if(check == 1)
    				for(int j=i; j<nums.length; j++) {
    					if(nums[j]%2==0&&j%2==1)  {
    						int temp = nums[pre_index];
    						nums[pre_index] = nums[j];
    						nums[j] = temp;
    						check = 0;
    					}
    				}
    		}
    	}
    	return nums;
    }
}
*/