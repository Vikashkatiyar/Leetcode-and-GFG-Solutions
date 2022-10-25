//{ Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            
            
            int l=sc.nextInt();
			int r=sc.nextInt();
			Solution ob = new Solution();
			ArrayList<Integer> numbers = ob.uniqueNumbers(l,r);
			for(int num : numbers){
			    System.out.print(num+" ");
			}
			System.out.println();

        }
    }
}

// } Driver Code Ends


class Solution{

    static ArrayList<Integer> uniqueNumbers(int L,int R){
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=L;i<=R;i++){
            String str=i+"";
            HashSet<Character> set=new HashSet<>();
            boolean flag=false;
            for(char ch:str.toCharArray()){
                if(set.contains(ch)){
                    flag=true;
                    break;
                }
                set.add(ch);
            }
            if(flag==false){
                list.add(i);
            }
        }
        return list;
    }
}