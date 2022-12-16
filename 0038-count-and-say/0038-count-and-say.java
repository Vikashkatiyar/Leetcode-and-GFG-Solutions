class Solution {
    public String countAndSay(int n) {
        String s="1";
        for(int i=1;i<n;i++){
            s=countAndSayHelp(s);
        }
        return s;
    }
    public String countAndSayHelp(String str){
        String s="";
        char prev=str.charAt(0);
        int count=1;
        for(int i=1;i<str.length();i++){
            
            char curr=str.charAt(i);
            if(curr==prev){
                count++;
            }else{
                s+=count;
                s+=prev;
                prev=curr;
                count=1;
            }
        }
        s+=count;
        s+=prev;
        return s;
        
    }
}