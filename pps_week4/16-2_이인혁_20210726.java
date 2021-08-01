package week4;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


//16-2
/*
public class FindDisappearedNum {
}
}


class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        ArrayList<Integer> arr = new ArrayList<>();
        int[] answer = new int[nums.length];
        for(int i=0; i<nums.length; i++){
            answer[nums[i]-1] = 1;
        }
        for(int i=0; i<answer.length; i++){
            if(answer[i] != 1)
                arr.add(i+1);    
        }
        return arr;
    }
}
*/