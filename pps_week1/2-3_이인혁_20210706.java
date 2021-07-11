package week1;

class Solution1 {
    public String longestCommonPrefix(String[] strs) {
    	if(strs == null) {
    		return "";
    	}
    	else if(strs.length == 1) {
    		return strs[0];
    	}
 
    		/*
    		 배열들끼리 비교후 만약 앞글자가 같으면 인덱스 증가 2개씩 비교  
    		 만약 문자열의 길이가 인덱스보다 적으면 break
    		 다르면 break 
    		 */
    		int j=0;
    		boolean check = true;
    		
    		while(true) {
    			for(int i=1; i<strs.length; i++) {
    				if(strs[i].length()<=j || strs[i-1].length() <=j || strs[i].charAt(j) != strs[i-1].charAt(j)) {
    					check = false;
    					break;
    				}
    			}
    			if(check == true) 
    				j++;
    			else 
    				break;
    		}
    	
    	return strs[0].substring(0,j);
    }
}
