//{ Driver Code Starts
//Initial Template for Java

import java.util.*;
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
class Zeroes{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
            int n=sc.nextInt();
            Node head=null;
            Node curr=null;
            while(n-->0){
                int a=sc.nextInt();
                if(head==null){
                    head=new Node(a);
                    curr=head;
                }
                else{
                    Node temp=new Node(a);
                    temp.next=null;
                    curr.next=temp;
                    curr=temp;
                }
            }
            GfG g=new GfG();
            head = g.moveZeroes(head);
            while(head!=null){
                System.out.print(head.data+" ");
                head=head.next;
            }
            System.out.println();
        }
    }
}


// } Driver Code Ends


//User function Template for Java

/*
class Node{
    int data;
    Node next;
    Node(int d){
        data=d;
        next=null;
    }
}
*/

class GfG{
    public Node moveZeroes(Node head){
       Node hZero=new Node(-1);
       Node zero=hZero;
       
       Node hnZero=new Node(-1);
       Node nZero=hnZero;
       
       Node curr=head;
       
       while(curr!=null){
           if(curr.data!=0){
               nZero.next=curr;
               nZero=curr;
           }else{
               zero.next=curr;
               zero=curr;
           }
           curr=curr.next;
       }
       nZero.next=null;
       zero.next=hnZero.next;
       return hZero.next;
        
    }
}