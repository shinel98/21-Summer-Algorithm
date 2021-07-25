package week3;

// 12-4
/*
class MiddleLinkedList {
	
}
class Solution{
    public ListNode middleNode(ListNode head) {
        if(head == null){
            return null;
        }
        if (head.next == null){
            return head;
        }
        int cnt = 1; // chain length
        ListNode cur = head;
        while (cur != null){
            cur = cur.next;
            cnt++;
        }
        int mid = 0; // intermediate node
        if (cnt % 2 != 0){  // odd
            mid = (cnt - 1) / 2;
        }else {             // is even
            mid = cnt / 2 - 1;
        }
        cur = head;
        while (mid != 0){
            cur = cur.next;
            mid --;
        }
        return cur;
    }
}
*/