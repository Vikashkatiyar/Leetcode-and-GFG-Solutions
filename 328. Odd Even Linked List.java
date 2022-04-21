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
    public ListNode oddEvenList(ListNode head) {
        if(head==null){
            return head;
        }
        if(head.next==null){
             return head;
        }
        ListNode end=head;
        int count=0;
        while(end.next!=null){
            end=end.next;
            count++;
        }
        int counter=(count%2==0)?(count/2):((count/2)+1);
        ListNode temp=head;
        while(counter!=0){
            end.next=temp.next;
            temp.next=temp.next.next;
            end.next.next=null;
            
            temp=temp.next;
            end=end.next;
            counter--;
        }
        return head;
    }
}


//second method of this question 



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
    public ListNode oddEvenList(ListNode head) {
        if(head==null){
            return head;
        }
        if(head.next==null){
             return head;
        }
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;
        
        while(even!=null && even.next!=null){
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }
        
        odd.next = evenHead;
        
        return head;
    }
}
