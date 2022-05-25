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
    public ListNode sortList(ListNode head) {
       
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        while(head!=null){
            pq.add(head.val);
            head=head.next;
        }
        ListNode dummy=new ListNode();
        ListNode temp=dummy;
        while(pq.size()!=0){
            ListNode p=new ListNode();
            p.val=pq.remove();
            dummy.next=p;
            dummy=dummy.next;
        }
        return temp.next;
    }
}