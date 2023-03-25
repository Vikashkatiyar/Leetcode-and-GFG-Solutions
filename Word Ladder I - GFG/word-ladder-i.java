//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String[] wordList = new String[n];
            for(int i = 0; i < n; i++){
                wordList[i] = br.readLine().trim();
            }
            String startWord, targetWord;
            startWord = br.readLine().trim();
            targetWord = br.readLine().trim();
            Solution obj = new Solution();
            int ans = obj.wordLadderLength(startWord, targetWord, wordList);
            System.out.println(ans);
       }
    }
}

// } Driver Code Ends


class Solution
{
    class Pair{
        String s;
        int step;
        Pair(String s,int step){
            this.s=s;
            this.step=step;
        }
    }
    public int wordLadderLength(String startWord, String targetWord, String[] wordList)
    {
        HashSet<String> set=new HashSet<>();
        for(String st:wordList){
            set.add(st);
        }
        
        LinkedList<Pair> q=new LinkedList<>();
        q.addLast(new Pair(startWord,1));
        set.remove(startWord);
        
        while(q.size()>0){
            Pair p=q.removeFirst();
            
            String word=p.s;
            int   steps=p.step;
            if(word.equals(targetWord)){
                return steps;
            }
            
            
            for(int i=0;i<word.length();i++){
                for(char ch='a';ch<='z';ch++){
                    char [] replArr=word.toCharArray();
                    replArr[i]=ch;
                    String newStr=new String(replArr);
                    
                    if(set.contains(newStr)){
                        q.addLast(new Pair(newStr,steps+1));
                        set.remove(newStr);
                    }
                }
            }
        }
        
        return 0;
    }
}