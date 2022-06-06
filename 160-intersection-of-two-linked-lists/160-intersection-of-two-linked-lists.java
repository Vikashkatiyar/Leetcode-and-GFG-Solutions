/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    
    public static int size(ListNode node){
        int count=0;
        ListNode temp=node;
        while(temp!=null){
            temp=temp.next;
            count++;
        }
        return count;
    }
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;
        ListNode t1=headA;
        ListNode t2=headB;
        
        int lent1=size(headA);
        int lent2=size(headB);
        
        int diff=Math.abs(lent1-lent2);
        
        if(lent1>lent2){
            for(int i=0;i<diff;i++){
                t1=t1.next;
            }
        }else{
                        
            for(int i=0;i<diff;i++){
                            t2=t2.next;
                        }
        }
        
        while(t1!=t2){
            t1=t1.next;
            t2=t2.next;
            if(t1==null || t2==null){
                return null ;
            }
            
        }
        return t1;
		// while (t1 != null) {
		// 				if (t1 == t2)
		// return t1;
		// 				t1 = t1.next;
		// 				t2 = t2.next;
		// }
		// return null;
        
      

        
    }
}