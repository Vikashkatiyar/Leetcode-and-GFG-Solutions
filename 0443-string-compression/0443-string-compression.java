class Solution {
    public int compress(char[] chars) {
        
        
        String s=chars[0]+"";
        int count=1;
        
        for(int i=1;i<chars.length;i++){
            char curr=chars[i];
            char prev=chars[i-1];
            if(curr==prev){
                count++;
            }else{
                if(count>1){
                   s+=count;
                    count=1;
                }
                s+=curr;
                
            }
        }
        if(count>1){
            s+=count;
            count=1;
        }
        int n=s.length();
        for(int i=0;i<n;i++){
            chars[i]=s.charAt(i);
        }
        return s.length();
    }
}