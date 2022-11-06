//{ Driver Code Starts
import java.util.*;

class GFG
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			int a[] = new int[n];
			for(int i=0; i<n; i++)
				a[i] = sc.nextInt();
			Solution ob = new Solution();
			System.out.println(ob.findMaxDiff(a,n));
		t--;
		}
	}
}
// } Driver Code Ends


class Solution
{
    int findMaxDiff(int a[], int n)
    {
	   int ans=0;
	   int[] ls=nextSmallerToTheLeft(a);
	   int[] rs=nextSmallerToTheRight(a);
	   for(int i=0;i<a.length;i++){
	       int val=Math.abs(ls[i]-rs[i]);
	       ans=Math.max(ans,val);
	   }
	   return ans;
    }
    int[] nextSmallerToTheRight(int []arr){
        int []ans1=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        st.push(0);
        for(int i=1;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                ans1[st.peek()]=arr[i];
                st.pop();
            }
            st.push(i);
        }
        return ans1;
    }
    
    int[] nextSmallerToTheLeft(int []arr){
        int []ans2=new int[arr.length];
        Stack<Integer> st=new Stack<>();
        st.push(arr.length-1);
        for(int i=arr.length-2;i>=0;i--){
            while(!st.isEmpty() && arr[st.peek()]>arr[i]){
                ans2[st.peek()]=arr[i];
                st.pop();
            }
            st.push(i);
        }
        return ans2;
    }
}