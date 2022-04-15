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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy=new ListNode(-1);
        ListNode head=dummy,tail=dummy;
        
        int carry=0;
        while(l1!=null || l2!=null || carry>0){
            int d1=(l1==null)?0:l1.val;
            int d2=(l2==null)?0:l2.val;
            
            ListNode res=new ListNode((d1+d2+carry)%10);
            carry=(d1+d2+carry)/10;
            
            tail.next=res;
            tail=res;
            
            if(l1!=null)
                l1=l1.next;
            if(l2!=null)
                l2=l2.next;
        }
        return dummy.next;
    }
}
