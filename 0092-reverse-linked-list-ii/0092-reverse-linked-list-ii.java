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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head==null){
            return head;
        }
        
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        
        ListNode pre=dummy;
        for(int i=0;i<left-1;i++){
            pre=pre.next;
        }
        ListNode start=pre.next;
        ListNode last=start.next;
        
        
        for(int i=0;i<right-left;i++){
            start.next=last.next;
            last.next=pre.next;
            pre.next=last;
            last=start.next;
        }
        
        return dummy.next;
    }
}