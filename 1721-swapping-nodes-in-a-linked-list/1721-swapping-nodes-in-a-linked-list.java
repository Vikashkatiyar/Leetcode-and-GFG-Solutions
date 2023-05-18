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
    //Jai Baba Bhole
    public ListNode swapNodes(ListNode head, int k) {
        k=k-1;
        ListNode first=head;
        while(k-->0){
            first=first.next;
        }
        ListNode f=first;
        
        ListNode second=head;
        while(first.next!=null){
            first=first.next;
            second=second.next;
        }
        
        int temp=second.val;
        second.val=f.val;
        f.val=temp;
        return head;
    }
}