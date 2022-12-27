class Solution {
    //This approach is run becoz of the constraint
    //TC->
         // lk<8k  ->   l<8  -> it means highest length of String is 7
         // heighest height of q is 7 and valid node in second level or any level
         //     hence 7^4(s.length()) -> almost 1000*2000=2*10^6 reasnable complexity
     //take this test case for  TC analysis -->> Test Case-> axbcyazbfcxayybc  -:String
                
    public String longestSubsequenceRepeatedK(String s, int k) {
        int []map=new int[26];
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map[ch-'a']++;
        }
        
        ArrayList<Character> valid=new ArrayList<>();
        for(int i=0;i<26;i++){
            if(map[i]>=k){
                valid.add((char)('a'+i));
            }
        }
        
        String ans="";
        LinkedList<String> q=new LinkedList<>();
        q.addLast(ans);
        while(q.size()>0){
            String rem=q.removeFirst();
            for(char ch:valid){
                String next=rem+ch;
                if(isKSub(s,next,k)){
                    q.addLast(next);
                    ans=next;
                }
            }
        }
        return ans;
    }
    
    boolean isKSub(String s,String sub,int k){
        int j=0;
        int rep=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==sub.charAt(j)){
                j++;
                if(j==sub.length()){
                    rep++;
                    j=0;
                    if(rep==k){
                        return true;
                    }
                }
            }
        }
        return false;
    }
}