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
        ListNode prev=null;
        ListNode curr=head;
        
        while(head!=null){
            head=curr.next;
            curr.next=prev;
            prev=curr;
            curr=head;
        }
        
        return prev;
    }
    public ListNode doubleIt(ListNode head) {
        ListNode rev=reverse(head);
        ListNode temp=rev;
        ListNode prev=null;
        int hasil=0;
        
        while(temp!=null){
            int fullNum=(temp.val*2)+hasil;
            temp.val=fullNum%10;
            hasil=fullNum/10;
            
            prev=temp;
            temp=temp.next;
        }
        
        while(hasil!=0){
            ListNode newNode=new ListNode(hasil%10);
            hasil=hasil/10;
            prev.next=newNode;
            prev=prev.next;
        }
        
        return reverse(rev);
    }
}