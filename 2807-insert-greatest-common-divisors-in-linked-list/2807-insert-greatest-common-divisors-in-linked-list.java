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
    public int findGcd(int a,int b){
         if (b == 0)
            return a;
        else
            return findGcd(b, a % b);
    }
    
    
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode first=head;
        ListNode sec=head.next;
        
        while(sec!=null){
            ListNode gcd=new ListNode(findGcd(first.val,sec.val));
            first.next=gcd;
            gcd.next=sec;
            first=sec;
            sec=sec.next;
        }
        return head;
    }
}