package week2;

import java.util.ArrayList;

/*
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
/*
	6-4
 */
/*
class Palindrome {
    public boolean isPalindrome(ListNode head) {
    	
    	ArrayList<Integer> list = new ArrayList<>();
    	ListNode node = head;
    	boolean result = true;
    	while(node != null) {
    		list.add(node.val);
    		node = node.next;
    	}
    	for(int i=0; i<list.size()/2; i++) {
    		if(list.get(i) != list.get(list.size()-i-1)){
    			result = false;
    			break;
    		}
    	}
    	return result;
    }
}*/