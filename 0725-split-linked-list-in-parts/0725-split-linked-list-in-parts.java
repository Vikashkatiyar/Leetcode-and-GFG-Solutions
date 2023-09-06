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
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans=new ListNode[k];
        
        ListNode temp=head;
        int totalLen=0;
        while(temp!=null){
            totalLen++;
            temp=temp.next;
        }
        
        int len=totalLen/k; //tatal len of each group list
        int discribe=totalLen%k;  //remaining elements which is left after making the group of same size
        
        ListNode prev=null;
        ListNode node=head;
        
        int i=0;
        while(node!=null && i<k){
            ans[i]=node;
            for(int j=0;j<len+(discribe>0?1:0);j++){
                
                prev=node;
                node=node.next;
                
            }
            
            prev.next=null;
            i++;
            discribe--;
            
        }
        return ans;
    }
}