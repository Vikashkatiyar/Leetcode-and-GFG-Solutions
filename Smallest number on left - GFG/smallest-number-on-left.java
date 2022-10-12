//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
import java.lang.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int n = Integer.parseInt(in.readLine());
            String a1[] = in.readLine().trim().split("\\s+");
            int a[] = new int[n];
            for(int i = 0;i < n;i++)
                a[i] = Integer.parseInt(a1[i]);
            Solution ob = new Solution();
            List<Integer> ans = new ArrayList<Integer>();
            ans = ob.leftSmaller(n, a);
            for(int i = 0;i < n;i++)
                System.out.print(ans.get(i)+" ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


//User function Template for Java
class Solution{
    static List<Integer> leftSmaller(int n, int a[])
    {
        //code here
        ArrayList<Integer> list=new ArrayList<>();
        Stack<Integer> stk=new Stack<>();
        
        for(int i=0;i<n;i++){
            while(!stk.isEmpty() && stk.peek()>=a[i]){
                stk.pop();
            }
            
            if(stk.isEmpty()){
                list.add(-1);
            }else{
                list.add(stk.peek());
            }
            
            stk.push(a[i]);
        }
        return list;
    }
}