class Solution {
    public int maxScoreWords(String[] words, char[] letters, int[] score) {
        int[] freq=new int[26];
        for(char ch:letters){
            freq[ch-'a']++;
        }
        
        return solve(words,freq,score,0);
    }
    
    public int solve(String[] words,int[] freq,int[] score,int idx){
        if(idx==words.length){
            return 0;
        }
        
        //word not include
        int sNo=0+solve(words,freq,score,idx+1);
        
        //word want include but we check it have suffiecent no of letters/freq
        String word=words[idx];
        boolean flag=true;
        int sword=0;
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            if(freq[ch-'a']==0){
                flag=false;
            }
            
            freq[ch-'a']--;
            sword+=score[ch-'a'];
        }
        int sYes=0;
        if(flag==true){ //word added successfully
            sYes=sword+solve(words,freq,score,idx+1);
        }
        //undo the chages of freq array
        for(int i=0;i<word.length();i++){
            char ch=word.charAt(i);
            freq[ch-'a']++;
        }
        
        return Math.max(sNo,sYes);
    }
}