package week4;

//18-4
/*
public class LinkedCycle {

}

public class Solution {
	public boolean hasCycle(ListNode head) {
	    if (head == null) return false;
	    
	    ListNode cur = head;
	    ListNode slow = cur;
	    ListNode fast = cur.next;
	    
	    while (fast != null && fast.next != null) {
	        if (slow == fast) return true;
	       
	        slow = slow.next;
	
	        fast = fast.next.next;
	    }
	    return false;
	}
}
*/