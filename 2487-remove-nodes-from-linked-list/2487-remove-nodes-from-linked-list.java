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
    
    public ListNode reverse(ListNode head){
        if(head==null){
            return head;
        }
        
        ListNode curr=head.next;
        head.next=null;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=head;
            head=curr;
            curr=temp;
        }
        return head;
    }
    public ListNode removeNodes(ListNode head) {
        if(head==null){
            return head;
        }
        head=reverse(head);
        ListNode temp=head;
        while(temp.next!=null){
            if(temp.val>temp.next.val){
                temp.next=temp.next.next;
            }
            else{
                temp=temp.next;
            }
        }
        
        return reverse(head);
    }
    
    
}