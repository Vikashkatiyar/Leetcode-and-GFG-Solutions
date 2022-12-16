//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
	public static void main(String[] args) throws IOException
	{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine().trim());
        while(t-->0)
        {
            String S = br.readLine().trim();
            Solution obj = new Solution();
            List<String> ans = obj.find_permutation(S);
            for( int i = 0; i < ans.size(); i++)
            {
                System.out.print(ans.get(i)+" ");
            }
            System.out.println();
                        
        }
	}
}


// } Driver Code Ends


class Solution {
    public List<String> find_permutation(String s) {
        List<String> list=new ArrayList<>();
        helper(s,"",list);
        Collections.sort(list);
        return list;
    }
    public void helper(String s,String asf,List<String> list){
        if(s.length()==0){
            if(list.contains(asf)==false)
                list.add(asf);
            return;
        }
        
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            String ros=s.substring(0,i)+s.substring(i+1);
            helper(ros,asf+ch,list);
        }
    }
}