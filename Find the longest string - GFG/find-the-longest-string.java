//{ Driver Code Starts
import java.io.*;
import java.util.*;


class StringArray
{
    public static String[] input(BufferedReader br, int n) throws IOException
    {
        String[] s = br.readLine().trim().split(" ");
        return s;
    }

    public static void print(String[] a)
    {
        for(String e : a)
            System.out.print(e + " ");
        System.out.println();
    }

    public static void print(ArrayList<String> a)
    {
        for(String e : a)
            System.out.print(e + " ");
        System.out.println();
    }
}

class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t;
        t = Integer.parseInt(br.readLine());
        while(t-- > 0){
            
            int n;
            n = Integer.parseInt(br.readLine());
            
            
            String[] arr = StringArray.input(br, n);
            
            Solution obj = new Solution();
            String res = obj.longestString(n, arr);
            
            System.out.println(res);
            
        }
    }
}

// } Driver Code Ends


class Solution {
     class Node{
        boolean eow=false;
        Node []children=new Node[26];
    }
     String res="";
    public String longestString(int n, String[] words) {
        Node root=new Node();
         
        //adding words in trie
        for(String word:words){
            Node temp=root;
            for(char ch:word.toCharArray()){
                if(temp.children[ch-'a']==null)
                {
                    temp.children[ch-'a']=new Node();
                }
                temp=temp.children[ch-'a'];
            }
            temp.eow=true;
        }
        
        helper(root,"");
        return  res;
        
    }
    public  void helper(Node root,String asf){
        if(asf.length()>res.length()){ //It handle the lexicographically condn
            res=asf;
        }
        
        
        for(char ch='a';ch<='z';ch++){
            Node child=root.children[ch-'a'];
            if(child!=null && child.eow==true){
                helper(child,asf+ch);
            }
        }
    }
}
        
