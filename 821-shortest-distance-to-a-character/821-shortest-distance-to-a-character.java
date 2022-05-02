class Solution {
    public int[] shortestToChar(String s, char c) {
        int len=s.length();
        int [] leftarr=new int[len];
        int [] rightarr=new int [len];
        
        Arrays.fill(leftarr,Integer.MAX_VALUE);
        Arrays.fill(rightarr,Integer.MAX_VALUE);
        
        int runval=Integer.MAX_VALUE;
        
        //left to right
        
        for(int i=0;i<len;i++){
            if(s.charAt(i)==c){
                  runval=0;
                leftarr[i]=runval;
            }
            else{
                if(runval!=Integer.MAX_VALUE){
                        runval++;
                    leftarr[i]=runval;
                }
            }
        }
        
        
        //right to left
        
        for(int i=len-1;i>=0;i--){
                if(s.charAt(i)==c){
                                  runval=0;
                                rightarr[i]=runval;
                            }
                            else{
                                if(runval!=Integer.MAX_VALUE){
                                runval++;
                                rightarr[i]=runval;
                    }
                }
        }
        
        int []ans=new int[len];
        for(int i=0;i<len;i++){
            ans[i]=Math.min(leftarr[i],rightarr[i]);
        }
        return ans;

        
    }
}