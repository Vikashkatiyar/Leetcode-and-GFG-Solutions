//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*; 
class GFG{
    public static void main(String args[]) throws IOException { 
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        
        while(t-- > 0){
            String S = read.readLine().trim();
            Solution ob = new Solution();
            int ans = ob.countSubstring(S);
            System.out.println(ans);
        }
    } 
} 
// } Driver Code Ends


//User function Template for Java
class Solution 
{ 
    // JAi BHOLE
    /*
    str="HeLloWoRld".
    replace each uppercase character with 1 and lower case character with -1.
    So our new string can be represented by array below:
    arr="[ 1, -1, 1, -1, -1, 1, -1, 1, -1, -1 ]"
    Now, any subarray having sum 0 will be having equal number of upper case and lower case characters.
    */
    
    
    int countSubstring(String S) 
    { 
        HashMap<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0;
        int ans=0;
        for(char ch:S.toCharArray()){
            if(Character.isUpperCase(ch)){
                sum+=1;
            }else{
                sum-=1;
            }
            
            if(map.containsKey(sum)){
                ans+=map.get(sum);
            }
            
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return ans;
    }
} 
