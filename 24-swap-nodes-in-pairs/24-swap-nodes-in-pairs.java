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
    public ListNode swapPairs(ListNode head) {
        ListNode dummy=new ListNode(-1);
        dummy.next=head;
        ListNode node=dummy;
        
        while(node.next!=null && node.next.next!=null){
            ListNode first=node.next;
            ListNode second=first.next;
            ListNode secNext=second.next;
            
            node.next=second;
            second.next=first;
            first.next=secNext;
            
            node=first;
        }
        return dummy.next;
    }
}