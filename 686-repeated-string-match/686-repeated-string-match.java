class Solution {
    public int repeatedStringMatch(String a, String b) {
        
        StringBuilder sb = new StringBuilder(a);
        int count = 1;
        while (sb.length() < b.length()) {
            sb.append(a);
            count++;
        }
        if (kmpSearch(sb.toString(), b)) {
            return count;
        } else if (kmpSearch(sb.append(a).toString(), b)){
            return count+1;
        }
        else return -1;
    }
    
    public boolean kmpSearch(String txt, String pat) {
        int [] lps=getLPS(pat);
        int i=0;
        int j=0;
        while(i<txt.length() && j<pat.length()){
            if(txt.charAt(i)==pat.charAt(j)){
                i++;
                j++;
               
                
            }else if(j==0){
                i++;
            }else{
                j=lps[j-1];
            }
        }
        if(j == pat.length())
            return true;
        else 
            return false;
    }
    public int[] getLPS(String pat){
        int[] lps=new int[pat.length()];
        int len=0;
        int i=1;
        while(i<pat.length()){
            if(pat.charAt(i)==pat.charAt(len)){
                lps[i]=len+1;
                len++;
                i++;
            }else if(len>0){
                len=lps[len-1];
            }else{
                lps[i]=0;
                len=0;
                i++;
            }
        }
        return lps;
    }
}