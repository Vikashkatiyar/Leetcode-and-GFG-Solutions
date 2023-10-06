//{ Driver Code Starts
// driver

import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class GfG{
    
    static void printList(Node n){
        while(n!=null){
            System.out.print(n.data+" ");
            n = n.next;
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        
        while (T-- > 0) {
            
            int n = sc.nextInt();
            int val = sc.nextInt();
            
            Node first = new Node(val);
            Node tail = first;
            for(int i=0; i<n-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            int m = sc.nextInt();
            val = sc.nextInt();
            
            Node second = new Node(val);
            tail = second;
            for(int i=0; i<m-1; i++)
            {
                val = sc.nextInt();
                tail.next = new Node(val);
                tail = tail.next;
            }
            
            Solution g = new Solution();
            Node res = g.addTwoLists(first, second);
            printList(res);
        }
    }
}

// } Driver Code Ends


/* node for linked list

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

*/

class Solution{
    //Function to add two numbers represented by linked list.
    static Node addTwoLists(Node first, Node second) {
        Node temp1 = reverseFun(first);
        Node temp2 = reverseFun(second);
        
        Node dummy = new Node(0);
        Node tail = dummy;
        int carry = 0;
        
         while(temp1 != null || temp2 != null){
            int x = (temp1 != null) ? temp1.data : 0;
            int y = (temp2 != null) ? temp2.data : 0;
            int sum = carry + x + y;
            carry = sum  / 10;
            tail.next = new Node(sum % 10);
            tail = tail.next;
            if(temp1 != null)
                temp1 = temp1.next;
            
            if(temp2 != null)
                temp2 = temp2.next;
        }
        if(carry > 0)
            tail.next = new Node(carry);
    
    
        Node result = reverseFun(dummy.next);
        return result;    
        
    }
    static Node reverseFun(Node head){
            Node current = head;
            Node previous = null;
            Node temp = null;
            while(current != null){
                temp = current.next;
                current.next = previous;
                previous = current;
                current = temp;
            }
            return previous;
    }
    
}