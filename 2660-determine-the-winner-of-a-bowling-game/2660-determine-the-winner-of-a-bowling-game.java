class Solution {
    //Jai Baba Bhole
    public int isWinner(int[] p1, int[] p2) {
        int n=p1.length;
        
        int s1=0;
        int ps1=0; //prevScore
        int pps1=0;  //prevPrevScore
        
        int s2=0;
        int ps2=0;
        int pps2=0;
        for(int i=0;i<n;i++){
           s1+=p1[i];
           s2+=p2[i];
            
            ps1=i-1>=0?p1[i-1]:0;
            pps1=i-2>=0?p1[i-2]:0;
            
            ps2=i-1>=0?p2[i-1]:0;
            pps2=i-2>=0?p2[i-2]:0;
            
            if(ps1==10 || pps1==10){
                s1+=p1[i];
            }
            
            if(ps2==10 || pps2==10){
                s2+=p2[i];
            }
        }
        return s1==s2?0:s1>s2?1:2;
    }
}