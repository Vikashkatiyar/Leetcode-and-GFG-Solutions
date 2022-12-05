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
    public ListNode findMid(ListNode head){
        ListNode slow=head;
        ListNode fast=head;
        
        while(fast!=null && fast.next!=null){
            
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    
    public ListNode reverse(ListNode head){
        ListNode tail = null;
        while (head != null) {
            ListNode tmp = head.next;
            head.next = tail;
            tail = head;
            head = tmp;
        }
        return tail;
    }
    public int pairSum(ListNode head) {
        ListNode slow=findMid(head);
        slow=reverse(slow);
        int ans=0;
        while(slow!=null){
            ans=Math.max(ans,head.val+slow.val);
            head=head.next;
            slow=slow.next;
        }
        return ans;
    }
}