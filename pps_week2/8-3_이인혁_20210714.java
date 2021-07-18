package week2;

import java.util.ArrayList;



/* 
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
 */

// 8-3


public class ReversedLinkedList {
    public ListNode reverseList(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
    	ListNode node = head;
    	
    	while(node != null){
    		list.add(node.val);
    		node = node.next;
    	}
    	ListNode new_head = new ListNode();
    	for(int i=0; i<list.size(); i++) {
    		ListNode prenode = new ListNode(list.get(i));
    		if(new_head.next == null)
    			new_head.next = prenode;
    		else {
    			prenode.next = new_head.next;
    			new_head.next = prenode;
    		}
    	}
    	return new_head.next;
    
    }
}
