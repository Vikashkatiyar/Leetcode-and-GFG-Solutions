class Solution {
    public long countPairs(int[] nums, int k) {
        //calculate gcd(i)*gcd(j)%k==0
        
        long ans=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        
        for(int num:nums){
            int gcd=findGcd(num,k);
            for(int temp:map.keySet()){
                if((long)gcd*temp%k==0){
                    ans+=map.get(temp);
                }
            }
            map.put(gcd,map.getOrDefault(gcd,0)+1);
        }
        return ans;
    }
    
    public int findGcd(int x,int y){
        if(x<y){
            return findGcd(y,x);
        }
        
        if(y==0){
            return x;
        }else{
            return findGcd(y,x%y);
        }
    }
}