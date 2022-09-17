class Solution {
    public int countNicePairs(int[] nums) {
        long MOD = (long)Math.pow(10 , 9)+7;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int diff=nums[i]-rev(nums[i]);
            map.put(diff,map.getOrDefault(diff,0)+1);
        }
        
        long ans=0L;
        for(int key:map.keySet()){
            if(map.get(key)>1){
                int count=map.get(key);
                ans+=(count*(count-1L)/2L)%MOD;  //nc2
            }
        }
        
        return (int)(ans%MOD);
        
    }
    public int rev(int num){
        int res=0;
        while(num>0){
            res=(res*10)+(num%10);
            num/=10;
        }
        return res;
    }
}