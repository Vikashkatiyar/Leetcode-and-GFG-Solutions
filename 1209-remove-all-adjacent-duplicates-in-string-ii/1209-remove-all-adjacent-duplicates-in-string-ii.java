class Solution {
    class Pair{
        char ch;
        int freq;
        Pair(char ch,int freq){
            this.ch=ch;
            this.freq=freq;
            
        }
    }
    public String removeDuplicates(String s, int k) {
        Stack<Pair> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(st.isEmpty() || st.peek().ch!=c){
                st.push(new Pair(c,1));
            }
            else{
                //mathching case
                Pair head=st.pop();
                st.push(new Pair(head.ch,head.freq+1));
                if(st.peek().freq==k){
                    st.pop();
                }
                
            }
        }
        
        String ans ="";
        while(!st.isEmpty()){
            Pair temp=st.pop();
            int count=temp.freq;
            while(count-->0){
                ans=temp.ch+ans;
            }
        }
        return ans;
    }
}