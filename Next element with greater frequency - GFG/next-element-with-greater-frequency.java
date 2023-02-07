//{ Driver Code Starts
import java.util.*;
import java.io.*;

class GFG
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        // int arr[] = new int[10000];
        
        int t = sc.nextInt();
        
        while(t-->0)
        {
            int n = sc.nextInt();
            int arr[]=new int[n];
            for(int i=0; i<n; i++)
            {
                arr[i] = sc.nextInt();
            }
            
            solver x = new solver();
            int res[]=x.print_next_greater_freq(arr,n);
            StringBuffer sb=new StringBuffer("");
            for(int i : res){
                sb.append(i+" ");
            }
            System.out.println(sb);
        }
    }
}

// } Driver Code Ends


class solver
{
    static int[] print_next_greater_freq(int arr[], int n)
    {
        int []freq=new int[10000];
        for(int i:arr){
            freq[i]++;
        }
        
        int []ans=new int[n];
        Stack<Integer> s=new Stack<>();
        for(int i=n-1;i>=0;i--){
            while(s.size()!=0 && freq[arr[i]]>=freq[s.peek()]){
                s.pop();
            }
            
            
            if(s.size()==0){
                ans[i]=-1;
            }else{
                ans[i]=s.peek();
            }
            
            
            s.push(arr[i]);
        }
        
        return ans;
    }
}

