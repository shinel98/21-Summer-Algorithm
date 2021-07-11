package week1;
import java.util.Scanner;

public class Password {

	public static void main2_1(String[] args) {
		/*
		 * the word will be given 
		 * put the word into the array
		 * include at least one vowel (aeiou)
		 * 	compare each word in the word with a,e,i,o,u and if there exists check = 1
		 * there should be no more than three words of vowels and consonant in a row 
		 * 	compare the word with a,e,i,o,u and if it is same count++
		 *   if the word == a, e , i ,o ,u check = 1
		 *   make an array to check whether it is the same type  
		 * 	if(count >2 ) check= 1
		 * no word in a row allowed except for 'ee' and 'oo' 
		 * compare the word with the word right before the word and if it is same and not 'ee' or 'oo' check = 1
		 * if check = 1 not acceptable
		 * else acceptable 
		 */
		
			Scanner sc = new Scanner(System.in);
		while(true) {
			
			String pw = sc.next(); // the password that user input
			if(pw.equals("end"))
				break;
			int check = 0;
			char[] pw_array = pw.toCharArray();// convert to array
			char[] overlap = pw.toCharArray();// convert to array
			
				
			for(int i=0; i<pw.length(); i++) {
				overlap[i] = '0';
			}
			// initialize every contents to zero == consider as consonant
			
			int j=0;
			for(char p : pw_array) {
				switch(p) {
				case 'a': 
				case 'e':
				case 'i': 
				case 'o':
				case 'u': 
					check = 1;
					overlap[j] = '1';
				} // if check == 1, there is at least on vowel 
				  // if overlap[i] = 1 it is vowel (if vowel then 1 else 0)
				j++;
			}
			for(int i=0; i<pw.length(); i++) {
				if(i+2 < pw.length()) { // if the last index is smaller than the length of the word
					if(overlap[i] == overlap[i+1] && overlap[i+1]== overlap[i+2])  // if there are three same type of words in a row
						check = 0;
				}
			}
			
			
		    for(int i=0; i<pw.length(); i++) {
		    	if(i+1 < pw.length()) {
		    		if(pw_array[i] == pw_array[i+1]) {
		    			if(pw_array[i] == 'e' || pw_array[i] == 'o') {
		    				check = 1;
		    			}
		    			else 
		    				check = 0;
		    		}
		    	}
		    }
		    
		    if(check == 1)
				System.out.println("<" + pw + ">" + " is acceptable.");
			else
				System.out.println("<" + pw + ">" + " is not acceptable.");			
		}
		
	}
}



