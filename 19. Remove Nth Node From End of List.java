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
    public ListNode removeNthFromEnd(ListNode head, int n) {
//         ListNode fir=head;
//         int count=0;
//         while(fir!=null){
//             fir=fir.next;
//             count++;
//         }
//         int k=count-n;
//         ListNode f=head;
//         while(k>0){
//               f=f.next;
//               k--;
//         }
        
//         f.next=f.next.next;
        
//         return head;
        
        
        ListNode fast=head;
        ListNode slow=head;
        while(n>0){
            fast=fast.next;
            n--;
        }
        if(fast==null){
            return head.next;
        }
        while(fast.next!=null){
            fast=fast.next;
            slow=slow.next;
        }
        slow.next=slow.next.next;
        
        return head;
    }
}
