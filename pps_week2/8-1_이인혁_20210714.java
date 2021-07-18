package week2;
// 8-1
public class CookieBasket {
    public int solution(int[] cookie) {
    	int leftIndex = 0;
        int rightIndex = 0;
        int rightSum = 0;
        int leftSum = 0;
        int max_answer = 0;
        
        for(int i=0; i<cookie.length-1; i++) {
        	leftIndex = i;
        	leftSum = cookie[i];
        	rightIndex = i+1;
        	rightSum = cookie[i+1];
        	
        	while(true) {
        		if(rightSum == leftSum && max_answer < rightSum)
        			max_answer = rightSum;
        		if(leftIndex > 0 && leftSum <= rightSum) {
        			leftIndex--;
        			leftSum += cookie[leftIndex];
        		}
        		else if(rightIndex < cookie.length-1 && leftSum >= rightSum) {
        			rightIndex++;
        			rightSum += cookie[rightIndex];
        		}
        		else 
        			break;
        	}
        }
        return max_answer;
    }
}