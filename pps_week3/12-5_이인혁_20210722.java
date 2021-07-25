package week3;

// 12-5

/*
public class NextGreaterElement {

}

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int len = nums1.length;
        int len2 = nums2.length;
        int[] result = new int[len];
        HashMap<Integer,Integer> map = new HashMap<Integer,Integer>();
        for(int i=0;i<len2;i++){
            map.put(nums2[i],i);
        }
        for(int i=0;i<len;i++){
            int j= map.get(nums1[i]);
            for(;j<len2;j++){
                if(nums1[i]<nums2[j]){
                    break;
                }
            }
            result[i]= j==len2?-1:nums2[j];
        }
        return result;
    }
}
*/