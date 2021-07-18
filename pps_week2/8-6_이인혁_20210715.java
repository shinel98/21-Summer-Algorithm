package week2;

// 8-6

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        for(int i=0; i<nums.length; i++) {
        	if(nums[i] == target) 
        		return i;
        	else if(i+1 < nums.length && nums[i] < target && target < nums[i+1])
        		return i+1;
        	else if(target < nums[0]) 
        		return 0;
        	else if(target > nums[nums.length-1])
        		return nums.length;
        	
        }
        return -1;
    }
}
