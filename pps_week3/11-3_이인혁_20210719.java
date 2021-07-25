package week3;

import java.util.ArrayList;

// 11-3


// 1번째 방법 
/*
class RangeSum {
	ArrayList<Integer> numarray = new ArrayList<Integer>();
    public RangeSum(int[] nums) {
    	
    	for(int i=0; i<nums.length; i++) {
    		numarray.add(nums[i]);
    	}
    }
    
    public int sumRange(int left, int right) {
        int total = 0;
    	for(int i=left; i<=right; i++) {
        	total += numarray.get(i);
        }
    	return total;
    }
}*/


// 2번째 방법 
/*
class RangeSum{
	int[] arr;
	public RangeSum(int[] nums) {
		arr = new int[nums.length+1];
		for(int i=1; i<nums.length+1; i++) {
			arr[i] = arr[i-1] + nums[i-1];
		}
	}
	public int sumRange(int left, int right) {
		return arr[right+1] - arr[left];
	}
}
*/