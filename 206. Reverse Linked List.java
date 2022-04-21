/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if(head == null) return head;
    	
    	ListNode next = head.next;
    	head.next = null;
        
    	while(next != null){
        	ListNode temp = next.next;
        	next.next = head;
        	head = next;
        	next = temp;
        }
    	return head;
    }
}
