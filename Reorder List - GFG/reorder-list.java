// { Driver Code Starts
import java.util.*;

class Node {
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}

  public class ReorderList {
    Node head; // head of lisl
    Node last; // last of linked list

    /* Linked list Node*/

    /* Utility functions */

    /* Inserts a new Node at front of the list. */
    public void addToTheLast(Node node) {

        if (head == null) {
            head = node;
            last = head;
        } else {
            // Node temp = head;
            // while (temp.next != null) temp = temp.next;

            last.next = node;
            last = last.next;
        }
    }
    /* Function to print linked list */
    void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    /* Drier program to test above functions */
    public static void main(String args[]) {

        /* Constructed Linked List is 1->2->3->4->5->6->
           7->8->8->9->null */
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t > 0) {
            int n = sc.nextInt();
            ReorderList llist = new ReorderList();

            int a1 = sc.nextInt();
            Node head = new Node(a1);
            llist.addToTheLast(head);
            for (int i = 1; i < n; i++) {
                int a = sc.nextInt();
                llist.addToTheLast(new Node(a));
            }

            llist.head = new gfg().reorderlist(llist.head);

            llist.printList();

            t--;
        }
    }
}// } Driver Code Ends


/* Following is the Linked list node structure */

/*class Node
{
    int data;
    Node next;
    Node(int d) {
        data = d;
        next = null;
    }
}*/

class gfg {
    
    public Node middle(Node head){
        Node slow=head;
        Node fast=head;
        Node prev=null;
        while(fast!=null && fast.next!=null){
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        if(fast==null){
            return prev;
        }
        return slow;
    }
    
    public Node reverse(Node head){
        Node prev=null;
        Node curr=head;
        while(curr!=null){
        Node aHead=curr.next;
            curr.next=prev;
            prev=curr;
            curr=aHead;
        }
        return prev;
    }
    Node reorderlist(Node head) {
         Node mid=middle(head);
        Node second=reverse(mid.next);
        mid.next=null;
        
        Node dummy=new Node(-1);
        Node tail=dummy;
        
        while(head!=null || second!=null){
            if(head!=null){
                tail.next=head;
                tail=head;
                head=head.next;
            }
            if(second!=null){
                tail.next=second;
                tail=second;
                second=second.next;
            }
        }
        tail.next=null;
        head=dummy.next;
        return head;
    }
}
