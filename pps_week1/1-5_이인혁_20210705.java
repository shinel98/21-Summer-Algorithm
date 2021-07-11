package week1;

//1-5

class PlusOne {
    public int[] plusOne(int[] digits) {
    	int lastIndex = digits.length-1;
    	
    	for(int i= lastIndex; i>=0; i--) { // 각 배열의 숫자에 접근  
    		digits[i] += 1; //  각 자릿수에 1씩 더하기  
    		if(digits[i] < 10) // 만약 더한 값이 10미만 이면 
    			return digits;  // 그대로 전체 배열 return
    		digits[i] = 0;  // 10이상이면 해당 자릿수의 숫자를 0으로 초기화 
    	}
    	//  만약 반복문을 다 진행했는데도 return이 되지 않았으면 (ex. [9,9,9] -> [0,0,0] )
    	int[] newDigits = new int[digits.length+1];  //  길이가 하나 더 긴 배열 선언  
    	newDigits[0] = 1;
    	return newDigits;  // 자바는 배열 0 으로 자동 초기화 
    }
}