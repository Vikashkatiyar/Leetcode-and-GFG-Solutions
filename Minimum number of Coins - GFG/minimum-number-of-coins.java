//{ Driver Code Starts
// Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            int N = Integer.parseInt(in.readLine());
            
            Solution ob = new Solution();
            List<Integer> numbers= new ArrayList<Integer>();
            numbers = ob.minPartition(N);
            for(int i: numbers){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
// } Driver Code Ends


// User function Template for Java

class Solution{
    static List<Integer> minPartition(int n)
    {
        // code here
        TreeSet<Integer> ts=new TreeSet<>();
        ts.add(1);
        ts.add(2);
        ts.add(5);
        ts.add(10);
        ts.add(20);
        ts.add(50);
        ts.add(100);
        ts.add(200);
        ts.add(500);
        ts.add(2000);
        
        ArrayList<Integer> list=new ArrayList<>();
        while(n>0){
            Integer temp=ts.floor(n);
            if(temp!=null){
                n-=temp;
                list.add(temp);
            }
        }
        return list;
        
    }
}