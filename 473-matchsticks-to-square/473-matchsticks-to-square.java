class Solution {
     public boolean makesquare(int[] matchsticks) {
        if( matchsticks.length == 0)
            return false;
        int sum =0;
        for(int num:matchsticks)sum+=num;
        
        if(sum%4!=0)return false;
        
        Arrays.sort(matchsticks);
        
        return dfs(matchsticks,new int[4], matchsticks.length-1,sum/4);
    }
    
    boolean dfs(int[] matchsticks, int sum[], int index,int target){
        if(index == -1)return true;
        
        for(int i=0;i<4;i++){
            if((sum[i] + matchsticks[index]>target) || (i>0 && sum[i] == sum[i-1]))continue;
            
            sum[i]+=matchsticks[index];
            
            if(dfs(matchsticks,sum,index-1,target))return true;
            sum[i]-= matchsticks[index];
        }
        return false;
    }
}