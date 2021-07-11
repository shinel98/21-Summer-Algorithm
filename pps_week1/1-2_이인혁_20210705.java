package week1;

public class Skilltree {
	public static void main1_2(String[] args) {
		/*
		 * 문자열을 입력받는다. 
		 * 그 문자열의 각요소를 배열에 넣어서
		 * 	문자열의 길이만큼 반복해서 각 문자들을 배열에 넣어주기   
		 * 새로 주어지는 값들을 이 배열의 값들과 비교 
		 */
		int answer;
		String[] skill_trees = {"BACDE", "CBADF", "AECB", "BDA"};
		Solution sol = new Solution();
		answer = sol.solution("CBD", skill_trees);
		System.out.println(answer);
	}
}

class Solution {
    public int solution(String skill, String[] skill_trees) {
        char[] sol_array = new char[skill.length()]; // 문자열의 길이만큼의 문자 담을 배열 생성 
        int i,j,k,l=0;
        int answer=0;
        int[] included= new int[skill_trees.length];
        
        for(i=0; i<skill.length(); i++) {
        	sol_array[i] = skill.charAt(i); //각 인덱스의 문자값을 문자 배열에 넣기 
        }
        
        for(i=0; i<skill_trees.length; i++) {
        	for(j=0; j<skill_trees[i].length(); j++) {
        		for(k=0; k <skill.length(); k++) {
        			if(sol_array[k] == skill_trees[i].charAt(j)) {
        				included[l]++;
        			}
        		}
        	}   
        	l++;
        }
        
        l=0;
        k=0;
        /*
         "BACDE", "CBADF", "AECB", "BDA"
		 
		 "CBD"
         */
        for(i=0; i<skill_trees.length; i++) { // 4
        	for(j=0; j<skill_trees[i].length(); j++) { // 5
        		if(sol_array[k] == skill_trees[i].charAt(j)) {
        			k++;
        			if(k == skill.length())
        				break;
        		}
        	}
       
         	if(k == included[l]) {
         		answer++;
         	}
         	l++;
        	k=0;
        }
       
        return answer;
    }
}