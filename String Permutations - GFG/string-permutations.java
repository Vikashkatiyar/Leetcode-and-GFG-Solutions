//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int T=sc.nextInt();
		sc.nextLine();
		while(T-->0)
		{
		    
		    Solution ob=new Solution();
		    
		    String S=sc.nextLine();
		    
		    ArrayList<String> arr = ob.permutation(S);
		    for(String s : arr){
		        System.out.print(s+" ");
		    }
		    System.out.println();
		}
		
	}
}

// } Driver Code Ends


//User function Template for Java


class Solution
{
    public ArrayList<String> permutation(String S)
    {
        ArrayList<String> ans=new ArrayList<>();
        permutation1(S,"",ans);
        Collections.sort(ans);
        return ans;
    }
    
    public void permutation1(String s,String asf,ArrayList<String> ans){
        if(s.length()==0){
            ans.add(asf);
            return;
        }
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            String ros=s.substring(0,i)+s.substring(i+1);
            permutation1(ros,asf+ch,ans);
        }
    }
	   
}
