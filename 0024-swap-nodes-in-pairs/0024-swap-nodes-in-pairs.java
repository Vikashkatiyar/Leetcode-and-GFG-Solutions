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
        
        
        Stack<ListNode> st=new Stack<>();
        
        ListNode dummy=new ListNode(-1);
        ListNode curr=dummy;
        
        ListNode temp=head;
        
        while(temp!=null){
            if(st.size()==2){
               while(!st.isEmpty()){
                   curr.next=st.pop();
                   curr=curr.next;
               }
            }
            st.push(temp);
            temp=temp.next;
            
        }
        
         while(!st.isEmpty()){
                   curr.next=st.pop();
                   curr=curr.next;
               }
        curr.next=null;
        
       return dummy.next;
    }
}