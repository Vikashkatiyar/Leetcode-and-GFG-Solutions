//{ Driver Code Starts
import java.util.*;


class Solution
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			Queue g = new Queue();
			
			int q = sc.nextInt();
			while(q>0)
			{
				int QueryType = sc.nextInt();
				if(QueryType == 1)
				{
					int a = sc.nextInt();
					g.enqueue(a);
				}
				else if(QueryType == 2)
				System.out.print(g.dequeue()+" ");
			q--;
			}	
			System.out.println();
				
			
			
		t--;
		}
	}
}


// } Driver Code Ends


class Queue
{
    Stack<Integer> inp = new Stack<Integer>(); 
    Stack<Integer> out = new Stack<Integer>(); 
    
    /*The method pop which return the element poped out of the stack*/
    int dequeue()
    {
	    if(inp.isEmpty())
	       return -1;
	       
	    while(inp.size()!=1){
	        int x=inp.peek();
	        inp.pop();
	        out.push(x);
	    }  
	    int val=inp.pop();
	    while(out.size()!=0){
	        inp.push(out.pop());
	    }
	    return val;
    }
	
    /* The method push to push element into the stack */
    void enqueue(int x)
    {
	    	inp.push(x);
    }
}

